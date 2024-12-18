package com.ubl.studentwebapp.service;

import com.ubl.studentwebapp.domain.Student;
import com.ubl.studentwebapp.repository.StudentEntity;
import com.ubl.studentwebapp.repository.StudentRepository;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author riskiana
 */
@Service
public class StudentService {
    
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    public List<Student> getAllStudents(){
        List<StudentEntity> studentList = studentRepository.findAll();
        return studentList.stream()
                .map(entity -> map(entity))
                .toList();
    }

    private Student map(StudentEntity entity) {
        Student student = new Student();
        student.setNim(entity.getNim());
        student.setFullName(entity.getFullName());
        student.setAddress(entity.getAddress());
        return student;
        
    }
    
}
