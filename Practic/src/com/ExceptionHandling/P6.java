package com.ExceptionHandling;

// Java program to demonstrate need of try catch clause

public class P6 {

	public static void main(String[] args) {
		
		int [] arr = new int [4];
		try {
		int i = arr[4];
		}catch(ArrayIndexOutOfBoundsException ext) {
			System.out.println(ext);
			System.out.println("Hi, I want to execute");
		}
		
	}
}
