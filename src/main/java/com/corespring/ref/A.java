package com.corespring.ref;

public class A {
	private int x;
	private B ob;
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
}
