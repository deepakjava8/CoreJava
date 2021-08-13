/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;

//write a program to check if a string contains only digits.
import java.util.Scanner;

public class IsStringContainsOnlyDigit {

    public static void main(String args[]) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();

        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!Character.isDigit(arr[i])) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("String is not made of Digits");
        } else {
            System.out.println("String is made of Digits");
        }
    }

}
