package com.spring.repo;

import java.util.List;

import com.spring.entity.Student;

public interface StudentRepo {
	
	public List<Student> getAllStudents();
	
	public void addStudent(Student std);

	public Student getStudent(int id);

	public void updateStudent(Student std);
	
	public void deleteStudent(int id);
}
