package com.suntossh.spring;



public class BeanA{
	
	private BeanB beanB;
	private BeanC beanC;
	
	public BeanA() {
		System.out.println("No Argument beanA Constructor");
	}
	
	public BeanA(BeanB beanB) {
		System.out.println("beanA Constructor==> public BeanA(BeanB beanB)");
		this.beanB = beanB;
		
	}
	
	public BeanA(BeanB beanB, BeanC beanC) {
		System.out.println("beanA Constructor==> public BeanA(BeanB beanB, BeanC beanC)");
		this.beanB = beanB;
		this.beanC = beanC;
	}
	
	public BeanA(BeanB beanB, BeanC beanC, BeanR beanR) {
		System.out.println("beanA Constructor==> public BeanA(BeanB beanB, BeanC beanC)");
		this.beanB = beanB;
		this.beanC = beanC;
	}

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public BeanC getBeanC() {
		return beanC;
	}

	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}
	
}
