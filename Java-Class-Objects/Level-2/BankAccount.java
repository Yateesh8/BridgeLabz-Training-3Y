package javaClassAndObjectsLevel2;

public class BankAccount {
    //Attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    //constructor
    public BankAccount(String accountHolder,String accountNumber,double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public static void displayBank() {
        System.out.println("\t\t\t\tState of Chennai\t\t\t\t");

    }
    public void deposit(double amount) {
        if(amount > 0) {
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }
        else {
            System.out.println("Amount to deposit must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdraw amount is : "+amount);
        }
        else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Lynda", "123456789", 700.00);

        displayBank();
        account.displayBalance();

        // Deposit money
        account.deposit(200.00);
        account.displayBalance();

        // Withdraw money
        account.withdraw(100.00);
        account.displayBalance();

        // Try to withdraw more than the available balance
        account.withdraw(900.00);
    }
}
