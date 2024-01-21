package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rejex {

	public static void main(String[] args) {
	 
//		 // string format
//		
//		String name = "vikas";
//		String s1 = String.format("name is %s", name);
//		System.out.println(s1);
//		float price = 23.42f;
//		String s2= String.format("Value of Mongo is %f", 43.29);
//		System.out.println(s2);
//		String s3 = String.format("Price of Banala is %f", price);
//		System.out.println(s3);
//		System.out.println(String.format("Value of Apple is %f", price));
//		String s4 = String.format("Amount is %price.23f");
//		System.out.println(s4);
//		
		
//		String s1 = String.format("%d",100);
//		System.out.println(s1 + 3);
//		String s2 = String.format("%s","Amar Singh");
//		System.out.println(s2);
//		String s3 = String.format("%x", 101);
//		System.out.println(s3);
//		int no = 64; 
//		System.out.println(Integer.toHexString(no));
//		System.out.println(Integer.toBinaryString(no));
//		String s5 = String.format("%c", 'd');
//		System.out.println(s5);
 
		
		String s1 = String.format("%d", 101);
		System.out.println(s1);
		String s2 = String.format("|105d|", 101);
		System.out.println(s2);
		String s3 = String.format("|%-10d|", 43);
		System.out.println(s3);
		String s4 = String.format("|%5d|", 101);
		System.out.println(s4);
		String s5 = String.format("|% d|", 23);
		System.out.println(s5);
		
		
		
		
		
}
}