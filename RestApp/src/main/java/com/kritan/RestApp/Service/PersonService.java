package com.kritan.RestApp.Service;

import com.kritan.RestApp.Dto.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPersonData();
    List<Person> getFilteredData(List<Person> l);
}
