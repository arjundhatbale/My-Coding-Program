package com.JavaString;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StringExample {

	public static void main(String[] args) {

//		StringBuilder s1 = new StringBuilder("Hellow");
//		StringBuilder s2 = new StringBuilder("vishal");
//		
//		StringBuilder s = s1.append(s2);
//		System.out.println(s );
//		
//		String s2 = new String("Game");
//		String s1 = new String("PUBG");
//		
//		String s = String.format("%s%s",  s1,s2);
//		System.out.print(s);
//		 
		
//		String s2 = new String("Game");
//		String s1 = new String("PUBG");
//		String s =  String.join("",s2,s1);
//		System.out.println(s);
//		
		List<String>liststr = Arrays.asList("abc","pqr","xyz");
		
		String str = liststr.stream().collect(Collectors.joining(", "));
		
		System.out.println(str.toString());
				
	}
}

