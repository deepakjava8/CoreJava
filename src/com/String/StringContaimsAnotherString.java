package com.String;

import java.util.Scanner;

//write a program to check whether a string contains another string or not
public class StringContaimsAnotherString {
	 public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Main Strin: ");
	        String s1 = sc.nextLine();
	        System.out.println("Enter the Main Strin: ");
	        String s2 = sc.nextLine();
	        if(s1.contains(s2))
	            System.out.println("yes");
	        else
	            System.out.println("no");
	    }

}
