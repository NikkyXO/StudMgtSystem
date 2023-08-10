package com.student.mgt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.mgt.entities.Student;
import com.student.mgt.repositories.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentrepository;

	@Override
	public void run(String... args) throws Exception {
//		Student Student1 = new Student(1L, "Femi", "Agbala", "Abgbala@gmail.com");
//		studentrepository.save(Student1);
//		
//		Student Student2 = new Student(2L, "Tomi", "Agbala", "tomi@gmail.com");
//		studentrepository.save(Student2); 
//		
//		Student Student3 = new Student(3L, "Tonny", "Stark", "tonny@gmail.com");
//		studentrepository.save(Student3); 
	}
	
	
	

}
