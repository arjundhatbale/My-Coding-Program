package com.ExceptionHandling.iostream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFistFile {

	public static void main(String[] args) {
		try {
			File obj = new File("HTML Search.txt");
			Scanner scanner = new Scanner(obj);
			
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
				
			}
			scanner.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("There should be multiple lines or not. ");
			e.fillInStackTrace();
		}
	}
}
