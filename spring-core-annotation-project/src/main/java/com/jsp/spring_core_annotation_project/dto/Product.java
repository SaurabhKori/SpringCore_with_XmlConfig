package com.jsp.spring_core_annotation_project.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="p")
public class Product {
	private int id;
	private String name;
	private double price;
	
	public int getId() {
		return id;
	}
	@Value(value="23")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value(value="laptop")
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	@Value(value="3876764.32")
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
