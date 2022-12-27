package com.ExceptionHandlingSerializatin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmpSerialize {

	public static void printdata(Emp object1) {
		
		System.out.println("Name = " + object1.name);
		System.out.println("Age = " + object1.age);
		System.out.println("a = " + object1.a);
		System.out.println("b = " + object1.b);
		
	}
	
	public static void main(String[] args) {
		
		Emp object = new Emp("Arjun",23, 50, 100);
		
		String filename = "shubham.txt";
		
		// Serialization
		
		try {
			// Saving of Object in file
			
			FileOutputStream  file  = new FileOutputStream(filename);
			
			ObjectOutputStream out = new ObjectOutputStream(file);
		
			// Method for serialization Object
			
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialized \n" + "Data before Deserialization.");
			
			printdata(object);
			
			// value of static variable changed
			
			object.b = 2000;
		}catch(IOException ex) {
			System.out.println("IOException is caught...");
		}
		
		object = null;
		
		// Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Method for deserialization of object
			
			object = (Emp)in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized...\n" + "Data after Deseralization ...");
			printdata(object);
		}catch(IOException ex) {
			System.out.println("IO Exception is caught...");
		}catch(ClassNotFoundException ex ) {
			System.out.println("Class not found exception " + " is caught ");
		}
	}
}
