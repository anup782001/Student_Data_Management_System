package com.anup.sms.services;

import java.util.List;
import com.anup.sms.entities.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student) ;
	Student getStudentById(Long id) ;
	Student updateStudent(Student student);
		
	
		
	
}
