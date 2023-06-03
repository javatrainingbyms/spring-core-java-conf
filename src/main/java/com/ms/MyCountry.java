package com.ms;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MyCountry {
	private String name;
	private String isd;
	
	public MyCountry() {
		name="India";
		isd="91";
	}
}
