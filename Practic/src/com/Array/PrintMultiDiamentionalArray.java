package com.Array;
import java.util.Arrays;

// java program to print multidiamentinal array

public class PrintMultiDiamentionalArray {

	public static void main(String[] args) {
		
		int [][] mulArray = {{22,32},{43,64,6,76,9},{3,6, 89}};
		
		// print array
		
		System.out.println("Print MultiDiamentional Array :- \n>>" +  Arrays.deepToString(mulArray));
	}
}
