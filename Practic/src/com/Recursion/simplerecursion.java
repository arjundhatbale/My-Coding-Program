package com.Recursion;

public class simplerecursion {
	public static int  demo (int no) {
		int count = no;
		while(no == 1) {
			no = no * count;
			count --;
		}
		return no ;
	}
	public static void main(String[] args) {
		simplerecursion obj = new simplerecursion();
		System.out.println(obj.demo(5));
	}
}
