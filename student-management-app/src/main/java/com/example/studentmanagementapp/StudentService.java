package com.example.studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public  String addStudent(Student student) {
        System.out.println("repo called in service"+studentRepository);
        studentRepository.addStudent(student);
        return "Student added successfully";


    }


    public Student getStudent(int regno) {
        System.out.println("repo called in service"+studentRepository);
        return studentRepository.getStudent(regno);
    }

    public Student getStudentUsingPath(int regno) {
        return studentRepository.getStudentUsingPath(regno);

    }

    public Student updateAge(int regno, int newAge) {
        return studentRepository.updateAge(regno,newAge);
    }

    public String deleteFun(int regno) {
        return studentRepository.deleteFun(regno);
    }

    public String deleteFunn(int regno) {
        return studentRepository.deleteFunn(regno);
    }

    public Student updateByreq(int regno, String newcourse) {
        return studentRepository.updateByreq(regno,newcourse);
    }

    public Student updateByPath(int regno, String newcourse) {
        return studentRepository.updateByPath(regno,newcourse);
    }

    public Student updateByPathandreq(int regno, String newcourse) {
        return studentRepository.updateByPathandreq(regno,newcourse);
    }

    public Student updateCourseAge(int regno, String newcourse, int newAge) {
        return studentRepository.updateCourseAge(regno,newcourse,newAge);
    }
}

