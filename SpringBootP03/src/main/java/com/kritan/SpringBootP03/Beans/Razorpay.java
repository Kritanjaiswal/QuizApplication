package com.kritan.SpringBootP03.Beans;

import org.springframework.stereotype.Component;

@Component
public class Razorpay implements Partners{
    public Razorpay(){
        System.out.println("Razorpay Constructor Called");
    }
    @Override
    public void payment() {
        System.out.println("Payment done By Razorpay");
    }
}
