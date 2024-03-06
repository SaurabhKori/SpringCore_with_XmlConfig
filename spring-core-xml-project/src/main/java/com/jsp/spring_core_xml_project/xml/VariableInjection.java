package com.jsp.spring_core_xml_project.xml;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component(value="aa")

public class VariableInjection {
	@Value(value="22")
	int a;
	@Value(value="33")
	int b;
	public void add() {
		System.out.println(a+b);
	}

}
