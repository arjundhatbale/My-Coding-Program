package com.Functions;

public class PrimeNOBetweenTwoInteger {
	public static void main(String[] args) {
		System.out.println("Find prime between two no by using while loop");
		int low = 20, high = 50;
		while(low < high) {
			if(checkPrimeNUmber(low)) {
				System.out.println(low + " ");
				
			}++low;
		}
		PrimeNOBetweenTwoInteger obj = new PrimeNOBetweenTwoInteger();
		obj.m();
	}
    

public static boolean checkPrimeNUmber(int num) {
		boolean flag = true;
		
		for(int i = 2; i <= num / 2 ; ++i) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
    }
void m() {
	System.out.println("Find prime no between two no by using for loop");
	
	int low = 20, high = 50; 
	while(low < high) {
		
		boolean flag = false;
		for(int i = 2; i <= low / 2; ++i) {
			if(low % i == 0) {
				flag = true;
				break;
			}
		}
		if(!flag  && low != 0 && low != 1) {
			System.out.println(low + " ");
		}
		++low;
	}
	}
}

