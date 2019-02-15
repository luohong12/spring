package com.shidebin.mongodb.springAop2;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

public class User {
	
		
	private String username;
	
	private String country;
	
	
	
	private int age;
	
	private BigDecimal salary;
	
	private float lenght;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public float getLenght() {
		return lenght;
	}
	public void setLenght(float lenght) {
		this.lenght = lenght;
	}
	
}
