package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		
		
			//step-1 (create the spring-container object)
			ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		
			//step-2 (call the getBean method for demanding the object)
			Employee emp=context.getBean("e1", Employee.class);
			System.out.println(emp);
		
		
	}

}
