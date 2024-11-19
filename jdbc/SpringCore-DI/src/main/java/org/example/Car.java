package org.example;

public class Car {
    IEngine engine;
    public Car(){
        System.out.println("Car Constructor Called");
    }
    public Car(IEngine engine){
        System.out.println("Car parametric Constructor Called");
        this.engine=engine;
    }
    public void setEngine(IEngine engine) {
        System.out.println("IEngine setter activated");
        this.engine = engine;
    }
    void drive(){
        int start=engine.start();
        if(start>0){
            System.out.println("Engine Started Succesfully");
        }else{
            System.out.println("Engine is in Some Trouble");
        }
    }
}
