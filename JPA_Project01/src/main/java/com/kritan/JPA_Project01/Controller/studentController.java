package com.kritan.JPA_Project01.Controller;

import com.kritan.JPA_Project01.Service.StudentService;
import com.kritan.JPA_Project01.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500/RestApp/QUIZ-APP-UI/Quiz-app/ConsumeApi/index.html")  // @ CrossOrigin is used to communicate with other systems running on different domains or port here it is communicating with ore front part
@RestController  // used to tell spring boot that this is our Controller
@RequestMapping("/abc")
public class studentController {
    @Autowired
    StudentService service;

    @PostMapping("/def") //endPoints
    public Student createStudent(@RequestBody Student student){   // we are using @RequestBody to convert the incoming json object into java object

        return service.saveStudent(student);
    }

    @GetMapping("/all") //endPoints
    public List<Student> getAll(){

        return service.getAllStudent();
    }

//    @GetMapping("/{id}")
//    public Student getStudentbyid(@PathVariable Integer id){  // ye id aur annotation wale id ka naam same hona chahiye
//        return service.getStudentById(id);
//    }

    @GetMapping    //endPoints
    public Student getStudentbyid(@RequestParam Integer id, @RequestParam String name){  // one more method to hold variable by using @RequestParam where you dont need to bind method with any url
        return service.getStudentById(id);
    }

    @PutMapping("/{id}")    //endPoints
    public Student updateStudentById(@PathVariable Integer id, @RequestBody Student student){
        return service.updateById(id, student);
    }

    @DeleteMapping("/my")   //endPoints
    public void deleteStudentById(@RequestBody Student student){
        service.deleteByObject(student);
    }


}
