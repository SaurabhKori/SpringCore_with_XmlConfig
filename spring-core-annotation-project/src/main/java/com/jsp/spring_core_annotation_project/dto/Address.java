package com.jsp.spring_core_annotation_project.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Uttar Pradesh")
private String state;
	@Value("Pratapgarh")
private String city;
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}
	

}
