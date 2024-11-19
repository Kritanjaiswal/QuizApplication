package com.kritan.SpringBootP01.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {  // target class where we need to inject dependency of petrol object for which firsly we should convert into spring beans usin @Component
    @Autowired
    Petrol petrol;
    public Car(){
        System.out.println("Car Constructor initialised");
    }
    public void m1(){
        petrol.start();
    }
}
