package com.ExceptionHandling.iostream;
import java.io.FileOutputStream;
public class testout {

	public static void main(String[] args) {
		try {
			FileOutputStream object = new FileOutputStream("Practice1.txt");
			object.write(65);
			object.close();
		}catch(Exception e) {
			System.out.println("Successful. ");
			System.out.println(e);
		}
	}
}
