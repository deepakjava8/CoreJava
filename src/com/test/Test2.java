package com.test;
class Car{
	String name;
	Car(String name){
		this.name=name;
	}
}
final class MyImmutalbe1{
	private final String id;
	private final String name;
	private final Car car;
	public MyImmutalbe1(String id, String name,Car car) {
		this.id = id;
		this.name = name;
		Car c=new Car(car.name);
		this.car=c;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Car getCar() {
		return car;
	}
	
}
public class Test2 {
public static void main(String[] args) {
	Car c=new Car("BMW");
	MyImmutalbe1 m1=new MyImmutalbe1("101", "deepak",c);
	System.out.println(m1.getId()+"\t"+m1.getName()+"\t"+m1.getCar().name);
	c.name="AUDI";
	System.out.println(m1.getCar().name);
	
}
}
