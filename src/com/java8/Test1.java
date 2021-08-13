package com.java8;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface I{
	public List<Emp> getEmp(List<Emp> list);
}
public class Test1{
	
public static void main(String[] args) {
	List<Emp> list=new ArrayList<>();
	I i=t->{
		Emp e1=new Emp("Naveen","naveen.c@dell.com","99999");
		Emp e2=new Emp("Biswa","biswa@dell.com","77777");
		Emp e3=new Emp("Akhil","akhil.s@dell.com","88888");
		Emp e4=new Emp("Himnshu","himanshu@dell.com","666666");
		Emp e5=new Emp("Preetham","preetham@dell.com","555555");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		return list;
	};
	i.getEmp(list);
	list.forEach(System.out::println);
	System.out.println(i.getEmp(list));
//	list.stream(
}
}

class Emp{
	String name;
	String email;
	String phone;
	public Emp() {}
	public Emp(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
