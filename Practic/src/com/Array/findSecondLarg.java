package com.Array;

import java.util.Arrays;

public class findSecondLarg {

	public static void main(String[] args) {
		
		int arr[] = { 2,35,6,23,6,7,63};
		int temp[] = new int[arr.length];
		for(int i = 0; i< arr.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				temp[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(temp) );
	}
}
