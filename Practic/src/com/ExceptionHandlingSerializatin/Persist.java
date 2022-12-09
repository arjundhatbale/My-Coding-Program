package com.ExceptionHandlingSerializatin;
/*
 * Serialize the object of Student class from above code.
 * 
 * The writeObject() methd of ObjectOutputStream class provide the functionality to serialize the object.
 * 
 */
import java.io.*;
public class Persist {

	public static void main(String[] args) {
	
		try {
			// crating the object
			Student student = new Student(211,"ravi");
			//Creating stream and writing the object
			
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(student);
			out.flush();
			// closing the stream
			out.close();
			System.out.println("success");
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}
}
