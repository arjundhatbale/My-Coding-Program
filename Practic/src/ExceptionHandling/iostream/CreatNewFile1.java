package com.ExceptionHandling.iostream;
import java.io.File;
import java.io.IOException;

public class CreatNewFile1 {

	public static void main(String[] args) {
		try {
			File obj = new File("MyFileCreatePractice.txt");
			if(obj.createNewFile()) {
				System.out.println("New File Created >> " + obj.getName());
			}else {
				System.out.println("File already existed in this folder. ");
			}
		}catch(IOException exc) {
			System.out.println("An error hasoccured if the try block true");
			exc.printStackTrace();
		}
	}
}
