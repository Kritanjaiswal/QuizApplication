package com.kritan.SpringBootP03.Beans;

import org.springframework.stereotype.Component;

@Component
public class Juspay implements Partners{
    public Juspay(){
        System.out.println("Juspay Constructor Called");
    }
    @Override
    public void payment() {
        System.out.println("Payment done by Juspay");
    }
}
