package com.str;

public class ReverseCharString {

	public static void main(String[] args) {
		
		char ch[] = new char[5];
		
		ch[0] = 'a';
		ch[1] = 'r';
		ch[2] = 'j';
		ch[3] = 'u';
		ch[4] = 'n';
		
		// forward print
//		for(int i= 0; i< 4; i++) {
//			System.out.print(ch[i] + ", ");
//		}
		// reverse print
		for(int j = 4; j>=0; j--) {
			System.out.print(ch[j] + ", ");
		}
	}
}
