package com.String;

import java.util.*;

public class MostRepeatedWord {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        String words[] = s.split(" ");
        List<String> myList = new ArrayList();
        for(int i = 0; i < words.length; i++)
            myList.add(words[i]);

        Set<String> mySet = new TreeSet(myList);
        TreeMap<Integer,String> myMap = new TreeMap<>();
        for(String str:mySet)
        {
            int value = Collections.frequency(myList, str);
            myMap.put(value, str);
        }

        int key = (int)myMap.lastKey();
        System.out.println("The most repeated word is: "+myMap.get(key)+"-->"+key);
    }

}
