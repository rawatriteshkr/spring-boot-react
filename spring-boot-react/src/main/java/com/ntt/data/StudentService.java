package com.ntt.data;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public Student createStudent(Student student) {
		return studentDao.save(student);
	}

	public Optional<Student> getStudentById(Long studentId) {
		return studentDao.findById(studentId);
	}

	public Iterable<Student> getAllStudents() {
		return studentDao.findAll();
	}

}
