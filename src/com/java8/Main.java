package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		

		List<Employee> list=new ArrayList<>();
		list.addAll(
				Arrays.asList(
						new Employee("Amit", 101),
						new Employee("Naveen", 102),
						new Employee("Biswa", 103),
						new Employee("Rajesh", 104),
						new Employee("Himanshu", 105),
						new Employee("Akhil", 106)
				)
		);
		
		System.out.println(list);
		
		/*Collections.sort(list, new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpName().compareTo(o2.getEmpName());
			}
		});*/
		Collections.sort(list, (o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName()));

		System.out.println(list);
}
}