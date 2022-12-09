package LinkList;

public class Account {

	private int balance = 4500;
	
	public int balance() {
		return balance;
	}
	
	public int withdraw(int amount) {
		balance = balance - amount;
		return balance;
	}
}
