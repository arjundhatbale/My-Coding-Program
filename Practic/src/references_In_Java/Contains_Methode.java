package references_In_Java;

public class Contains_Methode {
	public static void main(String[] args) {
		 
		 
		
		String name = "arjun subhash Dhatbale" ;
		
		// check is subhash contains in name
		
		boolean result = name.contains("m");
		System.out.println(result);	
	}
	public static void M() {
		 String str1 = "Learn Java";
		 String str2 = "Java";
		 String str3 = "java";
		 Boolean result;
		 
		 // true because "Learn Java" contains "Java"
		 if(str1.contains(str2)){
			 System.out.println(str1 + " contains " + str2);
		 }else {
			 System.out.println(str1 + " doesn'n contains " + str2);
		 }
		
		 // contains() is case-sensitive 
		 // false because "Learn Java" doesn't cntains "java"
		 
		 if(str1.contains(str3)) {
			 System.out.println(str1 + " contains " + str3);
		 }else {
			 System.out.println(str1 + " doesn't cntain " + str3);
		 }
	}
}
