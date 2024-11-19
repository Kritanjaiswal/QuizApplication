package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{// Here, We are writing code to convert java object into Json Object
    public static void main( String[] args ) throws JsonProcessingException {
        Student student=new Student();
        student.setCity("GKP");
        student.setCourse("JFSD");
        student.setName("Kritan");
        System.out.println(student);
        ObjectMapper objectmapper=new ObjectMapper();  // used to convert java Object to json object for which firstly, we have injected a dependency of objectmapper maven dependency
        String obj=objectmapper.writeValueAsString(student);
        System.out.println( obj);
    }
}
