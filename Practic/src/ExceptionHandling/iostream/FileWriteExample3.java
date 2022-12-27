package com.ExceptionHandling.iostream;
import java.io.FileWriter;
import java.io.Writer;

public class FileWriteExample3 {

	public static void main(String[] args) {
		
		try {
			FileWriter object = new FileWriter("FileWriterExample3.txt");
			object.write("Welcom to java T point");
			object.close();
		}catch(Exception e) {
			System.out.println("Succesfully Writer the Messeage.");
			System.out.println(e);
		}
		System.out.println("Message send");
	}
}
