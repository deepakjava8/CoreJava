package com.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

//write a program to remove duplicate elements from an array
public class RemoveDuplicate {
	 public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the 1st Array:");
	        int size = sc.nextInt();
	        System.out.println("Enter the elements of the 1st Array:");
	        int arr[] = new int[size];
	        for(int i = 0; i < size; i++)
	            arr[i] = sc.nextInt();

	        List myList = new ArrayList();
	        for(int i = 0; i < arr.length; i++)
	            myList.add(Integer.valueOf(arr[i]));

	        java.util.Set mySet = new HashSet(myList);
	        System.out.println("number duplicate elements in the list:");
	        System.out.println(mySet);
	    }

}
