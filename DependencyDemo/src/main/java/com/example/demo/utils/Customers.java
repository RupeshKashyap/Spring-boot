package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	private int custid;
	private String custName;
	private String courseName;
	
	@Autowired
	private Technologies technologies;
	
	public int getCustid() {	
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void display() {
		System.out.println("Object returned successfully");
		technologies.tech();
	}
	public Technologies getTechnologies() {
		return technologies;
	}
	public void setTechnologies(Technologies technologies) {
		this.technologies = technologies;
	}
	
	}
