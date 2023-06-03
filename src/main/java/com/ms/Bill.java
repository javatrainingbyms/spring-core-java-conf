package com.ms;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class Bill implements InitializingBean, DisposableBean {
	private int price;
	private int quantity;
	private int amount;
	
	public void cleanup()
	{
		//here we can write the code which we want to execute before disposal of the bean
	}
	public void compute() {
		amount=price*quantity;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//this method will get called after property setting
		compute();		//compute method will be automatically called after property setting
		
	}
	@Override
	public void destroy() throws Exception {
		//write your code for cleanup
		
	}
}
