package references_In_Java;

public class ConvertChartoString {
public static void main(String[] args) {
	char ch = 'c';
	String st = Character.toString(ch);
	 
	// Alternatively
	// st = String.valueOf(ch);
	
	System.out.println("The string is : " + st);
	
	char[] noun = {'a','e','i','o','u'}; 
	
	String st1 = String.valueOf(noun);
	String st2 = new String(noun);
	
	System.out.println(st1);
	System.out.println(st2);
    }
}
