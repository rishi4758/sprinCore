package com.corespring.ci;

public class Adition {
	private int a;
	private int b;
	public Adition(double a , double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println(" constructor double,double  is calling>>>>>>....");
	}
	public Adition(int a , int b) {
		this.a=a;
		this.b=b;
		System.out.println(" constructor int, int is calling>>>>>>....");
	}

//	public Adition(String a,String b) {
//		this.a=Integer.parseInt(a);
//		this.b=Integer.parseInt(b);
//		System.out.println(" constructor String,String is calling>>>>>>....");
//	}
	public void sum() {
		System.out.println("sum of a and b.."+(this.a+this.b));
	}
	

}
