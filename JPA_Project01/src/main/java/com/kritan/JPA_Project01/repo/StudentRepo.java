package com.kritan.JPA_Project01.repo;

import com.kritan.JPA_Project01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // it is used so that spring boot will automatically give implementation of it
public interface StudentRepo extends JpaRepository<Student, Integer> {  // here Student is table name and Integer is data type of primary key in table
}
