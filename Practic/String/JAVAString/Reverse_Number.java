package JAVAString;

import java.util.Scanner;

public class Reverse_Number {
	
	static void Method_1 () {
		System.out.println("Method - 1 : \nEnter a number >> ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int reverse = 1;
		while (num != 0) {
			reverse =  reverse * 10 + num % 10 ; 
			num = num / 10;
			num--;
		}
		System.out.println("Revers num = " + reverse);
	}
	public static void main(String[] args) {
		Method_1();
		
	}
}
