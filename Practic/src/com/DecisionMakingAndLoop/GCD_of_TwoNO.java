package com.DecisionMakingAndLoop;

// find the greatest common divisior between two no

public class GCD_of_TwoNO {

	public static void main(String[] args) {
		
		int n1 = 50; 
		int n2 = 100;
		
		// initially GCD is 1
		int GCD = 1;
		
		for(int i=1; i <= n1 && i <= n2; i++) {
			
			// check if i perfectly divides both n1 and n2
			
			if(n1 % i == 0 && n2 % i == 0) {
				System.out.println(GCD = i);
			}
		}
		System.out.println("GCD OF " + n1 + " and " + n2 + " is " + GCD);
		GCD_of_TwoNO obj = new GCD_of_TwoNO();
		obj.m();
	}
	void m() {
		System.out.println("GCD by using small and greater no");
		int n1 = 81; 
		int n2 = 153;
		int GCD = 1;
		int small ;
		small = (81 < 153)? 81 : 153;
		
		System.out.println("Small no is : " + small);
		
		for(int i=small; i>=1; i--) {
			if(n1 % i == 0 & n2 % i == 0) {
				GCD = i;
				break;
			}
		}
		System.out.println("GCD OF " + n1 + " and " + n2 + " is " + GCD);
	}
}
