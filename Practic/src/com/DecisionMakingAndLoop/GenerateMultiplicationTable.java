package com.DecisionMakingAndLoop;

// multiplication table
public class GenerateMultiplicationTable {

	public static void main(String[] args) {
		
		int num = 5;
		
		for(int i=1; i<=10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		GenerateMultiplicationTable obj = new  GenerateMultiplicationTable();
		obj.m();
	}
	void m() {
		System.out.println("Multiplication table by using while loop");
		int no = 5;
		int i = 1;
		while(i <= 10) {
			System.out.println(no + " * " + i + " = " + (no*i));
			i++;
		}
	}
}
