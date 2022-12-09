package Rejex;
import java.util.regex.*;

/*
 * .	Any character (may or may not match terminator)
\d	Any digits, short of [0-9]
\D	Any non-digit, short for [^0-9]
\s	Any whitespace character, short for [\t\n\x0B\f\r]
\S	Any non-whitespace character, short for [^\s]
\w	Any word character, short for [a-zA-Z_0-9]
\W	Any non-word character, short for [^\w]
\b	A word boundary
\B	A non word boundary
 */
public class RejexExample5 {

	public static void main(String[] args) {
		
		System.out.println("metacharacters d...");
		
		System.out.println(Pattern.matches("\\d","abc"));// false (non - digit)
		System.out.println(Pattern.matches("\\d","1"));// true digit
		System.out.println(Pattern.matches("\\d","4442")); // false(digit but comes more than one
		
		System.out.println(Pattern.matches("\\d","323abc")); // false
		
		System.out.println("metacheracters D....");// D means nondigit
		
		System.out.println(Pattern.matches("\\D","abc"));// false (nc digit but comes more than once)
		System.out.println(Pattern.matches("\\D","1"));// false()(digit)
		System.out.println(Pattern.matches("\\D","433abc"));// false(digit and char)
		System.out.println(Pattern.matches("\\D","m"));
		
		System.out.println("metacheraters D with quantifie...");
		System.out.println(Pattern.matches("\\D*",    "mak"));// true digit and may come 0 or more times
		
		
		
	}
}
