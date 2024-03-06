package com.jsp.spring_core_xml_project.xml;

public class Student {
	int id;
	String name;
	long phone;
	public Student(int id, String name, long phone) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	

}
