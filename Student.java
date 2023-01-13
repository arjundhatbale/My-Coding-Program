package com.General;

import ArrayList.Employee;

public class Student implements Comparable<Student>  {

	String name;
	int RollNo;
	double Marks;
	public Student(String name, int rollNo, double marks) {
		super();
		this.name = name;
		RollNo = rollNo;
		Marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public double getMarks() {
		return Marks;
	}
	public void setMarks(double marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", RollNo=" + RollNo + ", Marks=" + Marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return this.RollNo - o.RollNo; // ascending Order
		//return o.RollNo - this.RollNo;  // Descending Order
		return o.name.compareTo(this.name);// sorting based on Name by descending order
		//return this.name.compareTo(o.name); // sorting in ascending order
	}	

}
