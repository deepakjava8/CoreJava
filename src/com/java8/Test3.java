package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
public static void main(String[] args) {
	/*System.out.println(
		Arrays.asList("Java","JavaScript","Python","GoLang","Java")
		.stream()
		.filter(x->x.contains("J"))
		.collect(Collectors.toSet())
	);*/
	/*System.out.println(
			Arrays.asList("Java","JavaScript","Python","GoLang","Java")
			.stream()
			.filter(x->x.contains("J"))
			.collect(Collectors.toSet())
		);*/
	
	/*List<Student> list=new ArrayList<Student>();
	list.add(new Student("Raj", 45, Subjects.HINDI));
	list.add(new Student("Rajiv", 60, Subjects.MATH));
	list.add(new Student("Sneha", 80, Subjects.ENGLISH));
	
	System.out.println(
			list
			.stream()
			.collect(Collectors.toMap(Student::getName, Student::getSub))
    );*/
	
	/*List<Student> list=new ArrayList<Student>();
	list.add(new Student("Rajiv", 45, Subjects.SCIENCE));
	list.add(new Student("Rajiv", 60, Subjects.MATH));
	list.add(new Student("Sneha", 80, Subjects.ENGLISH));
	list.add(new Student("Raj", 45, Subjects.HINDI));
	list.add(new Student("Rajiv", 60, Subjects.HINDI));
	list.add(new Student("Sneha", 60, Subjects.SCIENCE));
	
	Map<String, List<Subjects>> map=new HashMap<>();
	list.stream()
	.forEach(s->{
		map.computeIfAbsent(s.getName(), x-> new ArrayList<Subjects>()).add(s.getSub());
	});
	System.out.println(map);*/
	
	/*List<String> list1=Arrays.asList("A","B","C");
	List<String> list2=Arrays.asList("D","E");
	List<String> list3=Arrays.asList("F");
	System.out.println(
			Stream.of(list1,list2,list3).flatMap(List :: stream).collect(Collectors.toList())
	);*/
	
	Map<String, List<String>> map=new LinkedHashMap<String, List<String>>();
	map.put("one", Arrays.asList("A","B","C"));
	map.put("two", Arrays.asList("D","E"));
	System.out.println(
			map.values().stream().flatMap(List :: stream).collect(Collectors.toList())
			);
}

}
