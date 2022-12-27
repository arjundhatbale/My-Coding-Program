package com.Functions;

class CallConstructor {
	
	int sum;
	
	CallConstructor(){
		// calling the second consttructor 
		this(5,3);
	}
	
	// second constructor
	CallConstructor(int arg1, int arg2){
		// ad tow value
		this.sum = arg1 + arg2;
	}
	void display() {
		System.out.println("Sum is : " + sum);
	}
	
	// main class
	public static void main(String[] args) {
		// call the first constructor
		CallConstructor obj = new CallConstructor();
		
		// call display methode
		obj.display();
		CallConstructor obj1 = new CallConstructor(3,4);
		obj1.display();
	}
}
