package com.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Student {
	private int rno;
	private String name;

	
	@Autowired
	private MyCountry myCountry;
	
	@Autowired		//you are asking container to inject the object automatically
	@Qualifier("address2")	//you want the object with id "address2" should be injected
	private Address address;
	
	@Autowired		//you are asking container to inject the object automatically
	@Qualifier("proj2")
	private Project project;
	
	
	
}
