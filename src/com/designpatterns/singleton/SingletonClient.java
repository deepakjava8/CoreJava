package com.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class EmployeeSingleton implements Serializable{

	private static final long serialVersionUID = 3939322862873231767L;
	
	private static EmployeeSingleton INSTANCE;
	private int empId;
	private EmployeeSingleton() {	
		if(INSTANCE!=null) {
			throw new RuntimeException("Get your object by getEmployeeInstance()");
		}
	}
	
	public static EmployeeSingleton getEmployeeInstance() {
		if(INSTANCE==null) {
			INSTANCE=new EmployeeSingleton();		
		}
		return INSTANCE;
	}
	
	 Object readResolve() {
		return INSTANCE;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
}
public class SingletonClient {
public static void main(String[] args) throws Exception {
	EmployeeSingleton emp1 = EmployeeSingleton.getEmployeeInstance();
	emp1.setEmpId(101);
	
	String fileName="SingletonClient.txt";
	serializeData(emp1, fileName);
	
	emp1.setEmpId(200);
	EmployeeSingleton emp2 = deSerializeData(fileName);
	System.out.println(emp1==emp2);
	System.out.println(emp1.hashCode());
	System.out.println(emp2.hashCode());
	
	System.out.println(emp1.getEmpId());
	System.out.println(emp2.getEmpId());
	
	
	
}

//serialization
static void serializeData(EmployeeSingleton employeeSingleton, String fileName) throws Exception{
	try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName))){
		oos.writeObject(employeeSingleton);
	}
}


//deserialization
static EmployeeSingleton deSerializeData(String fileName) throws Exception{
	try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileName))){
		return (EmployeeSingleton)ois.readObject();
		
	}
}
}
