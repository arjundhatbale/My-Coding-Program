package com.str;
/*
 * import required class and package
 * creat atm class to implement the atm functionlity
 * 
 */
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		
		// Declare and initialise balabce , withdraw, diposit
		
		int balance = 10000 , withdraw , deposite; 
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Atomated Teller Machine>> ");
			System.out.println("Choose 1 for withdraw >> ");
			System.out.println("Chooose 2 for Deposite >> ");
			System.out.println("Choose 3 for Check Balance >> ");
			System.out.println("Choose 4 for Exit>> ");
			System.out.println("Choose the Operation you want to perform >> ");
		
			// Get choise from user
			int choise = input.nextInt();
			
			switch(choise) {
			case 1 : System.out.println("Enter money to  the withdrawn >> ");
			// Get the withdrawal money from user
			withdraw = input.nextInt();
			// chech whether the balance is >= the withdraw amount 
			if(balance >= withdraw) {
				balance = balance - withdraw;
				// Remove the withdrawal amount from the total balance
				System.out.println("Please collect your money.");
				
				System.out.println("Your remaining Balance  is >>  " + balance  );
				System.out.println();
			}else {
				// Show custum error message
				System.out.println("Sorry! You hava Insufficient Balabce . Please Deposete More moneny for your transaction >> Thank your.");
			}
			System.out.println();
			break;
			
			case 2 : System.out.println("Enter money to be Deposeted >> ");
			
			// Get deposet amount from the user
			
			deposite = input.nextInt();
			// add the deposit amount to the total babance
			balance = balance + deposite;
			
			System.out.println("Your money has been successfully Deposited . ");
			System.out.println();
			break;
			
			case 3: // displaying the total balance of the user
				System.out.println("Balance : " + balance );
				System.out.println();
				break;
			
			case 4 : System.out.println("Close ATM ");
			
			}
		}	
		
	}
}
