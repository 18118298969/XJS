package com.zb.consumer.controller;

import com.zb.consumer.service.ClientService;
import com.zb.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import java.util.List;
import java.util.Map;

@Controller
public class ClientController {

//    @Autowired
//    ClientService clientService;

    @Autowired
    ServletContext servletContext;

    @Autowired
    UserService userService;

    @RequestMapping("/shopping")
    public String buy(){
        return userService.hello();
    }

    @RequestMapping("/search")
    public String search(Model model,@RequestParam Map map){
        System.out.println("search:"+map);
        model.addAttribute("users",userService.list(map));
        return "list";
    }


    @RequestMapping("/save")
    public String save(@RequestParam Map map){
        System.out.println("save:"+map);
        userService.save(map);
        return "redirect:search";
    }

    @RequestMapping("/new")
    public String add(){
        return "new";
    }

    @PostConstruct
    public void getAllRoles(){
        System.out.println("获取所有角色");
        List<Map> roles = userService.getAllRoles();
        System.out.println(roles);
        servletContext.setAttribute("roles",roles);
    }


}
