package com.String;

import java.util.Scanner;


//write a program to reverse a string and also reverse each word of the string
public class ReverseStringWIthAlongwithReversingTheWords {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		String revStr="";
		
		String words[]=str.split(" ");
		for(int i=words.length-1;i>=0;i--){
			char arr[]=words[i].toCharArray();
			String revWord="";
			
			for(int j=arr.length-1;j>=0;j--){
				revWord=revWord+arr[j];
			}
			
			revStr=revStr+revWord+" ";
			
		}
		
		System.out.println("The rsultant String is: "+revStr);
	}

}
