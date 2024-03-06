package com.jsp.spring_core_xml_project.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDriver {
 public static void main(String[] args) {
	BeanFactory bf=new ClassPathXmlApplicationContext("setterInjection.xml");
	User u=(User)bf.getBean("set");
	System.out.println(u.getId());
	System.out.println(u.getName());
	System.out.println(u.getPhone());
	
}
}
