/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;

//write a program to remove all vowels from a string.
public class RemoveVowelFirstMethod {

    public static void main(String args[]) {
        String s = "Hello This Is a Test String For Testing";
        s=s.replaceAll("[aeiouAEIOU]", "");
        System.out.println(s);
    }

}
