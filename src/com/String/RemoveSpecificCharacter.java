package com.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//write a program to remove a specific character from a string.
public class RemoveSpecificCharacter {
    public static void main(String args[])
    {
        String s = "abcdefghijklmnopqrs";
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        System.out.println("Enter the character: ");
        try
        {
            char ch = (char)br.read();
            boolean flag = s.contains(ch+"");
            System.out.println(flag);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
