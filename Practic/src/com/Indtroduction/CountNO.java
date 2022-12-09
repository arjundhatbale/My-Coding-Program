package com.Indtroduction;

public class CountNO {

	public static void main(String[] args) {
		
		long no = 0003452;
		
		int count = 0;
		
		while(no != 0){
			
			no = no / 10;
			++count;
		}
		System.out.println("Count no is : " + count);
		CountNO obj = new CountNO();
		obj.m();
	}
	void m() {
		System.out.println("By using for loop ");
		
		int n = 0007655;
		int count = 0; 
		
		for(; n != 0 ; n /=10, ++count) {
			
		}
		System.out.println("Count of no is : " + count);
	}
}
