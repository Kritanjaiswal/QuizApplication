package com.kritan.spring.looslyCoupled;

public class PetrolEngine implements IEngine{
    @Override
    public int start() {
        System.out.println("petrol engine started");
        return 1;
    }
}
