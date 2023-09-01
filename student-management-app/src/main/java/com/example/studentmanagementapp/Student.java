package com.example.studentmanagementapp;

import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;

public class Student {
    private int regno;
    private String name;
    private int age;
    private String course;
//    private Month monthofbirth=Month.JAN;


    public Student() {
    }

    public Student(int regno, String name, int age, String course) {
        this.regno = regno;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regno=" + regno +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}
