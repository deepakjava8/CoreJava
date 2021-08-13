/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
//write a program to count the total number of occurrences of a 
//given character in a string without using any loop.
public class NumberOfOccuranceOfSpecificCharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        s=s.toLowerCase();
        s.replace(" ", "");
        
        char arr[]=s.toCharArray();
        
        List<Character> myList=new ArrayList<Character>();
        
        for(int i=0;i<arr.length;i++){
            myList.add(arr[i]);
        }
        Set<Character> mySet=new HashSet<Character>(myList);
        
        System.out.println("Enter the character you want to search");
        char ch=sc.nextLine().charAt(0);
        
        System.out.println("Number of occurances : "+Collections.frequency(myList, ch));
    }
    
}
