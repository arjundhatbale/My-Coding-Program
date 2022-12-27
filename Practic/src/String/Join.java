package com.str;

public class Join {

	public static void main(String[] args) {
		
//		String joinStrin1 = String.join("-", "Welcome","To","javatpoint");
//		System.out.println(joinStrin1);
////		
//		String date = String.join("?", "13","3","2022");
//		System.out.println(date);
		
		String str = "null";
		try {
			str = String.join(str,"abc","pqr","xyz");
			System.out.println(str);
		}catch( NullPointerException e ) {
			System.out.println("some error occurd");
			System.out.println(e);
		}
		
//		 
//		System.out.println("Somthing is wrong");
//			 
			 
		
		// lastindexOf() method
		
//		String s1 = "this is idex of example";
//		int index = s1.lastIndexOf('d');
//		System.out.println("last index is >> " + index);
//		
//		// lastIndexOf(int ch, int fromIndex)method
//		String name = "abcdefghijklmnopqr";
//		int indx = name.lastIndexOf('i');
//		System.out.println("index of 'd' from 4 is >> " + indx);
//		
//		// split() or "\\s" method
//		
//		String data = "india is my country and all indian are by family member";
//		String [] words = data.split("\\s");
//		for(String chr : words) {
//			System.out.print(chr + " : ");
//		}
//		
//		String table = "Table is a object e  ";
//		System.out.println("\nreturning words  : ");
//		for(String Table : table.split("\s", 0)) {
//			System.out.println(Table);
//		}
//		System.out.println("\nExample 2 >> ");
//		for(String Table : table.split("\\s", 3)) {
//			System.out.println(Table);
//		}
//		
//		// count the words in sentence
//		String chair = "javatpontamnatt";
//		System.out.println("output  is >> ");
//		String []a = chair.split("a",5);
//		for(String w :a) {
//			System.out.print(w + ", \n");
//		}
//		System.out.println("split array lenght : " + a.length);
		
//		String name = "Go Back";
//		String rev = ""; 
//		for(int i = 0; i<name.length();i++) {
//			rev = name.charAt(i) + rev;	
//		}
//		System.out.println("Reverse Stirn is >> " + rev);
	}
}
