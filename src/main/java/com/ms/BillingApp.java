package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BillingApp {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("billinfo.xml");
		Bill bill=context.getBean("bill",Bill.class);
		System.out.println(bill);
	}
}
