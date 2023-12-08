package com.spring.repo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.entity.Student;
import com.spring.entity.StudentDTO;
import com.spring.repo.StudentRepo;

@Repository
public class StudentRepoImpl implements StudentRepo{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Student> getAllStudents() {
		String query="select * from student_table";
		List<Student> list=template.query(query, new StudentRowMapper());
		return list;
	}

	@Override
	public void addStudent(Student std) {
//		Method-1
		Object[] objects= {std.getStdName(),std.getCountry(),std.getStdMail(),std.getStdMob()};
		String query="insert into student_table(std_name,country,std_mail,std_mob,lastmodified) values(?,?,?,?,now())";
		int update = template.update(query, objects);
		System.out.println(update+" records inserted successfully.");
//		Method-2
//		String qs=String.format("insert into student_table(std_name,country,std_mail,std_mob) values('%s','%s','%s',%s)", 
//											std.getStdName(),std.getCountry(),std.getStdMail(),std.getStdMob());
//		int rows=template.update(qs);
//		System.out.println(rows+" records updated successfully.");
	}

	@Override
	public Student getStudent(int id) {
		String query="select * from student_table where std_id=?";
		Student std=template.queryForObject(query, new StudentRowMapper(),id);
		return std;
	}

	@Override
	public void updateStudent(Student std) {
		String query="update student_table set std_name=?,std_mail=?,std_mob=?,country=?,lastmodified=? where std_id=?";
		int update = template.update(query, std.getStdName(),std.getStdMail(),std.getStdMob(),std.getCountry(),std.getLastmodified(),std.getStdId());
		System.out.println(update +" rows updated..");
		
	}

	@Override
	public void deleteStudent(int id) {
		String query="delete from student_table where std_id=?";
		int i = template.update(query,id);
		System.out.println(i+" data has been deleted");
		
	}

}
