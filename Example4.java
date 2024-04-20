// Base class
class BankAccount {
    protected double balance;

    // Constructor
    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    SavingsAccount(double initialBalance, double withdrawalLimit) {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= withdrawalLimit && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn from Savings Account:" + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Withdrawal limit exceeded or insufficient funds for withdrawal from Savings Account.");
        }
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalFee;

    // Constructor
    CheckingAccount(double initialBalance, double withdrawalFee) {
        super(initialBalance);
        this.withdrawalFee = withdrawalFee;
    }

    // Override withdraw() method
    @Override
    void withdraw(double amount) {
        double totalWithdrawal = amount + withdrawalFee;
        if (balance >= totalWithdrawal) {
            balance -= totalWithdrawal;
            System.out.println("Withdrawn from Checking Account: $" + amount);
            System.out.println("Withdrawal Fee: " + withdrawalFee);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal from Checking Account.");
        }
    }
}

public class Example4{
	
    public static void main(String[] args) {
     
  SavingsAccount savings = new SavingsAccount(1000, 500); 
       
    System.out.println("Attempting to withdraw 300 from Savings Account:");
        savings.withdraw(300); 
    System.out.println("\nAttempting to withdraw 700 from Savings Account:");
        savings.withdraw(700); 

        
    CheckingAccount checking = new CheckingAccount(2000, 20); 

       
    System.out.println("\nAttempting to withdraw 1500 from Checking Account:");
        checking.withdraw(1500); 

    System.out.println("\nAttempting to withdraw 2000 from Checking Account:");
        checking.withdraw(2000); 
    }
}

