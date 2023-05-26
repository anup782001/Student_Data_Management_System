package com.anup.sms.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anup.sms.entities.Student;
import com.anup.sms.repository.StudentRepository;
import com.anup.sms.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository ;
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}




	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}




	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	

}
