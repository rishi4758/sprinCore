package com.corespring.auto.wire;

public class Building {
	private Address address;

	@Override
	public String toString() {
		return "Building [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

//	public Building(Address address) {
//		super();
//		this.address=address;
//
//	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
