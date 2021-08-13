package com.array;

import java.util.Arrays;

public class Test2 {
public static void main(String[] args) {
	int[] a1= {2,3,6,7,9};
	int[] a2= new int[a1.length];
	moveZeroToFirst(new int[] {0,1,2,0,1,0});
	
	String str="deepak";
	//str.con
	
	//a2=Arrays.copyOf(a1, a1.length);
	//a2=a1.clone();
	
	/*for(int i=0;i<a1.length;i++) {
		a2[i]=a1[i];
		
	}
	*/
	/*for(int i=0;i<a2.length;i++) {
		System.out.print(a2[i]+" ");
	}*/
	
}
public static void moveZeroToFirst(int[] array) {
	int count=0;
	for(int i=0;i<array.length;i++) {
		if(array[i]==0) {
			array[count++]=array[i];
		}
		
	}
	for(int i=count;i<array.length;i++) {
		if(array[i]>0) {
			array[count++]=array[i];
		}
	}
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
}
}
