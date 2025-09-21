package javaOOPProblems;

import java.util.ArrayList;
import java.util.List;

// Interface for Loanable accounts
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract BankAccount class
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation
    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Abstract method to calculate interest
    public abstract double calculateInterest();
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings account loan applied for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current account loan applied for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 50000;
    }
}

// Main Banking System
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(101, "Alice", 20000));
        accounts.add(new CurrentAccount(102, "Bob", 60000));

        for(BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Interest: " + acc.calculateInterest());

            if(acc instanceof Loanable loanable) {
                System.out.println("Eligible for Loan? " + loanable.calculateLoanEligibility());
                loanable.applyForLoan(5000);
            }

            System.out.println("--------------------");
        }
    }
}
