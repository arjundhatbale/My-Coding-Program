package com.Array;

// Java Program to Multiply Two Matrix Using Multi-dimensional Arrays

public class Multiplication_of_Array {

	public static void main(String[] args) {
		
		int row1 = 2, column1 = 3;
		int row2 = 3, column2 = 2;
		
		int [][]firstMatrix = {{2,4,5}, {3,5,2}};
		int [][] secondMatrix = {{2,5},{4,5},{2,0}};
		
		// Multiplying Two Matrices
		int [][] product = new int [row1][column2 ];
		for(int i = 0; i<row1; i++) {
			for(int j = 0; j<column2; j++) {
				for(int k = 0; k < column1 ;k++) {
					product [i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}
		
		// displaying the result 
		for(int []a : product) {
			for(int b : a) {
				System.out.print(b + ", ");
			}
			System.out.println();
		}
	}
}
