package com.revature.studentservice.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.studentservice.model.Student;
import com.revature.studentservice.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private Environment environment;
	

	@GetMapping(value="/students",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Student> listAllStudents() {
		
		List<Student> findAllStudents = studentRepository.findAll();
		
		return findAllStudents;
	}
	
	@GetMapping(value="/students/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Student findByStudentId(@PathVariable Long id) throws Exception
	{
		Optional<Student> findStudentById = studentRepository.findById(id);
		if(!findStudentById.isPresent()) {
			throw new Exception("Student not found");	
		}
		
		Student student=findStudentById.get();
		student.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return student;
		
	}
}


