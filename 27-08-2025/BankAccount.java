package ClassPrograms;

public class BankAccount {

    long accountNumber;
    double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Your updated balance for bank account number "+ this.accountNumber + " is " + balance);
        } else {
            System.out.println("Invalid amount..");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            System.out.println("Your updated balance for bank account number "+ this.accountNumber + " is " + balance);
        } else {
            System.out.println("Invalid request..");
        }
    }

    public void checkBalance() {
        System.out.println("The balance for account Number "+ this.accountNumber + " is " + balance);
    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(351191567, 14324);
        BankAccount account2 = new BankAccount(351191568, 17222);

        account1.depositMoney(2345);
        account2.withdrawMoney(2453);

        account1.checkBalance();
        account2.checkBalance();

    }
}
