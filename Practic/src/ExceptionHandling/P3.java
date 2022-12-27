package com.ExceptionHandling;

// Program to print the exception information using printStackTrace() Method
import java.io.*;
public class P3 {

	public static void main(String[] args) {
		
		int a = 4; 
		int b  = 0; 
		try {
			System.out.println(a/b);
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
