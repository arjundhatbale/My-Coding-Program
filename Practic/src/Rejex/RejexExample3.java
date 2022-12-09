package Rejex;
import java.util.regex.*;

public class RejexExample3 {

	public static void main(String[] args) {
		
//		                       Regex	Description
		
//		X?	X occurs once or not at all
//		X+	X occurs once or more times
//		X*	X occurs zero or more times
//		X{n}	X occurs n times only
//		X{n,}	X occurs n or more times
//		X{y,z}	X occurs at least y times but less than z times
//		
		System.out.println("? quantifier ...");
		System.out.println(Pattern.matches("[amn]?","m"));// true (a or m or n comes one time
		
		System.out.println(Pattern.matches("[amn]?","aaa")); // flase (a comes more than one time 
		
		System.out.println(Pattern.matches("[amn]?" ,"aammmmmnn"));// false (a m and n comes more than one time 
		
		System.out.println(Pattern.matches("[amn]?", "aazzta"));// false (a comes more than one time
		
		System.out.println(Pattern.matches("[aman]?", "am")); // false (a or m or n must come one time
		
		System.out.println ("+ quantifier ....");
		
		System.out.println(Pattern.matches("[amn]+", "a")); // true (a or m or n once or more times);
		
		System.out.println(Pattern.matches("[amn]+", "aaa")); // true ( a comes more than one times
		
		System.out.println(Pattern.matches("[aman]*",""));// true (a or m or n may come zero or more times)
		
		
	}
}
