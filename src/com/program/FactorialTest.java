package com.program;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FactorialTest {
public static void main(String[] args) throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number for factorial");
	int input=Integer.parseInt(br.readLine());
	int fact=1;
	for(int i=1;i<=input;i++) {
		fact=fact*i;
	}
	System.out.println("Factoril of "+input+ " is : "+fact);
}
}
