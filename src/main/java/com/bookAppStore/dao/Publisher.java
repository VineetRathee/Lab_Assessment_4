package com.bookAppStore.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Publisher {	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String code;
	private String name;

	public Publisher() {}	
	public Publisher(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Publisher [code=" + code + ", name=" 
				+ name + "]";
	}	
}














