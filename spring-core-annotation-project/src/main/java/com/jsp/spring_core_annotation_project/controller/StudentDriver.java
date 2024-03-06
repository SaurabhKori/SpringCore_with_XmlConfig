package com.jsp.spring_core_annotation_project.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_annotation_project.dto.Address;
import com.jsp.spring_core_annotation_project.dto.Student;

public class StudentDriver {
	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(Student.class,Address.class);
		
		Student s=(Student)a.getBean("a");
		
		System.out.println(s);
	}

}
