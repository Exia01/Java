package Bank;

import java.util.Random;

public class BankAccount {
	private String name;
	private String accountNumber;
	private Double checkingBalance = 0.0;
	private Double savingsBalance  = 0.0;
	private Double totalBalance = 0.0;
	private static Integer numOfAccounts = 0;

	private String generateAccountNumber() {
		Random r = new Random();
		String randomAccountNumber = "";

		for (int i = 0; i < 10; i++) {
			randomAccountNumber += r.nextInt(10);
		}
		return randomAccountNumber;
	}

	// creating Bank Accounts

	public BankAccount() {
		this.accountNumber = this.generateAccountNumber();
		numOfAccounts++;
	}

	public BankAccount(String name) {
		this.accountNumber = this.generateAccountNumber();
		this.name = name;
		numOfAccounts++;
	}

	public BankAccount(String name, Double checkingBalanceParam, Double savingsBalanceParam) {
		this.accountNumber = this.generateAccountNumber();
		setCheckingBalance(checkingBalanceParam);
		totalBalance += checkingBalanceParam;
		setSavingsBalance(savingsBalanceParam);
		totalBalance += savingsBalanceParam;
		this.name = name;
		numOfAccounts++;
		numOfAccounts++;
	}

	// These are the getter and setters
	public String getAccountName() {
		System.out.println("The account name for " + this.accountNumber + " is: " + this.name);
		return this.name;
	}

	public void setName(String accountName) {
		this.name = accountName;
	}

	public String getAccountNumber() {
		System.out.println("The account number for " + this.name + " is:"  + this.accountNumber);
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		System.out.println("We are setting up " + this.name + "\n" + "It is now complete.");
		this.accountNumber = accountNumber;
	}

	public Double getCheckingBalance() {
		System.out.println("The checking balance  for " + this.name + " is: $" + checkingBalance);
		return checkingBalance;
	}

	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public Double getSavingsBalance() {
		System.out.println("The savings balance  for " + this.name + " is: $" + checkingBalance);
		return savingsBalance;
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static Integer getNumOfAccounts() {
		return numOfAccounts;
	}

	// deposit actions(getter and setters for it)

	public void depositSavings(Double amount) {
		this.savingsBalance += amount;
		totalBalance += amount;
	}

	public void depositChecking(Double amount) {
		System.out.println(checkingBalance);
		System.out.println(savingsBalance);
		System.out.println(amount);
		this.checkingBalance += amount;
		totalBalance += amount;
	}

	public void withdrawSavings(Double amount) {
		if (this.savingsBalance - amount < 0) {
			System.out.println("Sorry, you have insufficient funds.");
		} else {
			this.savingsBalance -= amount;
			totalBalance -= amount;
		}
	}

	public void withdrawChecking(Double amount) {
		if (this.checkingBalance - amount < 0) {
			System.out.println("Insufficient funds.");
		} else {
			this.checkingBalance -= amount;
			totalBalance -= amount;
		}
	}

	// totls for acount

	public Integer totalBalance() {
		System.out.println("The total balance for " + this.name + " is: "+
		totalBalance);
		return numOfAccounts;
	}

	public static Integer totalAccounts() {
		System.out.println("Total accounts in the bank are: "+ numOfAccounts);
		return numOfAccounts;

	
	}
}
