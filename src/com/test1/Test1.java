package com.test1;

public class Test1 {
public static void main(String[] args) {
	int a[]=new int[] {10,20,30,40};
	int b[]=new int[] {50,60,70,80};
	
	int c[]=new int[a.length+b.length];
	for(int i=0;i<a.length;i++) {
		c[i]=a[i];
	}
	for(int i=0;i<b.length;i++) {
		c[a.length+i]=b[i];
	}
	
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
	}
}
}
