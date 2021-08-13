package com.test;

public class Test4 {
public static void main(String[] args) {
	System.out.println(largestNumber(5, 9, 33));
}
public static int largestNumber(int a,int b,int c) {
	int large=0;
	if(a>large) {
		large=a;
	}
	if(b>large) {
		large=b;
	}
	if(c>large) {
		large=c;
	}
	return large;
}
}
