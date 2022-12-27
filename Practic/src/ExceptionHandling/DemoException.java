package com.ExceptionHandling;

public class DemoException {

	public static void main(String[] args) {
		
		int i,j,k = 0 ;
		int a []  =  new int [6];
		i = 9;
		j = 2;
		//k = i / j;
		System.out.println(k);
		try {
			k = i / j;
			for(int s = 0; s<= 6; s++) {
				a[s] = s+1;
			}
			for(int value :a) {
				System.out.println("Value = " + value);
			}
		}catch(ArithmeticException e) {
			System.out.println( e);
			System.out.println("can not divide by zero");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
	}
	}

