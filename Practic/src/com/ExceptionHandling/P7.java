package com.ExceptionHandling;

public class P7 {
	static void fun() {
		 try
		 {
			throw new NullPointerException( ); 
		 }
		 catch ( NullPointerException d){
			 System.out.println("Fountd in fun method");
			 throw d;
		 }
	}
	public static void main(String[] args) {
		 try {
			 fun();
		 }catch(NullPointerException d) {
			 System.out.println("Caught in main method ");
		 }
	}
		 
}
