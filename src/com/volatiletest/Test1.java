package com.volatiletest;

import java.lang.invoke.VolatileCallSite;

class TestVolatile extends Thread{
	private volatile boolean flag=true;
	int count=0;
	
	public void run() {
		while(flag) {
			
			count++;
		}
	}
	
	public void stopt() {
		flag=false;
	}
	
}
public class Test1 {
public static void main(String[] args) {
	TestVolatile tv=new TestVolatile();
	tv.start();
	tv.stopt();
}
}
