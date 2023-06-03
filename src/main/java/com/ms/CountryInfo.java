package com.ms;

import lombok.Data;

@Data
public class CountryInfo {
	private String code;
	private String name;
	public CountryInfo(String code, String name) {
		this.code=code;
		this.name=name;
	}
	/*
	public static CountryInfo getCountryInfo() {
		CountryInfo info=new CountryInfo("091","India");
		return info;
	}
	*/
}
