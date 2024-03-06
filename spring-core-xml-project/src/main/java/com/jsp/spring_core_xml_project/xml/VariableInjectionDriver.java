package com.jsp.spring_core_xml_project.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.spring_core_xml_project.anotation.AnnotationConfig;

public class VariableInjectionDriver {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("variableInjection.xml");
//		ApplicationContext a=new AnnotationConfigApplicationContext(AnnotationConfig.class);
//		AnnotationConfig v=(AnnotationConfig)a.getBean("a")
//		v.add();
		VariableInjection v=(VariableInjection)c.getBean("a");
		v.add();
		
	}

}
