package com.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test1 {
public static void main(String[] args) {
	int[] array= {3,4,5,2,9,7,1,11,23};
	int[] array2= {3,4,5,2};
	/*int[] a1= {3,0,5,2,0,7,1,0,23};
	System.out.println("Minimum : "+findMin(array));
	System.out.println("Maximum : "+findMax(array));
	arrayDemo();*/
	//removeElementFromArray(array2, 3);
	//printArray(array2);
	reverseArray1(array);
	Queue q=new LinkedList<>();
	q.offer(44);
	q.offer(48);
	System.out.println("offer : "+ q);
}

public static void removeElementFromArray(int array[],int location) {
	int size=array.length;
	for(int i=location;i<size-1;i++) {
			
			array[i]=array[i+1];
	}
	size--;
	for(int i=0;i<size;i++) {
		System.out.print(array[i]+" ");
	}
}
public static void printArray(int[] array) {
	for(int i=0;i<array.length-1;i++) {
		System.out.print(array[i]+" ");
	}
	System.out.println();
}
public static void reverseArray1(int[] array) {
	/*for(int i=0;i<array.length-1;i++) {
		System.out.print(array[i]+" ");
	}*/
	int size=array.length;
	for(int i=size-1;i>=0;i--) {
		System.out.print(array[i]+" ");
		//size--;
	}
	System.out.println();
}
public static void arrayDemo() {
	int[] a1= {3,0,5,2,0,7,1,0,23};
	printArray(a1);
	moveZerosToEnd(a1,a1.length);
	printArray(a1);
	
	reverseArray();
}
public static int findMin(int[] a) {
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	return min;
}

public static int findMax(int[] a) {
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	return max;
}

public static void moveZerosToEnd(int[] a, int n) {
	int j=0;
	for(int i=0;i<n;i++) {
		if(a[i]!=0 && a[j]==0) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		if(a[j]!=0) {
			j++;
		}
	}
}

public static void reverseArray() {
	int[] firstArray = new int[]{1,2,3,4};
	int[] reversedArray = new int[firstArray.length];
	int j = 0;
	for (int i = firstArray.length -1; i > 0; i--){
	    reversedArray[j++] = firstArray[i];
	}
	
	for(int i=0;i<reversedArray.length;i++) {
		System.out.print(reversedArray[i]+" ");
	}
}


}
