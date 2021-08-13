/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;

/**
 *
 * @author Akash
 */
//write a program to revesre a string
public class ReverseMethodManualMethod {
        public static void main(String args[]) {
        String s = "Hi I am Akash Daga";
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            result=result+s.charAt(i);
        }
        System.out.println(result);
    }
    
}
