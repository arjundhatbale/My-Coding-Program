package com.ExceptionHandling;

public class TextFile {

	public static void main(String[] args) {
		int a = 1400;
		int b = 800;
		try {
			if(a < b) {
				throw new ArithmeticException("a is less than b");
			}else {
				System.out.println("can not withdraw");
				a -= b;
				System.out.println("Payment is successfull..." + a);
			}
		}catch (ArithmeticException e) {
			 System.out.println("Exception caught.???");
			 System.out.println(e.getMessage());
		}
	}
}
