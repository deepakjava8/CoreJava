/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;

//write a program to check whether a string is palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        
        StringBuilder sb=new StringBuilder(s);
        
        String s1=sb.reverse().toString();
        
        if(s.equals(s1)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("not palindrome");
        }
    }
    
}
