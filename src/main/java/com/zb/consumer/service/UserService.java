package com.zb.consumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

//@FeignClient(value = "SERVICE-PROVIDER", fallback = HystrixService.class)
@FeignClient(value = "SERVICE-PROVIDER")
public interface UserService {
    @RequestMapping("/hi")
    public String hello();

    @RequestMapping("list")
    public List<Map> list(@RequestParam Map map);

    @RequestMapping("/save")
    public int save(@RequestParam Map map);

    @RequestMapping("/getAllRoles")
    public List<Map> getAllRoles();
}

