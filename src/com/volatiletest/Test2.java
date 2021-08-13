package com.volatiletest;

class MyInterface{
	public void m1() {
		System.out.println("parent m1()");
	}
}
class C extends MyInterface{

	public  void m1() {
		System.out.println("C class m1 method");
	
	}
	public  void m2() {
		System.out.println("C class m2 method");
	
	}
}
class D extends MyInterface{
	/*public  void m1() {
		System.out.println("D class m1 method");
	
	}*/
	public  void m2() {
		System.out.println("D class m2 method");
	
	}
}
public class Test2 {
public static void main(String[] args) {
	D i=new D();
	Object mi=(MyInterface)i;
	((MyInterface) mi).m1();
	System.out.println(i.hashCode());
	System.out.println(mi.hashCode());
}
}
