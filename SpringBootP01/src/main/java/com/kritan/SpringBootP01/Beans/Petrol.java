package com.kritan.SpringBootP01.Beans;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements IEngine{
    public Petrol(){
        System.out.println("Petrol Constructor initiated");
    }
    public void start(){
        System.out.println("Petrol Car Started Successfully");
    }
}
