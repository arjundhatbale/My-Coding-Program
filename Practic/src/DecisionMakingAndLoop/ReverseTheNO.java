package com.DecisionMakingAndLoop;

// program for reveres the no

public class ReverseTheNO {

	public static void main(String[] args) {
		 
		int no = 235215657;
		int reverse = 0; 
		
		System.out.println("Reverse the no by using while loop :\nOriginal NO is : " + no);
		while(no != 0) {
			int reminder = no % 10;
			reverse = reverse * 10 + reminder;
			no = no / 10;
		}
		System.out.println("Reverse no is : " + reverse);
		ReverseTheNO obj = new ReverseTheNO();
		obj.m();
	}
	void m() {
		int no = 1243523;
		System.out.println("\nReverse the no by using for loop :\nOriginal no is : " + no); 
		int reverse = 0;
		
		for(; no !=0; no /= 10) {
			int reminder = no % 10;
			reverse = reverse * 10 + reminder;
		}
		System.out.println("Reverse no by using for loop is : " + reverse);
	}
}
