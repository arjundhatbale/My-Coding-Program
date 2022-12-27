package com.Object_and_Classes;

public class ImmutableDemo {

	public static void main(String[] args) {
		Employee e = new Employee("ABC123");
		String s1 = e.getPancardNumber();
		System.out.println("Pancard NUmber = "+ s1);
	}
}
