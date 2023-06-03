package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiretest.xml");
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
	}

}
