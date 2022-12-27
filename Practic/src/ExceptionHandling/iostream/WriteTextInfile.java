package com.ExceptionHandling.iostream;

import java.io.Writer;
import java.io.FileWriter;
 
import java.io.IOException;

public class WriteTextInfile {

	public static void main(String[] args) {
		try {
			FileWriter write = new FileWriter("D:\\Study Material\\General JAVA STORAGE\\General Eclips IDE\\Practic\\src\\com\\ExceptionHandling\\iostream\\NewFile.txt");
			write.write("Fist line and send line written");
			System.out.println("Program succesfully writen");
		}catch(IOException e) {
			System.out.println("Some error occued");
			e.getStackTrace();
		}
	}
}
