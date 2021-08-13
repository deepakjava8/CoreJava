package com.test1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test6 {
public static void main(String[] args) {
	//System.out.println(reverseString("deepak"));
	
	String[] str= {"Amazon","Flipkart","GCP","Ali Baba","Amazon","Azure","Azure","GCP"};
	//brute force
	for(int i=0;i<str.length;i++) {
		for(int j=i+1;j<str.length;j++) {
			if(str[i].equals(str[j])) {
				System.out.println(str[i]);
			}
		}
	}
	System.out.println("*********************");
	//HasSet
	Set<String> set=new HashSet<>();
	for(String s : str) {
		if(set.add(s) == false) {
			System.out.println(s);
		}
	}
	System.out.println("*********************");
	//HashMap
	Map<String, Integer> map=new HashMap<>();
	for(String s : str) {
		if(map.containsKey(s)) {
			map.put(s,map.get(s)+1);
		}else {
			map.put(s, 1);
		}
	}
	for(Map.Entry<String, Integer> entry : map.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey());
		}
	}
	System.out.println("*********************");
	//Using Stream
	Set<String> dataSet=new HashSet<>();
	Set<String> collect = Arrays.asList(str).stream().filter(e->!dataSet.add(e)).collect(Collectors.toSet());
	System.out.println(collect);
}
public static String reverseString(String str) {
	char[] ch=str.toCharArray();
	String rev="";
	for(int i=ch.length-1;i>=0;i--) {
		rev=rev+ch[i];
	}
	return rev;
}
}
