package com.jsp.spring_core_xml_project.xml.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Student {
public static void main(String[] args) {
      ApplicationContext context =new ClassPathXmlApplicationContext("springjdbc.xml");
      JdbcTemplate templet=context.getBean("jdbc",JdbcTemplate.class);
//      insert data in database
      String insert="Insert into studentdetail(studentId,studentName,studentPhone) value(?,?,?)";
     int result= templet.update(insert,222,"Sankar",111111111);
     System.out.println(+result+" one data is inserted.......");
     
}
}
