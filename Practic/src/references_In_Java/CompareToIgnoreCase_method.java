package references_In_Java;

public class CompareToIgnoreCase_method {
	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "JAVA";
		String str3 = "kOLIN";
		
		int result;
		
		// compare str1 with str2
		
		result = str1.compareToIgnoreCase(str2);
		System.out.println("str1 compare with str2 = " + result);
		
		// compare str1 with str3
		
		result = str1.compareToIgnoreCase(str3);
		System.out.println("str1 compare with str3 = " + result);
		
		// compare str2 with str3
		
		result = str2.compareToIgnoreCase(str3);
		System.out.println("str2 compare with str3 = " + result);
		
		// if str1 and str2 are eqal (ignoring case differences).
					// the result is 0
					
		if(str1.compareToIgnoreCase(str2)== 0) {
				System.out.println("str1 and str2 are equal");
			}else {
				System.out.println("str1 and str2 are not equal");
			}
		
	}
 
}
 
