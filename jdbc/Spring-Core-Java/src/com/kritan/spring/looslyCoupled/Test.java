package com.kritan.spring.looslyCoupled;

public class Test {
    public static void main(String[] args) {
        EngineFactory enginefactory=new EngineFactory();
        Car car=new Car(enginefactory.getInstance("petrol"));
        car.drive();
    }
}
