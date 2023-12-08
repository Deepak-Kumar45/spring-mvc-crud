package com.spring.service;

import java.util.List;

import com.spring.entity.Student;
import com.spring.entity.StudentDTO;

public interface StudentService {
	
	public List<Student> getAllStudents();

	public void addStudent(StudentDTO stdDto);

	public Student getStudent(int id);

	public void updateStudent(StudentDTO stdDto);
	
	public void deleteStudent(int id);
}
