package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionClient {

	public static void main(String[] args) {
		
		System.out.println("Creating Container...");
		ApplicationContext context=new ClassPathXmlApplicationContext("scopetest.xml");
		
		System.out.println("Demanding OBjects from Container...");
		System.out.println("First Time : ");
		Connection con1=context.getBean("con",Connection.class);
		System.out.println("Second Time : ");
		Connection con2=context.getBean("con",Connection.class);
		//System.out.println(con1==con2);
	
	}

}
