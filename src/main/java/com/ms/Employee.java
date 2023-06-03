package com.ms;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = { "kids","education"})
public class Employee {
	private int eno;
	private String name;
	@Autowired
	private Address address;
	private Set<String> emails;
	private List<String> hobbies;
	private Map<String, Integer> kids;
	private Properties education;// degree key,university/board value (btech davv, mtech iit, phd iist)
	private List<Project> projects;
	private Map<String,Address> addresses;
	@Autowired
	private MyCountry myCountry;
	
	public Employee(int eno, String name, Address address) {
		System.out.println("three arg constructor...");
		this.eno = eno;
		this.name = name;
		this.address = address;
	}

	public Employee() {
		System.out.println("zero arg constructor...");
	}

	public Employee(int eno, String name, Address address, Set<String> emails) {
		System.out.println("four args constructor (set)....");
		this.eno = eno;
		this.name = name;
		this.address = address;
		this.emails = emails;
	}

	public Employee(int eno, String name, Address address, List<String> hobbies) {
		System.out.println("four args constructor (list)....");
		this.eno = eno;
		this.name = name;
		this.address = address;
		this.hobbies = hobbies;
	}
	
	
}
