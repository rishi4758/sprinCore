package com.corespring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest{

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/corespring/ref/refconfig.xml");
A temp=(A)context.getBean("aref");
System.out.println(temp.getOb().getY());
	
	}

}
