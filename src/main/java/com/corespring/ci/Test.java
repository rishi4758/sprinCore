package com.corespring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/corespring/ci/ciconfig.xml");
//		Person p=(Person) context.getBean("person");
		Adition a=(Adition) context.getBean("add");
		System.out.println(a);
	}

}
