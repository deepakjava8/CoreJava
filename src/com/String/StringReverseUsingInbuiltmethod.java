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
//write a program to reverse a string using inbuilt method
public class StringReverseUsingInbuiltmethod {

    public static void main(String args[]) {
        String s = "Hi I am Akash Daga";
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        System.out.println(sb.toString());
    }

}
