/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;
//Find two Strings are anagram or not

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the first word"); //Army
        String s1=sc.nextLine();
        s1=s1.toLowerCase();
        
        System.out.println("Enter the second word"); //Mary
        String s2=sc.nextLine();
        s2=s2.toLowerCase();
        
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Yes they are anagram");
        }else{
            System.out.println("nop they are notanagram");
        }
        
        
    }
    
}
