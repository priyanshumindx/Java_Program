
class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;


    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;


    SavingsAccount(String accountNumber, String accountHolder,double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }


    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;


    CurrentAccount(String accountNumber, String accountHolder,double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }
}

public class Bank{
    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("1001", "Rahul", 5000.0);

        SavingsAccount savings =
                new SavingsAccount("2002", "Sneha", 8000.0, 4.5);

        CurrentAccount current =
                new CurrentAccount("3003", "Arjun", 12000.0, 3000.0);

        account.displayDetails();

        System.out.println();

        savings.displayDetails();

        System.out.println();

        current.displayDetails();
    }
}
