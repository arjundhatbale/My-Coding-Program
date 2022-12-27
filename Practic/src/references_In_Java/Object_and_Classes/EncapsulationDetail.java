package com.Object_and_Classes;

public class EncapsulationDetail {

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		
		obj.setStudentAge(32);
		obj.setStudentName("Arjun");
		obj.setSudentRollNo(436);
		
		System.out.println("Student name : " + obj.getStudentName());
		System.out.println("Student roll no : " + obj.getstudentRollNo());
		System.out.println("Student age : " + obj.getStudentAge());
	}
}
