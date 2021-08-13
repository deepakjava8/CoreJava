package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Emp99{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp99 [id=" + id + ", name=" + name + "]";
	}

	
}
public class Test4 {
@SuppressWarnings("unlikely-arg-type")
public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<String, Integer>();
	List<Emp99> eList=new ArrayList<>();
	Emp99 e1=new Emp99();
	e1.setId(101);;
	e1.setName("Amit");
	
	Emp99 e2=new Emp99();
	e2.setId(102);;
	e2.setName("Naveen");
	eList.add(e1);
	eList.add(e2);
	
	/*eList.stream().filter(Emp99::getName).collect(Collectors.toList());
	System.out.println(list2);*/
	
	map.put("Amit", 20);
	map.put("Naveen", 30);
	map.put("Preetham", 32);
	map.put("Akhil", 34);
	map.put("Biswa", 40);
	map.put("Sarath", 60);
	map.put("Himanshu", 80);
	
	Map<String, Integer> result = map
	.entrySet()
	.stream()
	.filter(m1->m1.getValue().intValue()>40)
	.collect(Collectors.toMap(m->m.getKey(), m->m.getValue()));
	
	System.out.println(result);
	
	Map<String, Integer> result2 = map.entrySet().stream().filter(m->m.getKey().equals("Akhil")).collect(Collectors.toMap(m->m.getKey(), m->m.getValue()));
	
	System.out.println(result2);
	
	List<String> list = map.keySet().stream().collect(Collectors.toList());
	List<String> result99 = list.stream().filter(name->!name.equals("Naveen")).collect(Collectors.toList());
	result99.forEach(e->System.out.println(e));
	System.out.println("==============");
	String name = list.stream().filter(n->n.equals("Naven")).findAny().orElse(null);
	System.out.println(name);
	
	map.entrySet().stream()
	.filter(m->m.getKey().equals("Akhil"))
	.collect(Collectors.toMap(m->m.getKey(), m->m.getValue()));
}
}
