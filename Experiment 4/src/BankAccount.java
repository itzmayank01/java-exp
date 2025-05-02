package Experiment4;

public class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {  // amount must be positive
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount");
	        }
	    }
	
	    protected void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {  // amount should be Positive and Less than the balance because it have to reduced
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient balance");
	        }
	    }

	    void checkBalance() {
	        System.out.println("Current balance: " + balance);
	    }

	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000.0);

	        account.deposit(500.0);
	        account.checkBalance();
	        account.withdraw(200.0);
	        account.checkBalance();
	    }
}
