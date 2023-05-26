package com.anup.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anup.sms.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
