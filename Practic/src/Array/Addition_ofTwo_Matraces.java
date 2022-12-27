package com.Array;

// Java Program to Ad Two Matrix Using Multi-dimensional Arrays

public class Addition_ofTwo_Matraces {

	public static void main(String[] args) {
		int rows = 2, column = 3;
		
		int [][] firsM = {{2,4,4},{34,23,54}};
		int [][] secondM = {{ 43,32,54},{64,34,62}};
		
		int [][] sum = new int [rows][column];
		for(int i=0; i<rows; i++) {
			for(int j = 0; j<column; j++) {
				sum [i][j]= firsM[i][j] + secondM[i][j];
			}
		}
		
		// Print Output
		System.out.println("sum of two matrices is : ");
		
		for(int [] a : sum ) {
			for (int b : a ) {
				System.out.print(b+ ", ");
			}
			System.out.println();
		}
	}
}
