package com.generics1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
public static void main(String[] args) {
	MyGen1<String> obj1=new MyGen1<>();
	obj1.setObject("new object");
	String objRes1 = obj1.getObject();
	System.out.println(objRes1);
	
	MyGen1<Integer> obj2=new MyGen1<>();
	obj2.setObject(100);
	Integer objRes2 = obj2.getObject();
	System.out.println(objRes2);
}
}
