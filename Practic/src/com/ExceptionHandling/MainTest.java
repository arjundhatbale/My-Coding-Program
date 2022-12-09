package com.ExceptionHandling;

public class MainTest {
	public static void main(String[] args) {
		
		Account account = new Account();
		System.out.println("Current balance : " + account.balance());
		account.withdraw(44343);
		System.out.println("Current balanace : " + account.balance());
	}
}
