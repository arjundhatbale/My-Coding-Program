package com.DecisionMakingAndLoop;

public class SumOfNatural {
	public static int sum() {
		System.out.println("Static method");
		int sum = 0;
		int nomber = 100;
		while(nomber !=0) {
			sum = sum + nomber;
			nomber--;
		}
		System.out.print("Sum of Static block is : ");
		return sum;
	}
    public static void main(String[] args) {
		
    	int num = 100;
    	int sum = 0;
    	for(int i=0; i<=100; i++) {
    		sum = sum + i;
    	}
    	System.out.println("Sum = " + sum);
    	
    	SumOfNatural obj = new SumOfNatural();
    	 
    	System.out.println(obj.sum());
	}
    
}
