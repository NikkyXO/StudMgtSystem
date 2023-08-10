package com.student.mgt.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.student.mgt.entities.Student;
import com.student.mgt.repositories.StudentRepository;
import com.student.mgt.services.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService  {

	
	private final StudentRepository studentRepository;
	
	@Override
	public Optional<Student> findByEmail(String email) {
//		studentRepository.findOne(email);
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();

	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);

	}

	@Override
	public Student getStudentById(Long id) {

		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student) ;
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}
	

}
