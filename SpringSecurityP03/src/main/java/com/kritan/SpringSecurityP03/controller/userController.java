package com.kritan.SpringSecurityP03.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kritan")
public class userController {

    @GetMapping("/admin")
    public String adminKaMethod(){
        return "Mai Admin Hu";
    }

    @GetMapping("/user")
    public String userKaMethod(){
        return "Mai user ya admin hu";
    }
}
