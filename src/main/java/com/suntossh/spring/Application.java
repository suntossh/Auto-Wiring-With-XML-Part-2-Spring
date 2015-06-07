package com.suntossh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		BeanA beanA = context.getBean("beanAID", BeanA.class);
		System.out.println("*******************************");
		System.out.println(beanA.getBeanB().getBeanD().getName());
		System.out.println("*******************************");
	}
	
}
