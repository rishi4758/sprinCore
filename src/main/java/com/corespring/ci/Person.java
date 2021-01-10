package com.corespring.ci;

import java.util.List;

public class Person {
	private String name;
	private int age;
	private Cert certi;
	private List<String>list;

	public Person(String name,int age, Cert certi,List<String> list) {
		
		this.name=name;
		this.age=age;
		this.certi=certi;
		this.list=list;
	
	
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "certi"+certi+",list"+list+"]";
	}

}
