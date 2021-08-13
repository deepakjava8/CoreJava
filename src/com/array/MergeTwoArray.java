package com.array;

import java.util.Scanner;

//write a program to merge two arrays
public class MergeTwoArray {
	 public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the 1st Array:");
	        int size1 = sc.nextInt();
	        System.out.println("Enter the elements of the 1st Array:");
	        int arr1[] = new int[size1];
	        for(int i = 0; i < size1; i++)
	            arr1[i] = sc.nextInt();

	        System.out.println("Enter the size of the 2nd Array:");
	        int size2 = sc.nextInt();
	        System.out.println("Enter the elements of the 2st Array:");
	        int arr2[] = new int[size2];
	        for(int i = 0; i < size2; i++)
	            arr2[i] = sc.nextInt();

	        int ResultSize = size1 + size2;
	        int result[] = new int[ResultSize];
	        int resultIndex = 0;
	        for(int i = 0; i < size1; i++)
	        {
	            result[resultIndex] = arr1[i];
	            resultIndex++;
	        }

	        for(int i = 0; i < size2; i++)
	        {
	            result[resultIndex] = arr2[i];
	            resultIndex++;
	        }

	        System.out.println("Resultant array:");
	        for(int i = 0; i < ResultSize; i++)
	            System.out.print(result[i]+" ");

	    }

}
