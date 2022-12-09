package com.ExceptionHandling;

public class Account {
	private int balance = 2000;
	public int balance() {
		return balance;
	}
	public void withdraw(int amount) {
		if(amount > balance) {
			throw new  FundException("Insufficient balane in your accoutn...");
		}
		balance = balance-amount;
	}
}
