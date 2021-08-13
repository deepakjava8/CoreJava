package com.strarray;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {
	public static void main(String[] args) {
		longestsubstr("ababcd");
//	String longest = longest("ababcd");
//	System.out.println(longest);
	}

	public static void longestsubstr(String s) {
		String longestSubString = null;
		int longestSubStringLength = 0;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
			if (map.size() > longestSubStringLength) {
				longestSubStringLength = map.size();
				longestSubString = map.keySet().toString();
			}
		}
		System.out.println("The longest sub string : " + longestSubString);
		System.out.println("The longest sub string length : " + longestSubStringLength);
	}

	public static String longest(String s) {
		HashSet<Character> set = new HashSet<>();
		String longestOverall = "";
		String logestTilnow = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (set.contains(c)) {
				logestTilnow = "";
				set.clear();
			}
			set.add(c);
			logestTilnow += c;
			if (logestTilnow.length() > longestOverall.length()) {
				longestOverall = logestTilnow;
			}
		}
		return longestOverall;
	}
}
