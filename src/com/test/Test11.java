package com.test;

public class Test11 {
public static void main(String[] args) {
	int array[]={1,0,0,1,1,0,1};
	moveZeroToFront(array);
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
}
public static void moveZeroToFront(int[] array) {
	//int[] temp=new int[array.length];
	int count=0;
	for(int i=0;i<array.length;i++) {
		if(array[i]!=1) {
			array[count++]=array[i];
		}
	}
}
}
