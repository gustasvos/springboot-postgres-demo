package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// first parameter is which type of object this repo will work with
// second is the ID for the type
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
