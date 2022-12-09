package Rejex;
import java.util.regex.*;
public class RejexExample2 {

	public static void main(String[] args) {
//		
//		System.out.println(Pattern.matches(".s", "as"));// true (2nd char is s
//		
//		System.out.println(Pattern.matches(".s", "sk"));// false (2nd char is not s
//		
//		System.out.println(Pattern.matches(".s", "ask"));// false has not more than 2 character
//		
//		System.out.println(Pattern.matches("..s","mss"));// True (3rd char is s
//		
		
		System.out.println(Pattern.matches("[ams]","abcd")); // false (not a or m or n
		System.out.println(Pattern.matches("[ams]","a")); // true (among a or m or n
		
		System.out.println(Pattern.matches("[amn]","ammmmna")); // false (m and a comes more than once
		
		System.out.println(Pattern.matches("[amn]+","ammmmna")); // true cause + sign it shows more than one 
	}
}
