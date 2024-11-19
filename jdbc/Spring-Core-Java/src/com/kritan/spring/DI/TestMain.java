package com.kritan.spring.DI;

import com.kritan.spring.looslyCoupled.DieselEngine;
import com.kritan.spring.looslyCoupled.PetrolEngine;

import java.lang.reflect.Field;

public class TestMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
//        CarDi car=new CarDi(new PetrolEngine());   constructro dependency injection
//        CarDi car=new CarDi();
//        car.setEngine(new DieselEngine());    Setter method of injecting dependency
//        car.drive();
        Class<?> aClass=Class.forName("com.kritan.spring.DI.CarDi");  // reflection api method to insert dependency
        Field field=aClass.getDeclaredField("engine"); // engine naam ke private variable ko leke aata hai
        field.setAccessible(true); // jo private variable field me aaya hai use access karne ke lie true karte hai
        Object a=aClass.newInstance();// object type ka CarDi ka object lata hai
        CarDi car=(CarDi) a;// yaha ham use CarDi ke type me typecast karte hai
        field.set(car, new PetrolEngine());//yaha hme jis class me set karna hota hai wo aur uske private variable me jis object ko set karna hai wo likhte hai
        car.drive();
    }
}
