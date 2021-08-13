/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;

import java.util.Scanner;

/**
 *
 * @author Akash
 */

//write a program to to reverse each word of a given string.
public class ReverseEachWordofAGivenString {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        
        String words[]=s.split(" ");
        
        String result="";
        
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            result=result+sb.reverse().toString()+" ";
        }
        System.out.println(result);
    }
    
}
