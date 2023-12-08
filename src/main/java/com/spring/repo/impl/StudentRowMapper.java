package com.spring.repo.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.spring.entity.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std=new Student();
		std.setStdId(rs.getInt("std_id"));
		std.setStdName(rs.getString("std_name"));
		std.setCountry(rs.getString("country"));
		std.setStdMail(rs.getString("std_mail"));
		std.setStdMob(rs.getLong("std_mob"));
		return std;
	}

}
