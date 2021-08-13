/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//write a program to remove duplicate characters from string.
public class RemoveDupplicateCharacter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        s = s.replace(" ", "");
        char arr[] = s.toCharArray();
        ArrayList<Character> myList = new ArrayList<Character>();
        for (int i = 0; i < arr.length; i++) {
            myList.add(arr[i]);
        }
        Set<Character> mySet = new LinkedHashSet<Character>(myList);
        for (Character ch : mySet) {
            int count=Collections.frequency(myList, ch);
            if (count == 1) {
                System.out.print(ch+" ");
            }
        }
    }
    
}
