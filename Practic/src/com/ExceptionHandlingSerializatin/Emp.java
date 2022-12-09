package com.ExceptionHandlingSerializatin;
/*
 * Java code for serialization and 
 * deserialization of a Java Object
 */
import java.io.*;

public class Emp implements Serializable {

	private static final long serialversionUID = 123456789L;
	
	transient int a ; 
	static int b ;
	String name ;
	int age;
	
	// Default constructor
	public Emp(String name , int age, int a, int b) {
		this.a = a;
		this.name = name;
		this.b = b;
		this.age = age;
	}
}
