package com.Array;
import java.text.DecimalFormat;
// java program to calculate the Standadr Deviation

public class StandardDeviation {

	public static void main(String[] args) {
		DecimalFormat obj = new DecimalFormat("0.00");
		long [] array  = {23, 32 , 676,75,3,234,767,45768,67};
		double Sanddard_Deviation = SD(array);
		System.out.println("Sanddard deviation is  : " + obj.format(Sanddard_Deviation));
		
	}
	public static double SD(long  array[]) {
		long sum = 0, sDeviation = 0, length;
		length = array.length;
		
		for(long num : array ) {
			sum += num;
		}
		double   avg = sum / length;
		
		for(double num : array) {
			sDeviation += Math.pow(avg - num, 2);
		}
		return Math.sqrt(sDeviation/length);
	}
}
