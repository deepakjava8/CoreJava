package com.strarray;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountRepeatedChar1 {
public static void main(String[] args) {
	System.out.println(countDuplicats("aaabbbcc"));
}

public static String countDuplicats(String value) {
	String data=value;
	char[] ch=data.toCharArray();
	Map<Character, Integer> map=new LinkedHashMap<>();
	for(int i=0;i<ch.length;i++) {
		if(!map.containsKey(ch[i])) {
			map.put(ch[i], 1);
		}else {
			map.put(ch[i], map.get(ch[i])+1);
		}
	}
	StringBuilder sb=new StringBuilder();
	for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		sb.append(entry.getKey());
		sb.append(entry.getValue());
	}
	return sb.toString();
}
}
