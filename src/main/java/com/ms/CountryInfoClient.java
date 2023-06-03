package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryInfoClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		CountryInfo info=context.getBean("info",CountryInfo.class);
		System.out.println(info);

	}

}
