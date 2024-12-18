/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubl.studentwebapp.controller;

import com.ubl.studentwebapp.domain.Student;
import com.ubl.studentwebapp.service.StudentService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author riskiana
 */
@RestController
public class StudentController {
    
    private StudentService StudentService;

    public StudentController(StudentService StudentService) {
        this.StudentService = StudentService;
    }
    
    
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> studentList = StudentService.getAllStudents();
        
        return studentList;
    }
    
}
