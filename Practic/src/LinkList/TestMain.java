package LinkList;

public class TestMain {

	public static void main(String[] args) {
		
		AccountDetails accountdetails = new AccountDetails();
		
		Thread thread1 = new Thread(accountdetails);
		Thread thread2 = new Thread(accountdetails);
		
		thread1.setName("Arjun");
		thread2.setName("Sagar");
		
		thread1.start();
		thread2.start();
		
	}
}
