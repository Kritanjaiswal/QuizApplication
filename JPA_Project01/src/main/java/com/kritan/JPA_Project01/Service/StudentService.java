package com.kritan.JPA_Project01.Service;

import com.kritan.JPA_Project01.entity.Student;
import com.kritan.JPA_Project01.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service  // used to let the spring boot knows that this is a service layer and convert it into spring bean
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }
    public List<Student> getAllStudent(){
        List<Student> lst=studentRepo.findAll();
        return lst;
    }

    public Student getStudentById(Integer id){
        Optional<Student> byId=studentRepo.findById(id);
        Student student=byId.get();// student ka object mil jaega
        return student;
    }

    public Student updateById(Integer id, Student student){
        Optional<Student> byId=studentRepo.findById(id);
        Student prestudent=byId.get();
        prestudent.setAge(student.getAge());
        prestudent.setEmail(student.getEmail());
        prestudent.setName(student.getName());
        Student rStudent=studentRepo.save(prestudent);
        return rStudent;
    }

    public void deleteByObject(Student student){
        studentRepo.delete(student);
    }
}
