package com.jsp.spring_jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jsp.spring_jdbc.dto.Student;

public class RowMapperImple implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st=new Student();
		st.setStudentId(rs.getInt(1));
		st.setStudentName(rs.getString(2));
		st.setStudentPhone(rs.getLong(3));
		return st;
	}
	

}
