package com.ExceptionHandling.iostream;
import java.io.FileWriter;

public class FileWriteEx {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\Study Material\\General JAVA STORAGE\\General Eclips IDE\\Practic\\src\\com\\ExceptionHandling\\iostream.txt");
			fw.write("I'm tryint to be good programer.>>");
			fw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Successfully Program Executed . ");
	}
	 
}
