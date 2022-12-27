package com.str;

public class ReverseWordUsingSwapOperation {
	
	static void reverese(char [] str, int start, int end) {
		// Temporary variable to store character
		
		char temp;
		while(start <= end) {
			// Swapping the first and last character 1 = temp 2 start 3 end
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}
	
	static char [] reverseWords(char s[]) {
// Reversing the individual words as explain in first step
		int start = 0;
		for(int end = 0; end < s.length; end ++) {
			// If we see a space, we reverse the previous words (word between 
			// the indexes start and end-1
			// i.e., s[start .. end - 1]
			if(s[end] == ' ') {
				reverese(s,start,end);
				start = end + 1;
			}
		}
		// Reveres the last word
		reverese(s, start, (s.length - 1));
		
		// Reverse the entire String
		reverese(s, 0, s.length -1);
		return s;
	}
	
	
	
	public static void main(String[] args) {
		 
		String s = "   i like this program very much .";
		
		// Function call 
		
		char [] p = reverseWords(s.toCharArray());
		System.out.println(p);
		 
	}
}
