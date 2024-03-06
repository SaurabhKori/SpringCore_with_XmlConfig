package com.jsp.spring_core_xml_project.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	public static void main(String[] args) {
		BeanFactory bf=new ClassPathXmlApplicationContext("myconstructer.xml");
		Student stu=(Student)bf.getBean("myconst");
		System.out.println(stu);
	}

}
