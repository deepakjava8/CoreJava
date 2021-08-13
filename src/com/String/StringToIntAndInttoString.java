/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;

//write a program to convert string to integer and integer to string in java.
public class StringToIntAndInttoString {
    public static void main(String args[]){
        String s="Akash";
        int x=90;
        
        String x1=Integer.toString(x);
        System.out.println(x1);
        
        //int s1=Integer.parseInt(s); it will throw exception cause it is not a number
        
        s="900";
        int s1=Integer.parseInt(s);
        System.out.println(s1);
    }
    
}
