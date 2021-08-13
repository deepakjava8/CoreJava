package com.array;

import java.util.Arrays;
import java.util.Scanner;

//write a program to print top 2 elements of an array
public class TopTwoElements {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the  Array:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the Array:");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("the top two elements of the Array:");
        System.out.println(arr[size - 1]+" "+arr[size - 2]);
    }

}
