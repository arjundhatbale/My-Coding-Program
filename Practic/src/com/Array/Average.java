package com.Array;

// java program to find average of num

public class Average {

	public static void main(String[] args) {
		
		double [] arr = {3,234,53,2,3,43,543,3,38};
		double sum = 0.0;
		for(double num : arr) {
			sum = sum + num;
			System.out.print("num = " + num + "   "  );
			System.out.println(sum);
		}
	}
}
