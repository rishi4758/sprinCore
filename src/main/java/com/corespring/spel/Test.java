package com.corespring.spel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/corespring/spel/config.xml");
		Demo d1= (Demo)context.getBean("demo");
		System.out.println(d1.getName());
	}
}
