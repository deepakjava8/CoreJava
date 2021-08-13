package com.test1;

import java.util.Arrays;

public class Test5 {
public static void main(String[] args) {
	isAnagram("Deepak", "kaepee");
}
public static void isAnagram(String str1,String str2) {
	boolean status=true;
	if(str1.length()!=str2.length()) {
		status= false;
	}
	char []arrS1=str1.toLowerCase().toCharArray();
	char []arrS2=str2.toLowerCase().toCharArray();
	Arrays.sort(arrS1);
	Arrays.sort(arrS2);
	status=Arrays.equals(arrS1, arrS2);
	if(status) {
		System.out.println(str1 +" and "+str2+" are anagram.");
	}else {
		System.out.println(str1 +" and "+str2+" are not anagram.");
	}
}
}
