package com.kritan.spring.normal;

public class Car1 extends Engine {
    public Car1(String model){
        super(model);
    }
    int start=super.start();
    public void drive(){
        if(start>=1){
            System.out.println("Engine Started");
        }
    }
}
