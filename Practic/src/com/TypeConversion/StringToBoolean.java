package com.TypeConversion;

public class StringToBoolean {
public static void main(String[] args) {
	
	// create string variable
	String name = "Arjun";
	String sirname = "Gadekar";
	
	// convert String to Boolean 
	// using  parseBoolean();
	
	boolean b1 = Boolean.parseBoolean(name);
	boolean b2 = Boolean.parseBoolean(sirname);
	
	// print output
	
	System.out.println("String to Boolean by using Boolean.parseBoolean() = " + b1);
	System.out.println("String to Boolean by using Boolean.parseBoolean() = " + b2);
	
	StringToBoolean obj = new StringToBoolean();
	obj.m1();
}
void m1() {
	
	// convert string boolean using value 
	String str1 = "vishal";
	String str2 = "Bhadait";
	
	// convert strng to boolean
	// using value of();
	
	boolean b1 = Boolean.valueOf(str1);
	boolean b2 = Boolean.valueOf(str2);
	
	// print output
	
	System.out.println(b1);
	System.out.println(b2);
}
}
