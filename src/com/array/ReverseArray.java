package com.array;

import java.util.Scanner;

//write a program to reverse an array
public class ReverseArray {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 1st Array:");
        int size1 = sc.nextInt();
        System.out.println("Enter the elements of the 1st Array:");
        int arr1[] = new int[size1];
        for(int i = 0; i < size1; i++)
            arr1[i] = sc.nextInt();

        System.out.println("Reversed array");
        for(int i = size1 - 1; i >= 0; i--)
            System.out.print(arr1[i]);

    }

}
