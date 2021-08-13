package com.reflection;

interface MyMarker{
}
class MyException extends RuntimeException{
	public MyException(String msg) {
		super(msg);
	}
}
class CustomMarker{// implements MyMarker{
	
	public void m1() {
		if(this instanceof MyMarker) {
			 System.out.println("successfull");
		}else {
			throw new MyException("Must implement interface Marker ");
		}
	}
}
public class CustomeMarkerClient extends CustomMarker implements MyMarker{
public static void main(String[] args) {
	CustomMarker cm=new CustomMarker();
	try {
		cm.m1();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	
}
}
