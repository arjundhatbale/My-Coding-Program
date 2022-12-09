package com.ExceptionHandling.iostream;

import java.io.IOException;
import java.io.File;

public class secondFilecration {

	public static void main(String[] args) {
		try {
			File object = new File("SecondFileCreation.txt");
			if(object.createNewFile()) {
				System.out.println("Another SeCond file Created >> " + object.getName());
			}else {
				System.out.println("this file is already created. ");
			}
		}
		catch(IOException exc) {
			System.out.println("If try bloc is tre then something error is occured during programing ");
			exc.printStackTrace();
		}
	}
}
