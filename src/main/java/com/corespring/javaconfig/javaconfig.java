package com.corespring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.corespring.javaconfig")
// do not use component scan if we are using @Bean
public class javaconfig {
	@Bean
	Samosa getSamosa() {
		Samosa mySam=new Samosa();
		return mySam;
	}

	@Bean 
	Student getStudent() {
		Student student=new Student(getSamosa());
		return student;
	}
	
}
