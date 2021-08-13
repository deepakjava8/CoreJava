package com.logic;

import java.util.HashMap;
import java.util.Map;

public class SumOf2Numbers {
public static void main(String[] args) {
	int[] array= {3,2,4,5,6,8};
	int target=5;
	
	int[] result = returnIndexOfSum(array, target);
	System.out.println(result[0] +","+result[1]);
}

public static int[] returnIndexOfSum(int[] array,int target) {
	Map<Integer, Integer> map=new HashMap<>();
	for(int i=0;i<array.length;i++) {
		int remaining=target-array[i];
		
		if(map.containsKey(remaining)) {
			return new int[] {i,map.get(remaining)};
		}else {
			map.put(array[i], i);
		}
		
	}
	return new int[] {-1,-1};
}
}
