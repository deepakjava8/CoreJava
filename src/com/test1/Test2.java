package com.test1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
public static void main(String[] args) {
	List list=Arrays.asList("A","B","C","D","E");
	List list2=Arrays.asList("A");
	add(list);
	add(list2);
	
}

public static void add(List<String> list) {
	TreeMap<String, Integer> map = new TreeMap<>();
	for(String s : list) {	
		
		if(map.containsKey(s)) {
			map.put(s, map.get(s)+1);
		}else {
			map.put(s, 1);
		}
		/*if(map.size()>5) {
			
			map.remove(map.firstKey());	
		}*/
	}
	for(Map.Entry<String, Integer> entry : map.entrySet()) {
		System.out.println(entry.getKey()+"\t"+entry.getValue());
		
	}
}
}
