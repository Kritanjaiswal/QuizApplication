package com.kritan.SpringSecurityP02_Role_Base_Auth.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class Test {

    @GetMapping("/contact")
    public String getContact(){
        return "Contact Successful";
    }

    @GetMapping("/update")
    public String getUpdate(){
        return "HDFC provides free interest Loan";
    }

    @GetMapping("/checkBalance")
    public String checkBalance(){
        return "100000";
    }

    @GetMapping("/transfer")
    public String transfer(){
        return "Transfer Successful";
    }
}
