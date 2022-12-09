package com.DecisionMakingAndLoop;

// write  a program to find LCM of two number

public class LCM {
 
	public static void main(String[] args) {
		
		int num1 = 72, num2 = 120, lcm;
		
		lcm = (num1 > num1)? num1 : num1;
		
		while(true) {
			if(lcm % num1 == 0 && lcm % num2 == 0) {
				System.out.printf("LCM of %d and %d is = %d", num1, num2, lcm);
				break;
			}
			++lcm;
		}
		LCM obj = new LCM ();
		obj.GCM();
	}
	/*
	 * find the lcm by using GCM 
	 * 
	 * lcm = (n1 * n2) / GCM
	 * 
	 * for that we have to calculate GCM
	 */
	void GCM() {
		System.out.println("\nFind GCM with the help of lcm.");
		int n1 = 72, n2 = 120, i;
		int GCM = 1;
		i = (n1 < n2)? n1 : n2;
		 
		while(i >= 1 ) {
			if(n1 % i == 0 && n2 % i == 0) {
				GCM = i;
				break;
			}
			--i;
		}
		
		int lcm = (n1 * n2) / GCM;
		
		System.out.printf("LCM   AND GCM  of num1 %d, and num2 %d, is %n LCM = %d. %n GCM = %d.",n1, n2, lcm, GCM);
		
	}
}
