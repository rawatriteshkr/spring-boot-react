package com.ntt.data;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/studentinfo")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/create")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@CrossOrigin(origins = {"http://localhost:3000"})
	@GetMapping(value="/student/{studentId}")
	public Optional<Student> getStudentById(@PathVariable("studentId")Long studentId){
		return studentService.getStudentById(studentId);
	}
	
	@CrossOrigin(origins = {"http://localhost:3000"})
	@GetMapping(value="/student/allstudents")
	public Iterable<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
}
