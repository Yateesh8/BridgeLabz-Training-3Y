package javaConstructors;

// Base Class
class BankAccount {
    public String accountNumber;      // public
    protected String accountHolder;   // protected
    private double balance;           // private

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods for balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void showSavingsInfo() {
        // Can access public and protected members
        System.out.println("Savings Account - No: " + accountNumber + ", Holder: " + accountHolder);
        // Balance is private → must use getter
        System.out.println("Balance (via getter): " + getBalance());
    }
}


