package com.corespring.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Building {
@Autowired
@Qualifier("add1")
 	private Address address;

	@Override
	public String toString() {
		return "Building [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Building(Address address) {
		super();
		this.address=address;
	System.out.println("constructor calling");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setting vlaue");
		this.address = address;
	}

}
