class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(12345, 1000);

        acc.displayBalance();
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(5000);   // should fail
        acc.displayBalance();
    }
}