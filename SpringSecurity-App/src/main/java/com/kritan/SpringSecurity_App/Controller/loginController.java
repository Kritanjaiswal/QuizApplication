package com.kritan.SpringSecurity_App.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class loginController {
    @GetMapping("/rohit")
    public String name(){
        return "Kritan";
    }
    @GetMapping("/login")
    public String fName(){
        return "Mr Sanjay Jaiswal";
    }
}
