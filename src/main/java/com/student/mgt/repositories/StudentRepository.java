package com.student.mgt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.mgt.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	Optional<Student> findByEmail(String email);
	
}
