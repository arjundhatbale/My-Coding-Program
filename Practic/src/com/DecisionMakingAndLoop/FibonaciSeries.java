package com.DecisionMakingAndLoop;

// Fibonaci series

public class FibonaciSeries {

	public static void main(String[] args) {
		
		int no = 10;
		int firstTerm = 0;
		int secondTerm = 1;
		
		System.out.println("Fibonaccci Series till " + no + " terms.");
		
		for(int i=1; i<=no; i++) {
			System.out.println(firstTerm + ", ");
			
			// computer the next 
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		FibonaciSeries obj = new FibonaciSeries();
		obj.m();
	}
	void m() {
		System.out.println("Fabonacci series by using while loop");
		
		int i = 0; 
		int no =10;
		
		int first = 0; 
		int second = 1; 
		while(i < no) {
			System.out.println(first + ", ");
			int next = first + second; 
			first = second;
			second = next ;
			i++;
		}
	}
}
