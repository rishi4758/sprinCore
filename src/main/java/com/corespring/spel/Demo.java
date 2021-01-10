package com.corespring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
private int x;
@Value("#{4333+233}")
private int y;
@Value("#{T(java.lang.Math).sqrt(25)}")
private int z;
@Value("#{T(java.lang.Math).PI}")
private double pi;
// not mandatory to have a string class object it can be of any class like integer, demo etc
@Value("#{new java.lang.String('rishav')}")
private String name;
public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}


public int getZ() {
	return z;
}
public void setZ(int z) {
	this.z = z;
}

public double getPi() {
	return pi;
}

public void setPi(double pi) {
	this.pi = pi;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	
}
