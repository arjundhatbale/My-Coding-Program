package com.Array;
import java.util.Arrays;
// java program to Concatenate Array

public class ConcatinateArray {

	public static void main(String[] args) {
		
		int [] arr1 = { 2,3,4};
		int [] arr2 = {5,6,7};
		
		int [] Concatinating = new int [arr1.length + arr2.length];
		
		System.arraycopy(arr1, 0, Concatinating, 0, arr1.length);
		System.arraycopy(arr2, 0, Concatinating, arr1.length,arr2.length);
		
		// print copy array by using toString method
		
		System.out.println("Copied Array is >> " + Arrays.toString(Concatinating));
		
		Concatinating = CopyArray(arr1, arr2);
		System.out.println(Concatinating);
	}
	public static int [] CopyArray (int [] arr1, int [] arr2) {
		
		int length = arr1.length + arr2.length;
		int [] arr3 = new int [length];
		
		int index = 0; 
		
		for(int element : arr1) {
			arr3[index] = element;
			index++;
		}
		
		for(int element : arr2) {
			arr3[index] = element;
			index++;
		}
		System.out.println("Copied Array without using .copyarray() is >> " + Arrays.toString(arr3));
		return arr3;
	}
}
