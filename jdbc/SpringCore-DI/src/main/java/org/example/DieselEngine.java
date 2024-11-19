package org.example;

public class DieselEngine implements IEngine{
    public DieselEngine(){
        System.out.println("Diesel Engine Started");
    }
    @Override
    public int start() {
        System.out.println("Diesel Engine Started");
        return 1;
    }
}
