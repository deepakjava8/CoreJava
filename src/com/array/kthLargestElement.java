package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//write a program to find the kth largest element in an array
public class kthLargestElement {
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
        ArrayList myList = new ArrayList();
        for(int i = 0; i < arr.length; i++)
            myList.add(arr[i]);

        System.out.println();
        Collections.reverse(myList);
        int x = arr.length - 1;
        System.out.println("Enter the Your choice and that should be in limit of 0 to "+x);
        int n = sc.nextInt();
        System.out.println("The "+n+"th largest number is: "+myList.get(n));
    }

}
