/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;

//write a program to print the last word of a string
public class LastWordOfString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s="Hello this is a test string for example";
        String word[]=s.split(" ");
        int indexOfLastWord=word.length-1;
        System.out.println(word[indexOfLastWord]);
   }
    
}
