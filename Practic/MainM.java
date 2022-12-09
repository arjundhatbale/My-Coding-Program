package com.contactmodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.contactbean.Person;

public class Main {
			public static List<Person> list =new ArrayList<Person>();
			public static Scanner sc=new Scanner(System.in);
			public String saveContact() {
				Person p=new Person();
				System.out.println("Enter name of the Person :");
				String name=sc.next();
				System.out.println("Enter Contact Number of Person :");
				String number=sc.next();
				
				p.setName(name);
				p.setNumber(number);
				
				list.add(p);
				return "Contact Saved";
				
			}
			public void viewContact(List<Person> list) {
				for(Person p:list) {
					System.out.println(p.getName()+"\t");
					System.out.println(p.getNumber()+"\n");
					
					
				}
				}
				public void deletContact(List<Person> list) {
					for(Person p:list) {
						System.out.println(p.getName()+"\t");
						System.out.println(p.getNumber()+"\n");

			}
				}

				public void editContact(List<Person> list) {
					for(Person p:list) {
						System.out.println(p.getName()+"\t");
						System.out.println(p.getNumber()+"\n");

}
				}
}








