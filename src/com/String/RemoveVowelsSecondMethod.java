package com.String;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Akash
 */
//write a program to remove all vowels from a string
public class RemoveVowelsSecondMethod {

    public static void main(String args[]) {
        String s = "Hello This Is a Test String For Testing";
        s = s.toLowerCase();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            } else {
                result = result + ch;
            }
        }
        System.out.println(result);
    }

}
