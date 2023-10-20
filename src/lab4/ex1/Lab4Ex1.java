package lab4.ex1;

class SavingsAccount extends Account {
    private final double minimumBalance = 500;

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed due to insufficient balance.");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed due to overdraft limit.");
        }
    }
}

public class Lab4Ex1 {

	public static void main(String[] args) {
		Person smith = new Person("Smith", 35);
        Person kathy = new Person("Kathy", 23);
        // part a.
        Account smithAccount = new Account(smith, 2000);
        Account kathyAccount = new Account(kathy, 3000);
        // part b. and c.
        smithAccount.deposit(2000);
        kathyAccount.withdraw(2000);
        // part d.
        System.out.println("Balances in both Smith's and Kathy's accounts resp: ");
        System.out.println(smithAccount.getBalance());
        System.out.println(kathyAccount.getBalance());
	}
}