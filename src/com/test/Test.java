package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Test {
	static Map<String, Integer> map = new HashMap<>();
	
	public static Map<String, Integer> sortByKey(Map<String, Integer> hm){
		List<Map.Entry<String, Integer>> list=new ArrayList<>(hm.entrySet());
		Collections.sort(list,(i1,i2)->i1.getKey().compareTo(i2.getKey()));
		Map<String, Integer> temp = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry : list) {
			temp.put(entry.getKey(), entry.getValue());
		}
	
		return temp;
	}
public static void main(String[] args) {
	 map.put("Jayant", 80);
     map.put("Abhishek", 90);
     map.put("Anushka", 80);
     map.put("Amit", 75);
     map.put("Danish", 40);
     Map<String, Integer> sortByKey = sortByKey(map);
     for(Map.Entry<String, Integer> entry : sortByKey.entrySet()) {
    	 System.out.println("key : "+entry.getKey()+"\t"+"value : "+entry.getValue());
     }
     
}
}
