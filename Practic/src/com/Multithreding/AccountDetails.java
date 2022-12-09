
package com.Multithreding;

public   class AccountDetails implements Runnable{

		Account account = new Account();
		
		public  void run() {
			for(int i = 0; i<= 5; i++) {
				makeWithdrawal(400);
				
				if(account.getBalance() <= 0) {
					System.out.println("Accoutn is overdrawn...");
				}
			}
		}
		
		private void makeWithdrawal(int amt) {
			if(account.getBalance() >= amt) {
				System.out.println(Thread.currentThread().getName() + "is going to withdraw = >> " + amt);
			}
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			int bal = account.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + "completed the withdrawal, Avl bal = > " + bal);
		}
}
