package com.kritan.SpringBootP03.Beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  // we prioritize the class paytm for DI
public class Paytm implements Partners{
    public Paytm(){
        System.out.println("Paytm Constructor Called");
    }
    @Override
    public void payment() {
        System.out.println("Payment done by Paytm");
    }
}
