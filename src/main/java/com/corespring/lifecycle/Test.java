package com.corespring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/corespring/lifecycle/config.xml");
//		Samosa s1=(Samosa) context.getBean("s1");
//		System.out.println(s1);	
//// for calling destroy method we have to register the hook which is in abstractApplication context so use it
////		 instead of ApplicationContext in all xml or interface or annotainion
		context.registerShutdownHook();
//		System.out.println("++++++++++++++++++++++After implementing life cycle method using interface+++++++++++++++++++");
//		Pepsi s2=(Pepsi) context.getBean("s2");
//		System.out.println(s2);
		
		Example s3=(Example)context.getBean("example");
		System.out.println(s3);
	}
	

}
