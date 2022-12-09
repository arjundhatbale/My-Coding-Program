package com.Object_and_Classes;

// .toString()method 

public class ToStringMethod {

	int rollno;
	String name;
	String city;
	
	ToStringMethod(int rollno ,String name, String sity){
		this.rollno = rollno;
		this.name = name;
		this.city = sity;
	}
	
	@Override
	public String toString() {
		return "ToStringMethod [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		
		ToStringMethod object1 = new ToStringMethod(323,"raj","Mumbai");
		ToStringMethod object2 = new ToStringMethod(42,"arjun","kannd");
		System.out.println(object1);
		System.out.println(object2);
	}
}
