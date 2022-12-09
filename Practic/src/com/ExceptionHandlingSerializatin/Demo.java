package com.ExceptionHandlingSerializatin;

import java.io.*;

public class Demo implements java.io.Serializable {

	public int no;
	public String name;
	
	// Default constructor
	
	public Demo(int num, String Name) {
		this.name = Name;
		this.no = num;
	}
	
}
