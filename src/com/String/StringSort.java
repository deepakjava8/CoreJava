package com.String;

import java.util.Arrays;
import java.util.Scanner;

//write a program to sort a string
public class StringSort {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Main String: ");
        String s = sc.nextLine();
        String result = "";
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
            result =result+arr[i];
        	System.out.println("Sorted String: "+result);
    }

}
