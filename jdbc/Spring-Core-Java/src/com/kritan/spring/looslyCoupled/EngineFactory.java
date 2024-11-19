package com.kritan.spring.looslyCoupled;

public class EngineFactory {
    public IEngine getInstance(String engineName){
        if(engineName.equals("petrol")){
            return new PetrolEngine();
        }else return new DieselEngine();
    }
}
