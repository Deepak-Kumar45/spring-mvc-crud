package com.spring.service.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Student;
import com.spring.entity.StudentDTO;
import com.spring.repo.StudentRepo;
import com.spring.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo repo;
	
	@Override
	public List<Student> getAllStudents() {
		return repo.getAllStudents();
	}

	@Override
	public void addStudent(StudentDTO stdDto) {
		if(stdDto.getFakeCountry().equalsIgnoreCase("india")) {
			System.out.println("\n\t!!..Welcome to india..!!");
		}
		Student std=new Student();
		std.setCountry(stdDto.getFakeCountry());
		std.setStdName(stdDto.getFakeName());
		std.setStdMail(stdDto.getFakeMail());
		std.setStdMob(stdDto.getFakeMob());
		repo.addStudent(std);
	}

	@Override
	public Student getStudent(int id) {
		return repo.getStudent(id);
	}

	@Override
	public void updateStudent(StudentDTO stdDto) {
		Student std=new Student();
		std.setStdId(stdDto.getFakeId());
		std.setCountry(stdDto.getFakeCountry());
		std.setStdName(stdDto.getFakeName());
		std.setStdMail(stdDto.getFakeMail());
		std.setStdMob(stdDto.getFakeMob());
		std.setLastmodified(new Date());
		repo.updateStudent(std);
	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteStudent(id);
	}


}
