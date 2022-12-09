package com.ExceptionHandling;
import java.io.*;
public class P10 {

	public static void main(String[] args) throws IOException{
		
			FileReader file = new FileReader("C:\\Users\\arjun\\OneDrive\\Desktop");
			
			BufferedReader fileInput = new BufferedReader(file);
			
			for(int counter = 0; counter < 3; counter ++ ) {
				System.out.println(fileInput.readLine());
				
				fileInput.close();
			}
	}}
