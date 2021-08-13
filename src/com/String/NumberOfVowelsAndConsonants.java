package com.String;

import java.util.Scanner;

//write a program to to count number of vowels and consonants in a string.
public class NumberOfVowelsAndConsonants {
    public static void main(String args[]){
        int vowel=0,consonant=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        
        char arr[]=s.toLowerCase().toCharArray();
        
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
                    vowel++;
                }else{
                    consonant++;
                }
            }
        }
        System.out.print("Number of vowels: "+vowel+" And Consonat: "+consonant);
    }
    
}
