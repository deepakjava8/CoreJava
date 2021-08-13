package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

//write a program to find the First Repeating number
public class FirstRepeatingNumber {
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

        LinkedHashSet<Integer> mySet = new LinkedHashSet(myList);
        for(Integer n:mySet)
        {
            
            if(Collections.frequency(myList, n) > 1)
            {
                System.out.println("First repeating number: "+n);
                break;
            }
        }

    }

}
