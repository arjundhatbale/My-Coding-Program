package com.Array;

public class FindIndexPositionOfVovel {

	public static void main(String[] args) {
		
		String str = "India is my country";
		
		char[] strconvert= str.toCharArray();
		int count = 0;
		for(char c  : strconvert) {
			
			
			if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' || c == 'U') {
				 
				System.out.println("Vovel Character of " + c + " at Index of : " + count++);
				
				
			}	
		}
		
//		String name = "arjun";
//		char arrname[] = name.toCharArray();
//		for(int i = name.length()-1; i>=0; i--) {
//			System.out.print(arrname[i]);
//		}
//		
		
	}
}
