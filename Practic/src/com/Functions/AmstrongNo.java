package com.Functions;
public class AmstrongNo {	
	public static void main(String[] args) {
		
		int low = 999, high = 99999;
		
		for(int number = low + 1; number < high; ++number) {
			
			if(checkAmstrongNumber(number))
				System.out.println(number + " ");
		}
	}
	public static boolean checkAmstrongNumber(int num) {
		
		int degit = 0;
		int result = 0; 
		int originalNumber = num;
		
		// check the degit number
		while(originalNumber != 0) {
			originalNumber = originalNumber / 10;
			++ degit;
		}
		
		originalNumber = num;
		while(originalNumber !=0) {
			int remainder = originalNumber % 10;
			result += Math.pow(remainder,degit);
			originalNumber /= 10;
		}
		if(result == num)
			return true;
		return false;
	}
}
