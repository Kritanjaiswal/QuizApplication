package com.kritan.spring.looslyCoupled;

public class Car{
    IEngine engine;
    public Car(IEngine engine){
        this.engine=engine;
    }
    public void drive(){
        int start=engine.start();
        if(start>=1){
            System.out.println("Engine getting Started");
        }else{
            System.out.println("Engine in Trouble");
        }
    }
}
