package com.kritan.RestApp.Controller;

import com.kritan.RestApp.Dto.Person;
import com.kritan.RestApp.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController   // it is used to tell spring boot that this is our Controller which handels any request and response
@RequestMapping("api")  // this is the domain name for controller with url="api"
public class TinderController {

    @Autowired
    PersonService personService;  // why we build service class object-> Answer: because we the request coming from browser to controller will transfer to service layer.
    @GetMapping("/getPersons")  // here we are mapping our method "getAllPerson" with @GetMapping with url="/getPersons"
    public List<Person> getAllPerson(){
        List<Person> incomeList=personService.getAllPersonData();
        return personService.getFilteredData(incomeList);
    }

    @PostMapping("/create")
    public String createAccount(@RequestBody Person person){  // @RequestBody use to accept json object and convert it into java object
        return "Registration Done Successfully";
    }
}
