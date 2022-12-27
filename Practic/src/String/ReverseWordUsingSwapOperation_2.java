package com.str;

public class ReverseWordUsingSwapOperation_2 {

	static void reverse(char[] str, int start , int end) {
		// Temporary variable
		char temp;
		while(start <= end) {
			temp = str[start];
			str[start] = str[end]; 
			str[end] = temp;
			start++;
			end--;
		}
	}
	
	static char [] reverseWords(char [] s) {
		int word_begin = -1;
		
		//   /* temp is for word boundary */
		int i = 0;
		
		/* Step 1 for above algorithm */
		
		while(i < s.length) {
			
			/* This condition is to make sure that the starting start 
			 * with the valid character (not space) only */
			
			if((word_begin == -1) && (s[i] != ' ')) {
				word_begin = i;
			}
			if(word_begin != -1 && ((i + 1) == s.length) || (s[i + 1] == ' ')){
				reverse(s, word_begin, i);
				word_begin = -1;
			}
			System.out.println(s[i]);
			i++;
		} // End of while 
		// Step 2 of the above algorithm
		reverse(s, 0, (s.length - 1));
		return s;
	}
	
	public static void main(String[] args) {
		
		String s = "I like this program very much";
		
		// Function call
		char [] p = reverseWords(s.toCharArray());
		System.out.println(p);
	}
}
