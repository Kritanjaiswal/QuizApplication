package com.kritan.spring.looslyCoupled;

public class DieselEngine implements IEngine{
    @Override
    public int start() {
        System.out.println("Diesel engine started");
        return 1;
    }
}
