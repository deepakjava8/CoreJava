package com.java8;

public class Employee {
private String empName;
private int empID;
public Employee() {}
public Employee(String empName, int empID) {
	this.empName = empName;
	this.empID = empID;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empID=" + empID + "]";
}

}
