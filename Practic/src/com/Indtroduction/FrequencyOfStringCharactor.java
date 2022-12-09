package com.Indtroduction;

public class FrequencyOfStringCharactor {
	public static void main(String[] args) {
		String statement = "Statement String is : arjun subhash dhatbale" ;
		char ch = 'a';
		
		int frequency = 0;
		for(int i=0; i< statement.length(); i++) {
			if(ch == statement.charAt(i)) {
				++frequency;
			}
		}
		System.out.println(statement);
	 System.out.println("Frequency of 'a' charactor in statement string is : " + frequency);
	}
}
