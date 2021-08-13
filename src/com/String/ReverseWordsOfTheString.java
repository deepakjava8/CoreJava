package com.String;

import java.util.Scanner;

//write a program to reverse a string "Hello world"----> "world hello"
public class ReverseWordsOfTheString {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String result = "";
        String words[] = s.split(" ");
        for(int i = words.length - 1; i >= 0; i--)
            result = result+words[i]+" ";

        System.out.println("Reversed String: "+result);
    }

}
