package com.suntossh.spring;

import org.springframework.beans.factory.BeanNameAware;



public class BeanD implements BeanNameAware{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public BeanD() {
		System.out.println("BeanD Constructor");
	}
	
	public void message(){
		System.out.println("BeanD Message");
	}

	public void setBeanName(String name) {
		this.name = name;
	}
}
