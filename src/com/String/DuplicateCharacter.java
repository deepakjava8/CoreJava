/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Akash
 */

//Print the print the duplicate character of string
public class DuplicateCharacter {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        //s=s.toLowerCase(); unComment it if Upper and Lower case is considered as same
        s = s.replace(" ", "");
        char arr[] = s.toCharArray();
        ArrayList<Character> myList = new ArrayList<Character>();
        for (int i = 0; i < arr.length; i++) {
            myList.add(arr[i]);
        }
        Set<Character> mySet = new LinkedHashSet<Character>(myList);
        for (Character ch : mySet) {
            if (Collections.frequency(myList, ch) > 1) {
                System.out.println(ch + " : " + Collections.frequency(myList, ch));
            }
        }
    }

}
