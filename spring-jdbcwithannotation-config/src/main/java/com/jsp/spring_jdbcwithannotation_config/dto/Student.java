package com.jsp.spring_jdbcwithannotation_config.dto;

public class Student {
	private int studentId;
	private String studentName;
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
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public long getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ "]";
	}
	

}
