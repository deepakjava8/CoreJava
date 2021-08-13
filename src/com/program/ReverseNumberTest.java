package com.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumberTest {
public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the value for n");
	int input=Integer.parseInt(br.readLine());
	int rem,rev=0;
	while(input>0) {
		rem=input%10;
		rev=rev*10+rem;
		input=input/10;
	}
	System.out.println("Reverse value is : "+rev);
	
}
}
