/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;

import java.util.Scanner;

/**
 *
 * @author Akash
 */
//write a program to reverse a given string with preserving 
//the position of spaces.
public class ReverseWithOutChangingThePositionOFWhiteSpace {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String inputString=sc.nextLine();
        char[] inputStringArray = inputString.toCharArray();
         
        char[] resultArray = new char[inputStringArray.length];
         
        for (int i = 0; i < inputStringArray.length; i++) 
        {
            if (inputStringArray[i] == ' ') 
            {
                resultArray[i] = ' ';
            }
        }
         
        int j = resultArray.length-1;
         
        for (int i = 0; i < inputStringArray.length; i++)
        {
            if (inputStringArray[i] != ' ') 
            {
                 
                if(resultArray[j] == ' ')
                {
                    j--;
                }
                 
                resultArray[j] = inputStringArray[i];
                 
                j--;
            }
        }
         
        System.out.println(inputString+" ---> "+String.valueOf(resultArray));
    }
    
}
