package Rejex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FinderRegix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter regex pattern: ");
			Pattern pattern = Pattern.compile(sc.nextLine());
			System.out.println("Ente text >> ");
			Matcher mathcher = pattern.matcher(sc.nextLine());
			
			boolean found = false;
			while(mathcher.find()) {
				System.out.println("I found the text " + mathcher.group() + " start at index "+ mathcher.start() + " and ending at index " + mathcher.end());
				found = true;
			}
			if(!found) {
				System.out.println("No match found.");
			}
		}
	}
}
