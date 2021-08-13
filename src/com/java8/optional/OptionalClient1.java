package com.java8.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Employee{
	private String name;
	public Employee() {}
	public Employee(String name) {}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
}
public class OptionalClient1 {
public static void main(String[] args) {
	/*List<Employee> list=new ArrayList<>();
	list.add(new Employee("Amit"));
	list.add(new Employee("Biswa"));
	list.add(new Employee("Naveen"));*/
	List<Integer> list = new ArrayList<>(Arrays.asList(1, 6, 3, 4, 8));
	
	Optional<Integer> emp = findEmployee(list);
	System.out.println(emp.get());
}
public static Optional<Integer> findEmployee(List<Integer> list){
	for(Integer emp : list) {
		if(emp==6) {
			return Optional.ofNullable(emp);
		}
	}
	return null;
}
}
