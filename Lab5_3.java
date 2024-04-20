// Abstract class BankAccount
abstract class BankAccount {
    protected double balance;

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
        this.balance = 0.0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Added interest: " + interest);
    }
}

// Subclass CurrentAccount
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
        this.balance = 0.0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw. Exceeds overdraft limit.");
        }
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

public class Lab5_3 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(2.5); 
        CurrentAccount currentAccount = new CurrentAccount(500); 
        // Deposit and withdraw from SavingsAccount
        savingsAccount.deposit(1000);
        savingsAccount.addInterest();
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance after withdrawal: " + savingsAccount.getBalance());

        System.out.println();

        // Deposit and withdraw from CurrentAccount
        currentAccount.deposit(800);
        System.out.println("Current Account Balance:" + currentAccount.getBalance());
        currentAccount.withdraw(400);
        System.out.println("Current Account Balance after withdrawal:" + currentAccount.getBalance());
        currentAccount.withdraw(1000); 
        System.out.println("Current Account Balance after attempted withdrawal:" + currentAccount.getBalance());
    }
}




