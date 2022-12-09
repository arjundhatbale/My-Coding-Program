package com.JavaString;
// java program for String and StringBuffer HashCode Test

public class HashCodeTestOfString {

	public static void main(String[] args) {
		
		System.out.println("Hashcode test or String  >> ");
		System.out.print("Hashcode Before Concatinating String >> ");
		String str = "java";
		System.out.println(str.hashCode());
		str = str + "tpoint";
		System.out.print("Hashcode After Concatinating String >> ");
		System.out.println(str.hashCode());
		
		System.out.println("Hashcode Test with StringBuffer >> ");
		System.out.print("Hashcode before Concatnatin StringBuffer >> ");
		StringBuffer name = new StringBuffer("vishal");
		
		System.out.println(name.hashCode());
		System.out.print("HashCode after Cancating StringBuffer >> ");
	    name.append("Dhatbale");
	    System.out.println(name.hashCode());
	}
}
