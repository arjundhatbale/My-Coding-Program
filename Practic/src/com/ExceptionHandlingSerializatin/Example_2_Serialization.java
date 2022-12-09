package com.ExceptionHandlingSerializatin;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Example_2_Serialization {

	public static void main(String[] args) {
		
		ExampleStart_2 example2 = new ExampleStart_2();
		example2.firstName = "Arjun";
		example2.lastName = "Dhatbale";
		example2.id = 3455;
		
		try {
			FileOutputStream obj2 = new FileOutputStream("D:\\Study Material\\General JAVA STORAGE\\General Eclips IDE\\Practic\\src\\com\\ExceptionHandlingSerializatin\\Example2.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(obj2);
			
			oos.writeObject(obj2);
			oos.flush();
			System.out.println("Seralization is Done...");
			
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	 
}
