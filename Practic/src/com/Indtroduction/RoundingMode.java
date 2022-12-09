package com.Indtroduction;
import java.text.DecimalFormat;
public class RoundingMode {
	public static void main(String[] args) {
		double number = 2.2423842812;
		System.out.println("Original no: " + number);
		
		double rounded = Math.round(number * 10000) / 10000.0;
		System.out.println("Math.round Method output : " + rounded);
		
		System.out.printf("Format method output : %f" + " \n" , number);
		System.out.println("Remaining no is : " + number);
		
		DecimalFormat object = new DecimalFormat("#.###");
		System.out.println("DecimalFormat method output is : " + object.format(number));
	}
}
