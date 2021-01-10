package com.corespring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/corespring/collection/collectionconfig.xml");
Emp emp1=(Emp)context.getBean("emp1");
System.out.println(emp1.getAddresses());
	
	}

}
