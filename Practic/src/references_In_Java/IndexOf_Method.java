package references_In_Java;

public class IndexOf_Method {
	static void LastIndexOf() {
		
		String str1 = "Learn Java Programing";
		int result ;
		
		result = str1.lastIndexOf('P');
		System.out.println("Last index of P is = " + result);
		
		// search from index 0 to 4
		// searches the substring "Learn"
		
		result = str1.lastIndexOf('r',4);
		System.out.println(result);
		
		// searches the substring "Learn"
		result = str1.lastIndexOf("Java",4);
		System.out.println(result);
	}
	static void m(){
		System.out.println("Prgram for indexOf() fromIndex /n second case of the indexOf method ");
		String str1 = "Learn Java Programing";
		int result;
		
		// getting the index of character 'a'
		// search starts at index 4
		
		result = str1.indexOf('a',6);
		System.out.println(result);
		
		// getting the index of "Java"
		// search starts at index 8
		result = str1.indexOf("Java",8);
		System.out.println(result);
	}
	public static void main(String[] args) {
		m();
		LastIndexOf();
		String str1 = "Learn Java programing";
		int result;
		
		// getting the index of character 's'
		
		result = str1.indexOf('p');
		System.out.println("Index of 'p' in String str is = " + result);
	}
}
