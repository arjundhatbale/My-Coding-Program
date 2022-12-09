package com.Multithreding;

public class MainTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		AccountDetails accountDetails = new AccountDetails();
		System.out.println("Current Balance in Account is >> " + account.getBalance());
		Thread thread1 = new Thread(accountDetails);
		Thread thread2 = new Thread(accountDetails);
		
		thread1.setName("Arjun   =  ");
		thread2.setName("Vikas   =  ");
		thread1.start();
		thread2.start();
	}
}
