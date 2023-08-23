package com.example.studentmanagementapp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
     Map<Integer,Student> db=new HashMap<>();

    public  Student getStudent(int regno) {
        return db.get(regno);
    }

    public  Student getStudentUsingPath(int regno) {
        return db.get(regno);
    }

    public  Student updateAge(int regno, int newAge) {
        db.get(regno).setAge(newAge);
        return db.get(regno);
    }

    public  String deleteFun(int regno) {
        db.remove(regno);
        return "deleted successfully";
    }

    public  void addStudent(Student student) {
        db.put(student.getRegno(),student);
       // return "added successfully";
    }

    public String deleteFunn(int regno) {
        db.remove(regno);
        return "deleted successfully";
    }

    public Student updateByreq(int regno, String newcourse) {
        db.get(regno).setCourse(newcourse);
        return db.get(regno);
    }

    public Student updateByPath(int regno, String newcourse) {
        db.get(regno).setCourse(newcourse);
        return db.get(regno);
    }

    public Student updateByPathandreq(int regno, String newcourse) {
        db.get(regno).setCourse(newcourse);
        return db.get(regno);
    }

    public Student updateCourseAge(int regno, String newcourse, int newAge) {
        db.get(regno).setCourse(newcourse);
        db.get(regno).setAge(newAge);
        return db.get(regno);
    }
}
