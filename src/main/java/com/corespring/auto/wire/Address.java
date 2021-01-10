package com.corespring.auto.wire;

public class Address {
	private String myaddress;

	public String getMyaddress() {
		return myaddress;
	}

	public void setMyaddress(String myaddress) {
		this.myaddress = myaddress;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [myaddress=" + myaddress + "]";
	}

}
