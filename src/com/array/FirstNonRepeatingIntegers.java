package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//write a program to find the first non-Repeating number
public class FirstNonRepeatingIntegers {
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

        TreeSet<Integer> mySet = new TreeSet<Integer>(myList);
        for(Integer n:mySet)
        {int count=Collections.frequency(myList, n);
        if ( count> 1) {
        	while(count>0){
            myList.remove(n);
            count--;
        	}
        }
        }

        System.out.println("first non repeated Integer : "+myList.get(0));
    }

}
