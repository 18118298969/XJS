package com.zb.consumer.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public class HystrixService implements UserService{
    @Override
    public String hello(){
        return null;
    }
    @Override
    public List<Map> list(Map map){
        System.out.println("HystrixService is working...");
        return null;
    }

    @Override
    public int save(Map map) {
        return 0;
    }

    @Override
    public List<Map> getAllRoles() {
        return null;
    }
}

