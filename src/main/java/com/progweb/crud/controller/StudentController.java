package com.progweb.crud.controller;

import com.progweb.crud.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

    @GetMapping
    public List<Student> listAll() {
        Student student = new Student();
        student.setId(1L);
        student.setName("John");
        student.setRegisterNumber("123456");
        student.setCourse("Java");
        student.setRegisterDate(LocalDate.now());

        Student student2 = Student
                .builder()
                .id(2L)
                .name("Peter")
                .course("Java")
                .registerNumber("55477")
                .registerDate(LocalDate.now())
                .build();

        List<Student> students = Arrays.asList(student, student2);

        return students;
    }
}
