package com.example.studentmanagementapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentManagementAppApplicationTests {

	@Autowired
	StudentService studentService;
	@BeforeEach
	public void prepare(){
		studentService.addStudent(new Student(12,"rajesh12",23,"mca"));
		studentService.addStudent(new Student(13,"rajesh13",23,"mca"));
		studentService.addStudent(new Student(14,"rajesh14",23,"mca"));
	}
@Test
	public void addStudentTest()
	{
		Student student=new Student(22,"rajesh",23,"mca");
		studentService.addStudent(student);


		Student expectedOutput=new Student(22,"rajesh",23,"mca");
		Student actualOutput=studentService.getStudent(22);

		Assertions.assertEquals(expectedOutput.getRegno(),actualOutput.getRegno());
		Assertions.assertEquals(expectedOutput.getName(),actualOutput.getName());
		Assertions.assertEquals(expectedOutput.getAge(),actualOutput.getAge());
		Assertions.assertEquals(expectedOutput.getCourse(),actualOutput.getCourse());

	}
	@Test
	public void getStudentTest(){
		Student expectedOutput=new Student(13,"rajesh13",23,"mca");
		Student actualOutput=studentService.getStudent(13);

		Assertions.assertEquals(expectedOutput.getRegno(),actualOutput.getRegno());
		Assertions.assertEquals(expectedOutput.getName(),actualOutput.getName());
		Assertions.assertEquals(expectedOutput.getAge(),actualOutput.getAge());
		Assertions.assertEquals(expectedOutput.getCourse(),actualOutput.getCourse());

	}


	@Test
	void contextLoads() {
	}

}
