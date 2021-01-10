package com.corespring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

	ApplicationContext context=new ClassPathXmlApplicationContext("com/corespring/stereotype/stereoconfig.xml");
	Student std=context.getBean("student",Student.class);
	System.out.println(std.getAddress());
	ScopeLearn c=(ScopeLearn)context.getBean("scopeLearn");
	System.out.println(c.hashCode());

}}
