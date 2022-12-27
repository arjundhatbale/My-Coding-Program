package com.ExceptionHandling.iostream;
import java.io.File;
public class NewFile {

	public static void main(String[] args) {
		try {
			File object = new File("PracticeOfNewFilecreation.txt");
			
			if(object.createNewFile()) {
				System.out.println("New file Created" + object.getName());
			}else {
				System.out.println("File is already existed.");
			}
		}catch(Exception e) {
			System.out.println("Some error is occured .");
			System.out.println(e);
		}
		
	}

}
