package com.jsp.spring_jdbcwithannotation_config.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jsp.spring_jdbcwithannotation_config.dto.Student;

public class StudentDao {
	private JdbcTemplate tem;
    public void insert(Student student) {
    	String insert ="insert into studentdetail(studentId,studentName,studentPhone) value(?,?,?)";
    	this.tem.update(insert,student.getStudentId(),student.getStudentName(),student.getStudentPhone());
    	System.out.println("Data is inserted");
    }
    public void update(Student student) {
    	String update ="update  studentdetail set studentName=?,studentPhone=? where studentId=?";
    	this.tem.update(update,student.getStudentName(),student.getStudentPhone(),student.getStudentId());
    	System.out.println("Data is updated............");
    }
    public void delete(int id) {
    	String delete="delete from studentdetail where studentId=?";
    	this.tem.update(delete,id);
    	System.out.println(+id+"  data is deleted.......");
    }
    public Student fetchOnedata(int id) {
    	String fetch="select * from studentdetail where studentId=?";
    	RowMapper<Student> rowmap=new RowMapperImpe();
    return	this.tem.queryForObject(fetch, rowmap,id);
    
    }
    public List<Student> fetchAlldata() {
    	String fetch="select * from studentdetail";
    	RowMapper<Student> rowmap=new RowMapperImpe();
    	return this.tem.query(fetch, rowmap);
    }
	public JdbcTemplate getTem() {
		return tem;
	}

	public void setTem(JdbcTemplate tem) {
		this.tem = tem;
	}

	@Override
	public String toString() {
		return "StudentDao [tem=" + tem + "]";
	}
	

}
