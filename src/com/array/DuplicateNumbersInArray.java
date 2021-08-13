package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//write a program to show the number of occurrences of duplicate numbers

public class DuplicateNumbersInArray {
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

        System.out.println("number\t\t\tnumber of occurances");
        Set<Integer> mySet = new HashSet<Integer>(myList);
        for(Integer n:mySet)
        {
            int count = Collections.frequency(myList, n);
            if(count > 1)
                System.out.println((new StringBuilder()).append(n).append("\t\t\t").append(count).toString());
        }

    }

}
