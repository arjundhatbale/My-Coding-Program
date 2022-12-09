package references_In_Java;
/*
 * java program for split the given string
 * 
 * make disturberance between give two charachers 
 */
public class StringSplit {
	public static void main(String[] args) {
		String text = "Peter,Welcome,to,India";
		
		String [] str = text.split(",",5);
		
		System.out.print("Result = ");
		
		for(String s : str) {
			System.out.println(s );
		}
	}
}
