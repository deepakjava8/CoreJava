package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Parent{
	public void m1() {
		System.out.println("Parent-m1()");
	}
}
class Child extends Parent{
	public void m1() {
		System.out.println("Child-m1()");
	}
}
public class Test5 {
public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<>();
	map.put("deepak", 100);
	map.put(null, 45);
	map.put(null, null);
	
	Set<Entry<String, Integer>> entrySet = map.entrySet();
	for(Map.Entry<String, Integer> entry : entrySet) {
		System.out.println(entry.getKey() + "\t"+entry.getValue());
	}
	
	Parent p1=new Parent();
	p1.m1();
	
	Child c1=new Child();
	c1.m1();
	
	Parent p2=new Child();
	p2.m1();
}
}
