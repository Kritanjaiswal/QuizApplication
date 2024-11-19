package com.kritan.spring.DI;

import com.kritan.spring.looslyCoupled.IEngine;

public class CarDi {
    private IEngine engine;
//    public CarDi(IEngine engine){
//        this.engine=engine;
//    }

//    public void setEngine(IEngine engine) {
//        this.engine = engine;
//    }

    public void drive(){
        int start=engine.start();
        if(start>=1){
            System.out.println("Engine getting Started");
        }else{
            System.out.println("Engine in Trouble");
        }
    }
}
