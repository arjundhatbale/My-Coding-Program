package com.ExceptionHandling;

public class  FundException  extends RuntimeException{
	
	private String message;
	public  FundException (String message) {
		super(message);
	}
	
	
}
