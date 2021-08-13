package com.test;

public class Test3 {
public static void main(String[] args) {
	boolean b1=true,b2=false,b3=false;
	System.out.println(countBoolean(b1, b2, b3));
}
public static boolean countBoolean(boolean b1,boolean b2,boolean b3) {
	int count=0;
	if(b1) {
		count++;
	}
	if(b2) {
		count++;
	}
	if(b3) {
		count++;
	}
	return count>=2;
}
}
