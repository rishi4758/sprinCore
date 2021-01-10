package com.corespring.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/corespring/standalone/collections/aloneconfig.xml");
  Person p1= (Person) context.getBean("person2");
  System.out.println(p1.getMyProperties());
	}

}
