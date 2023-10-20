package lab4.ex1;

public class Account {

	private static int accCount = 1000;
	private int accNum;
	private double balance;
	private Person accHolder;
	 public Account () {
		 super();
	 }
	public Account(Person accHolder, double currBal) {
        this.accNum = accCount++;
        this.accHolder = accHolder;
        if (currBal >= 500) {
            this.balance = currBal;
        } else {
            System.out.println("There should be initial balance of INR 500. Setting balance to 500.");
            this.balance = 500;
        }
    }
	
	public void deposit(double dep) {
		if (dep > 0) {
            this.balance += dep;
        } else {
            System.out.println("Invalid deposit amount.");
        }
	}
	
	public void withdraw(double amt) {
		if (amt > 0 && (balance - amt) >= 500) {
            this.balance -= amt;
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Person getAccHolder() {
        return accHolder;
    }
	
	public int getAccNum() {
        return accNum;
    }
}
