package com.ExceptionHandlingSerializatin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDemo {
	private static Demo object1;

	public static void main(String[] args) {
		
		Demo object = new Demo(1, "Practice Serialization");
		String filename = "file.ser";
		
		// Serialization 
		
		try {
			
			// Saving of object in a file
			
			FileOutputStream file = new FileOutputStream(filename);
			
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// Method for serialization of object 
			
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialized...");
		}catch(IOException ex) {
			System.out.println("IOException is caugh.. ");
		}
		
		Demo objct1  = null;
		
		// Deserialization 
		
		try {
			// Readign the objectfrom a file
			
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Method foe Deserialization of object 
			
			object1 = (Demo) in.readObject();
			
			in.close();
			file.close();
			
			System.out.println("Obect has been Deseriaized ...");
			System.out.println("name >> " + object1.name);
			System.out.println("id >> " + object1.no);
			
		}catch(IOException ex) {
			System.out.println("IOException is caught.. ");
		}catch(ClassNotFoundException cle) {
			System.out.println("Class not found exception is caught ");
		}
	}
}
