package com.jsp.spring_core_xml_project.anotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(value="com.jsp.spring_core_xml_project.anotation")
@Component(value="a")
public class AnnotationConfig {
	@Value(value="122")
	int a;
	@Value(value="23")
	int b;
	public void add() {
		System.out.println(a+b);
	}

}
