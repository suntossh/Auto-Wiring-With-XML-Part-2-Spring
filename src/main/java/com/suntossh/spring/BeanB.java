package com.suntossh.spring;

public class BeanB {
	
	private BeanD beanD;
	
	public BeanB() {
		System.out.println("BeanB Constructor");  
	}

	public BeanD getBeanD() {
		return beanD;
	}

	public void setBeanDID(BeanD beanD) {
		System.out.println("Setting beanD into BeanB via method Setter injectio");
		System.out.println("name of the bean which is Set is "+beanD);
		this.beanD = beanD;
	}

}
