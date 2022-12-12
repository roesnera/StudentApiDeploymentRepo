package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Iterable<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void save(Student student) {
        studentRepository.save(student);
    }
}
