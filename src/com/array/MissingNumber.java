package com.array;

//write a program to find the missing number from an array starting 
//from 1 and ending with number of your choice
public class MissingNumber {
	public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 6, 7, 8, 9};
        int originalSize = arr.length + 1;
        int number = FindNumber(arr, originalSize);
        System.out.println("Missing number: "+number);
    }

    private static int FindNumber(int arr[], int originalSize)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];

        int totalSize = (originalSize * (originalSize + 1)) / 2;
        int number = totalSize - sum;
        return number;
    }

}
