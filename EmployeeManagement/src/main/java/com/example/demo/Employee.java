    package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	Integer salary;
	String name;
	
	
	public Employee() {
		
	}
	
	public Integer getId() {
		return id;
	}

	
	
	
	public Employee(Integer id, Integer salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}



	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}