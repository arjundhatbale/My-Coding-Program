package LinkList;

 public  class AccountDetails  implements Runnable{

	Account account = new Account();
	public void run() {
		
		for(int i = 0; i <= 8; i++) {
			
			makeWithdraw(250);
			
			if(account.balance() <= 0 ) {
				System.out.println("Account is Empty. Zero Balance.");
			}
		}
	}
	
	private synchronized void makeWithdraw(int amt) {
		if(account.balance() >= amt) {
			System.out.println(Thread.currentThread().getName()+ " is going to withdraw >> " + amt);
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException IE) {
			System.out.println(IE.getMessage());
		}
		
		int RemaingBalance = account.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+ " completed the withdrawal, Avalable Balance is >> " + RemaingBalance);
		
	}
}

