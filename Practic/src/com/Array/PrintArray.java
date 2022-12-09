package com.Array;
import java.util.Arrays;
public class PrintArray {

	public static void main(String[] args) {
		
		int [] array = { 1,3,4,5,6,7};
		
		for(int  no : array) {
			 System.out.print(no + ",  ");
		}
		System.out.print("\n" + Arrays.toString( PrintArray.standardArray()));
	}
	
	// print an array using standard Library Arrays
	public static int[] standardArray( ) {
		int[] standArray = { 2,3,4,6,7,9,0,8};
		
		return standArray;
	}
}
