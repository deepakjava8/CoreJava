package com.test1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]

Input: nums = [2,7,11,15], target = 9
Output: [0,1]


 */
public class SortedTest {
public static void main(String[] args) {
	
	int a[]=new int[] {3,2,4};

	
	int target=9;
	boolean twoSum = twoSum(a,target);
	System.out.println(twoSum);
	
	
	/*for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			for(int k=i+1;k<a.length;k++) {
			if(a[i]+a[j] ==target) {
				System.out.println(a[i] +" "+ a[j]);
				System.out.println(i +"\t"+ j);
			}
			}
		}
	}*/
}

public static boolean twoSum(int[] nums, int target) {
    if(nums.length == 0 || nums == null) return false;

    Map<Integer, Integer> complementMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
         int curr = nums[i];
         if(complementMap.containsKey(target - curr)){
           return true;
         }
    complementMap.put(curr, i);
    }
  return false;
}
}
