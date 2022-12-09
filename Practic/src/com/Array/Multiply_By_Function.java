package com.Array;

// multiply the 2 array by using function
// condtind for function multiply is 
// c1 = r2
// multiply is c2*r1

public class Multiply_By_Function {

	
	public static int [][] multiplicationIs(int [][]arr1, int [][] arr2, int r1, int c1, int c2) {
		int[][] product = new int[r1][c2];
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c2; j++) {
				for(int k = 0; k < c1; k++) {
					product[i][j] = arr1[i][k] * arr2[k][i];
				}
			}
		}
		return product;
	}
	public static void display(int [][]product ) {
		 System.out.println("Product of two matrices is: ");
		for(int [] no : product) {
			for(int n : no) {
				System.out.print(n + ", ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr1[][] = {{23,3,4},{2,53,62}};
		int arr2[][] = {{42,43},{2,54},{42,8}};
		
		int r1 = 2, c1 = 3;
		int r2 = 3, c2 = 2;
		
		int [][] Multiplication = multiplicationIs(arr1,arr2,r1,c1,c2);
		 
		display(Multiplication);
		
		
	}
}
