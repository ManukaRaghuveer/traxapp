package com.studentdb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.studentdb.entity.Student;
import com.studentdb.repository.StudentRepository;

@SpringBootTest
class StudentdbApplicationTests {
  
	@Autowired
	private StudentRepository studentRepo;
	
	
	@Test
	void saveoneStudent() {
		Student s1= new Student();
		s1.setName("smith");
		s1.setCourse("tester");
		s1.setFee(10000);
		studentRepo.save(s1);
	}
	
	@Test
	void deleteoneStudent() {
		studentRepo.deleteById(1L);
	}

}
