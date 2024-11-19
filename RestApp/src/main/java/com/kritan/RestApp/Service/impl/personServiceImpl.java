package com.kritan.RestApp.Service.impl;

import com.kritan.RestApp.Dto.Person;
import com.kritan.RestApp.Service.PersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class personServiceImpl implements PersonService {
    Person Kritan=new Person("Kritan", "GKP", "M", 22, "BTech");
    Person Rohit=new Person("Rohit", "GKP", "M", 23, "BPharm");
    Person Neha=new Person("Neha", "Gaunar", "F", 21, "Teacher");
    Person Anshika=new Person("Anshika", "GKP", "F", 19, "IAS");
    Person Gargi=new Person("Gargi", "SLNP", "F", 20, "Advocate");
    List<Person> lst=new ArrayList<>();
    @Override
    public List<Person> getAllPersonData() {
        lst.add(Kritan);
        lst.add(Rohit);
        lst.add(Neha);
        lst.add(Anshika);
        lst.add(Gargi);
        return lst;
    }


    @Value("${user.gender}")
    String gender;
    @Override
    public List<Person> getFilteredData(List<Person> lst) {
        List<Person> lst2=new ArrayList<>();
        for(Person p: lst){
            if(!gender.equalsIgnoreCase(p.getGender())) {
                lst2.add(p);
            }
        }
        return lst2;
    }
}
