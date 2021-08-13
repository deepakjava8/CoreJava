package com.strarray;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar_1 {
public static void main(String[] args) {
	findFirstNonRepeatingChar("aabbccdedfke");
}
public static void findFirstNonRepeatingChar(String str) {
	Map<Character, Integer> map=new LinkedHashMap<>();
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(map.containsKey(ch[i])) {
			map.put(ch[i], map.get(ch[i])+1);
		}else {
			map.put(ch[i], 1);
		}
	}
	for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		if(entry.getValue()==1) {
			System.out.println(entry.getKey());
			break;
		}
	}
}
}
