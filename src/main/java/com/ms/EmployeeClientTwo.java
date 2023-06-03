package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClientTwo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("info_two.xml");
		Employee emp=context.getBean("emp", Employee.class);
		System.out.println(emp);

	}

}
