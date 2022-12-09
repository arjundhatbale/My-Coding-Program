package com.DecisionMakingAndLoop;

// check whether no is positive or negative
public class NoPN {

	public static void main(String[] args) {
		
		double number = 23.2;
		
		// ture if number is less than 0
		if(number < 0.0 ) {
			System.out.println(number + " is na negative number");
		}else if (number > 0.0) {
			System.out.println(number + " is positive number.");
		}else {
			System.out.println(number + " is 0.");
		}
	}
}
