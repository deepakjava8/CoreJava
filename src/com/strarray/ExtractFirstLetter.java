package com.strarray;

public class ExtractFirstLetter {
public static void main(String[] args) {
	splitWords("Secure Socket Layer");
	mySplit("Secure Socket Layer");
}
public static void splitWords(String value) {
	String[] str=value.split(" ");
	for(String s : str) {
		System.out.print(s.charAt(0)+" ");
	}
	/*for(int i=0;i<str.length;i++) {
		String s=str[i];
		System.out.println(s.charAt(0));
	}*/
}
public static void mySplit(String str) {
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i) == ' ') {
			System.out.println();
			continue;
		}
		System.out.print(str.charAt(i));
	}
	
}
}
