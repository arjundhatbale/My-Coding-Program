package com.ExceptionHandling.iostream;

import java.io.File;

// Import the IOException to handle error
import java.io.IOException;

public class CreatNewFile {
public static void main(String[] args) {
	try
	{
		File object = new File("NewFile.txt");
		if(object.createNewFile()) {
			System.out.println("File created : >> " + object.getName());
		}else {
			System.out.println("File already exists.");
		}
	}
	catch (IOException ex) {
		System.out.println("An error has occured. ");
		ex.printStackTrace();
	}
	
}
}
