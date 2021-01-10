package com.corespring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {	
		ApplicationContext context= new AnnotationConfigApplicationContext(javaconfig.class);
		Student s1=(Student) context.getBean("getStudent");
	System.out.println(	s1.getN());
	}

}
