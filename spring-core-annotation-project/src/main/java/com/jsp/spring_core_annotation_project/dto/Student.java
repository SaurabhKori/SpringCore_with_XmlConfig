package com.jsp.spring_core_annotation_project.dto;
//Constructer injection with annotation

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="a")
public class Student {
  private int id;
  private String name;
  private String email;
  private long phone;
  @Autowired
  
  private Address address;
public Student(@Value(value="122") int id,@Value(value="Saurabh") String name,@Value(value="saurabh@gmail.com") String email,@Value(value="78777785") long phone) {
	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "Address"+address +"]";
}
   

}
