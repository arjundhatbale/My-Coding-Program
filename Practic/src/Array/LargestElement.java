package com.Array;

// java program to find largest element in array

public class LargestElement {

	public static void main(String[] args) {
		
		int arr[] = {23,43,45,24,3,54,65,645,25,1,78,61};
		
		// declare largest element
		int largestElement = arr[0];
		
		// find largest element 
		
		for(int num : arr) {
			if(largestElement < num) {
				System.out.println("largest element = " + largestElement + " compare with :   num = " + num );
				largestElement = num;  // if if condition is true then largest element shift to arr[+1];
			}
		}
		System.out.println("Largest Element is : " + largestElement);
		
	}
}
