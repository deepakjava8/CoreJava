package com.test;

import java.util.Arrays;

public class Test13 {
public static void main(String[] args) {
	String str="tic tac is act as cat";
	System.out.println(test("deepak","padeek"));
}

public static boolean test(String str1,String str2) {
	if(str1.length() == str2.length()) {

	      // convert strings to char array
	      char[] charArray1 = str1.toCharArray();
	      char[] charArray2 = str2.toCharArray();

	      // sort the char array
	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);

	      // if sorted char arrays are same
	      // then the string is anagram
//	      boolean result = Arrays.equals(charArray1, charArray2);
	     /* boolean result = Arrays.equals(charArray1, charArray2);

	      if(result) {
	        System.out.println(str1 + " and " + str2 + " are anagram.");
	      }
	      else {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	      }
	    }
	    else {
	      System.out.println(str1 + " and " + str2 + " are not anagram.");
	    }*/
	      
	      return Arrays.equals(charArray1, charArray2) ? true : false;
	}
	return false;
	
}
}
