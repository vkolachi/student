package com.example.studentmanagementapp;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {
   @Autowired
   StudentService studentService;
    public Logger log= LoggerFactory.getLogger(StudentController.class);
    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regno){

        System.out.println("service bean is called in contraooler"+studentService);
        return studentService.getStudent(regno);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
//        log.trace("this is info log");
//        log.debug("this is debug log");
        log.info("this is info log");
        log.warn("this is warn log"        );
        log.error("this is error log");
        System.out.println("service bean is called in contraooler"+studentService);
       return studentService.addStudent(student);


    }
    @GetMapping("/getByPath/{id}")
    public ResponseEntity getStudentUsingPath(@PathVariable("id") int regno){
        Student student=studentService.getStudentUsingPath(regno);
        if(student==null){
            return new ResponseEntity("id doesnt exists", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(student,HttpStatus.FOUND);

    }
    @PutMapping("/updateage/{id}")
    public Student updateAge(@PathVariable("id") int regno,@RequestParam("age") int newAge){
        return studentService.updateAge(regno,newAge);

    }
    @DeleteMapping("/delete")
    public String deleteFun(@RequestParam("a") int regno){
        return studentService.deleteFun(regno);

    }
    @DeleteMapping("/delete/{id}")
    public String deleteFunn(@PathVariable("id") int regno){
        return studentService.deleteFunn(regno);

    }
    @PutMapping("/putt")
    public Student updateByreq(@RequestParam("c") int regno,@RequestParam("d") String newcourse){
        return studentService.updateByreq(regno,newcourse);

    }
    @PutMapping("/puttt/{c}/{d}")
    public Student updateByPath(@PathVariable("c") int regno,@PathVariable("d") String newcourse){
        return studentService.updateByPath(regno,newcourse);

    }
    @PutMapping("/puot/{c}")
    public Student updateByPathandreq(@PathVariable("c") int regno,@RequestParam("d") String newcourse){
        return studentService.updateByPathandreq(regno,newcourse);

    }
    @PutMapping("/oput")
    public Student updateCourseAge(@RequestParam("c") int regno,@RequestParam("d") String newcourse,@RequestParam("e") int newAge){
        return studentService.updateCourseAge(regno,newcourse,newAge);

    }



}
