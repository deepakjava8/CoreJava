/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.String;

//write a program to convert the upper case characters into lower case characters 
//and lower case character into upper case characters
public class ConvertingFromLowerToUpperAndUpperToLowerEachCharacter {
    public static void main(String args[]){
        String s="CoNvErT EaCh UpPeR CaSe ChArAcTeR To LoWeR CaSe ChArAcTeR AnD ViCe VeRsA";
        String result="";
        char arr[]=s.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(Character.isUpperCase(ch)){
                result=result+Character.toLowerCase(ch);
            }else if(Character.isLowerCase(ch)){
                result=result+Character.toUpperCase(ch);
            }else{
                result=result+" ";// add space
            }
        }
        System.out.println(result);
    }
    
}
