package com.test1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

class CustomArrayList<E>{
	private static final int INITIAL_CAPACITY1=10;
	private int size=0;
	private Object elementData[]= {};
	
	public CustomArrayList() {
		elementData=new Object[INITIAL_CAPACITY1];
	}
	
	public void add(E e) {
		if(size == elementData.length) {
			increaseCapacity();
			
		}
		elementData[size++]=e;
	}
	private void increaseCapacity() {
		int newCapacity=elementData.length*2;
		elementData=Arrays.copyOf(elementData, newCapacity);
	}
	
	public void display() {
		System.out.println("Diplaying list");
		for(int i=0;i<size;i++) {
			System.out.println(elementData[i]+" ");
		}
	}
}
public class ALClient {
public static void main(String[] args) {
	String s="aabcdcefcde";
	char []ch=s.toCharArray();
	Map<Character, Integer> map=new LinkedHashMap<>();
	for(char c : ch) {
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}else {
			map.put(c, 1);
		}
	}
	for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		System.out.println(entry.getKey() + "\t" + entry.getValue());
	}
	
}
}
