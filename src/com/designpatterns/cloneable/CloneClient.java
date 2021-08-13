package com.designpatterns.cloneable;

class Address{
	private String city;
	private String pinCode;
	public Address() {}
	public Address(String city,String pinCode) {
		this.city=city;
		this.pinCode=pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	
}
class Employee implements Cloneable{
	private int id;
	private String name;
	private Address address;
	public Employee(){}
	public Employee(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee emp = (Employee)super.clone();
		emp.setAddress(new Address(getAddress().getCity(), getAddress().getPinCode()));
		return emp;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
public class CloneClient {
public static void main(String[] args) throws Exception {
	Address add1=new Address("Blr", "560076");
	Employee emp1=new Employee(101, "Deepak", add1);
	Object clonedObj = emp1.clone();
	Employee emp2=(Employee)clonedObj;
	
	emp2.setName("Kumar");
	emp2.getAddress().setPinCode("560071");
	System.out.println("------------Original Object-----------");
	System.out.println(emp1);
	System.out.println("------------Cloned Object-----------");
	System.out.println(emp2);
}
}
