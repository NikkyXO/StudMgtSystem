package com.student.mgt.services;

import java.util.List;
import java.util.Optional;

import com.student.mgt.entities.Student;

public interface StudentService {
	
	Optional<Student> findByEmail(String email);
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
