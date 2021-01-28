package com.ntt.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringBootReactApplication implements CommandLineRunner{

	@Autowired
	private DataSource dataSource;
	@Autowired
	private StudentService studentService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setFirstName("Ritesh");
		student.setLastName("Rawat");
		student.setAge(27);
		student.setCity("New Delhi");
		
		Student savedStudent = studentService.createStudent(student);
		System.out.println("Student Id : "+savedStudent.getId());
		System.out.println("DataSource "+dataSource.getClass());
	}
}
