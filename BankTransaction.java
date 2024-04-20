package com.classdemo;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        System.out.println("Deposit: " + amount);
        balance += amount;
        System.out.println("Current Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            System.out.println("Withdrawal: " + amount);
            balance -= amount;
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankTransactions {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        // Create and start multiple threads for deposits and withdrawals
        Thread depositThread1 = new Thread(new DepositTask(account, 200.0));
        Thread depositThread2 = new Thread(new DepositTask(account, 300.0));
        Thread withdrawalThread1 = new Thread(new WithdrawalTask(account, 400.0));
        Thread withdrawalThread2 = new Thread(new WithdrawalTask(account, 600.0));

        depositThread1.start();
        depositThread2.start();
        withdrawalThread1.start();
        withdrawalThread2.start();

        // Wait for all threads to finish
        try {
            depositThread1.join();
            depositThread2.join();
            withdrawalThread1.join();
            withdrawalThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}

class DepositTask implements Runnable {
    private BankAccount account;
    private double amount;

    public DepositTask(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

class WithdrawalTask implements Runnable {
    private BankAccount account;
    private double amount;

    public WithdrawalTask(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

