package com.jsp.spring_core_xml_project.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddDriver {
	public static void main(String[] args) {
		BeanFactory bf=new ClassPathXmlApplicationContext("myspring.xml");
		Add add=(Add)bf.getBean("add");
		System.out.println(add.add(1844, 12));
//		Add a=new Add();
//		System.out.println(a.add(234, 343));
	}

}
