package com.jsp.spring_core_annotation_project.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_annotation_project.dto.Product;

public class ProductDriver {
	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(Product.class);
	    Product p=(Product)a.getBean("p");
	    System.out.println(p.getId());
	    System.out.println(p.getName());
	    System.out.println(p.getPrice());
	    
	}

}
