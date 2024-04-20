import java.util.ArrayList;
import java.util.List;

// Account interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

// SavingsAccount class implementing Account interface
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
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

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    public void addInterest() {
        double interest = calculateInterest();
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}

// CurrentAccount class implementing Account interface
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        double potentialBalance = balance - amount;
        if (potentialBalance >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Exceeds overdraft limit");
        }
    }

    @Override
    public double calculateInterest() {
        // Current accounts usually don't have interest
        return 0;
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

// Bank class to manage accounts
class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

public class Lab5_5 {
    public static void main(String[] args) {
        
        Bank bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        bank.addAccount(savingsAccount);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance: " + savingsAccount.viewBalance());
        System.out.println("Interest Earned: " + savingsAccount.calculateInterest());

        CurrentAccount currentAccount = new CurrentAccount(2000, 1000);
        bank.addAccount(currentAccount);

        currentAccount.deposit(300);
        currentAccount.withdraw(2500);
        System.out.println("Current Account Balance: " + currentAccount.viewBalance());
        System.out.println("Overdraft Limit: " + currentAccount.getOverdraftLimit());
    }
}




