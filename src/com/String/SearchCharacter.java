/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;

import java.util.Scanner;

//write a program to search a character in a string
public class SearchCharacter {

    public static void main(String args[]) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String s = "CoNvErT EaCh UpPeR CaSe ChArAcTeR To LoWeR CaSe ChArAcTeR AnD ViCe VeRsA";
        char arr[] = s.toCharArray();

        System.out.println("Enter the character to be searched");
        char ch = sc.nextLine().charAt(0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Yes the char present");
        } else {
            System.out.println("no the char doesnt present");
        }
    }

}
