package com.corespring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/corespring/auto/wire/config.xml");
        Building b1=(Building)context.getBean("build");
        System.out.println(b1.getAddress());
        
	}

}
