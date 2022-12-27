package com.ExceptionHandlingSerializatin;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Example_2_DeSerialization {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Study Material\\General JAVA STORAGE\\General Eclips IDE\\Practic\\src\\com\\ExceptionHandlingSerializatin\\Example2.txt" );
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject(); // Read the object
			
			ExampleStart_2 obj2 = (ExampleStart_2) obj; // convert to Exampler2 
			
			System.out.println(obj2.firstName);
			System.out.println(obj2.lastName);
			System.out.println(obj2.id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
