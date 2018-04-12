package com.revature.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.studentservice.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
	

}
