package com.kritan.SpringBootP01.Beans;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements IEngine{
    public Diesel(){

        System.out.println("Diesel Constructor initiated");
    }
    public void start(){

        System.out.println("Petrol Car Started Successfully");
    }
}
