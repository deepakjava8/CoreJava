package com.array;

import java.util.Scanner;

//write a program to remove a specific element from an integer array
public class RemoveSpecificElement {
	public static void main(String args[])
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 1st Array:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the 1st Array:");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter Element to be Delete : ");
        int del = sc.nextInt();
        for(int i = 0; i < size; i++)
        {
            if(arr[i] != del)
                continue;
            for(int j = i; j < size - 1; j++)
                arr[j] = arr[j + 1];

            count++;
            break;
        }

        if(count == 0)
        {
            System.out.print("Element Not Found..!!");
        } else
        {
            System.out.print("Element Deleted Successfully..!!");
            System.out.println("\nNow the New Array is :");
            for(int i = 0; i < size - 1; i++)
                System.out.print(arr[i]+" ");

        }
    }

}
