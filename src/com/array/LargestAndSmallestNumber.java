package com.array;

import java.util.Arrays;
import java.util.Scanner;

//write a program to find the max and min value from an array
public class LargestAndSmallestNumber {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 1st Array:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the 1st Array:");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("Smallest element: "+arr[0]);
        System.out.println("Largest element: "+arr[size - 1]);
    }

}
