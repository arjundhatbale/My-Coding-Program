package com.DecisionMakingAndLoop;

public class CheckLeapYear {
    public static void main(String[] args) {
		
    	// year to be checked
    	int year = 1900;
    	boolean leap = false;
    	
    	// if the year is divided by 4
    	if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
    		leap = true;
    	}else {
    		leap = false;
    	}
    	if (leap) {
    		System.out.println(year + " is Leap year.");
    	}else {
    		System.out.println(year + " is Not Leap year.");
    	}
	}
}
