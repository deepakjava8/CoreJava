package com.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//write a program to find the intersection of two arrays
public class IntersectionOfTwoArrays {
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

        System.out.println("Enter the size of the 2nd Array:");
        int size2 = sc.nextInt();
        System.out.println("Enter the elements of the 2nd Array:");
        int arr2[] = new int[size2];
        for(int i = 0; i < size2; i++)
            arr2[i] = sc.nextInt();

        System.out.println("Common elements");
        for(int i = 0; i < size2; i++)
            if(myList.contains(arr2[i]))
                System.out.print(arr2[i]+" ");

    }

}
