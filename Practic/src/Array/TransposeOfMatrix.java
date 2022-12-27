package com.Array;

// Transpose of Matrix

public class TransposeOfMatrix {

	public static void main(String[] args) {
		
		int row = 3 , column = 2; 
		
		int [][] arr = {{2,3},{4,5},{6,7}};
		System.out.println("Original  Matrix Array : ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				 System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
		
		int [][] transpose = new int[column][row];
		
		for(int i = 0; i < column; i++) {
			for(int j = 0; j < row; j++) {
				transpose [i][j] = arr[j][i];
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix Array : ");
		display(transpose);
	}
	public static void display(int [][] arr) {
		for(int []num : arr) {
			for(int n : num) {
				System.out.print(n  + "  ");
			}
			 System.out.println();
		}
	}
}
