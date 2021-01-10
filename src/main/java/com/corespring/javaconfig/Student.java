package com.corespring.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Student")
// do not use @Component if we make @Bean in javaconfig 
public class Student {
	private Samosa samosa;
public Student( Samosa samosa) {
		super();
		this.setSamosa(samosa);
		// TODO Auto-generated constructor stub
	}

@Value("1234455")
private	int n;

public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}
public Samosa getSamosa() {
	return samosa;
}
public void setSamosa(Samosa samosa) {
	this.samosa = samosa;
}
}
