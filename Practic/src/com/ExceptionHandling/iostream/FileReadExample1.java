package com.ExceptionHandling.iostream;
import java.io.FileReader;

public class FileReadExample1 {

	public static void main(String[] args)  throws Exception {
		
		FileReader object  = new FileReader("C:\\Users\\arjun\\OneDrive\\Desktop\\JAVA Search.txt");
		int i ; 
		while((i = object.read()) != -1) {
			System.out.print((char)i);
		}
		object.close();
	}
}
