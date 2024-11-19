package org.example;

public class PetroEngine implements IEngine{
    public PetroEngine(){
        System.out.println("Petrol constructor Started");
    }
    @Override
    public int start() {
        System.out.println("Petrol Engine Started");
        return 1;
    }
}
