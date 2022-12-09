package com.ExceptionHandling.iostream;
import java.io.*;
import java.util.Scanner;
public class ReadLineByLine {

	public static void main(String[] args) {
		try
		{
			FileInputStream file = new FileInputStream("C:\\Users\\arjun\\eclipse-workspace\\Programize.com\\src");
			Scanner input = new Scanner(file);
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			input.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
