package com.jsp.spring_jdbc.dto;

import org.springframework.beans.factory.annotation.Value;

public class Student {
//	@Value("555")
	private int studentId;
//	@Value("RAj")
	private String studentName;
	@Value("9233221")
	private long studentPhone;
	
	public Student() {
		
	}

	public Student(int studentId, String studentName, long studentPhone) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
	}

	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId( int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName( String studentName) {
		this.studentName = studentName;
	}
	public long getStudentPhone() {
		return studentPhone;
	}
	
	public void setStudentPhone( long studentPhone) {
		this.studentPhone = studentPhone;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ "]";
	}

}
