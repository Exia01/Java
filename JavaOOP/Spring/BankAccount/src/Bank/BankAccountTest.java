package Bank;

public class BankAccountTest {
	public static void main(String[] args) { // this is where the main method, so this is where w run it e
		BankAccount student1Plus = new BankAccount();
		student1Plus.setName("Joey's Account");
		System.out.println(student1Plus.getAccountNumber());
		student1Plus.depositChecking(5000.0);
		student1Plus.getCheckingBalance();
	
	}
		
}
