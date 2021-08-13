
package com.String;
//write a program to count the number of words in a string.

import java.util.Scanner;

public class WordCount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        String[] words=s.split(" ");
        System.out.println("Number of words: "+ words.length);
    }
}
