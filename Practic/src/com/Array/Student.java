package com.Array;

public class Student {

	int id; 
	String name;
	long number;
	
	public Student(int id, String name, long num) {
		super();
		this.id = id;
		this.name = name;
		this.number = num;
	}
	
	public static void main(String[] args) {
		
		Student [] student = new Student[3];
		student[1] = new Student(283,"Rohit", 54434355);
		student[2] = new Student(43, "Vikas", 43434549);
		student[0] = new Student(58,"Amol", 43);
		
		for(Student std : student) {
			System.out.println("Student class object creatd are >> " + std);
		}
		
		
		
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
}
