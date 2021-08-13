package com.array;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n<18){
			try {
				throw new Exception("Under 18");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("Above 18");
		}
		
		
	}

}
