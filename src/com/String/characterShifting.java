package com.String;

import java.util.Scanner;

public class characterShifting {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		
		s=s.toLowerCase();
		
		String result="";
		char arr[]=s.toCharArray();
		
		for(char ch:arr){
			if(Character.isAlphabetic(ch)){
			char nextChar=findNextChar(ch);
			result=result+nextChar;
			}
			else{
				result=result+" ";
			}
		}
		System.out.println("The resultant String is: "+result);
	}

	private static char findNextChar(char ch) {
		int n=(int)ch;

		n=n+1;
		if(n>122){// Ascii value of a=97 and z=122
			n=97;
		}
		
		char nextChar=(char)n;
		return nextChar;
		}
	}
