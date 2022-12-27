package com.str;

import java.util.Arrays;
import java.util.Collections;

public class ReversWord {

	public static void main(String[] args) {
		
		String s [] = "   i like   this program                 very much".split("\\s+");
		Collections.reverse(Arrays.asList(s));
		System.out.println(String.join(" ", s)); 
	}
//		String ans = "";
//		for(int i = s.length - 1; i >= 0; i--) {
//			ans = ans + s[i] + " " ;
//		}
//		System.out.println(ans.substring(0, ans.length() - 1));
//	}
}
