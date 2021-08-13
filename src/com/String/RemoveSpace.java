/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;



import java.util.Scanner;

//write a program to remove all white spaces from a string.
public class RemoveSpace {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        s=s.replace(" ", "");
        
        System.out.println(s);
    }
    
}
