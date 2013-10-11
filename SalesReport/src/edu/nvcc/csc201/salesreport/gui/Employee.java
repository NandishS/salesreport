package edu.nvcc.csc201.salesreport.gui;

public class Employee extends Person {
	public Employee() {
		this("Two");
		System.out.println("Three");
	}
	public Employee(String s) {
		System.out.println(s);
	}
	
	public String toString() {
		return super.toString() + "\n Two \n Three\n ";
	}
}
