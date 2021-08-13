/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//write a program to print first non repeated character of a string.

public class FirstNonRepeatedCharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        
        char arr[]=s.toCharArray();
        
        List<Character> myList=new ArrayList<Character>();
        for(int i=0;i<arr.length;i++){
            myList.add(arr[i]);
        }
        TreeSet<Character> mySet=new TreeSet<Character>(myList);
                for (Character ch : mySet) {
                	int count=Collections.frequency(myList, ch);
            if ( count> 1) {
            	while(count>0){
                myList.remove(ch);
                count--;
            	}
            }
        }
                System.out.println("first non repeated character: "+myList.get(0));
        
    }
    
}
