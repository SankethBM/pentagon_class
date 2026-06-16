abstract class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Balance: " + balance);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Savings Balance: " + balance);
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Current Balance: " + balance);
    }
}

public class Main5 {
    public static void main(String[] args) {

        BankAccount s = new SavingsAccount("S101", 5000);
        BankAccount c = new CurrentAccount("C101", 10000);

        s.deposit(1000);
        s.withdraw(500);

        c.deposit(2000);
        c.withdraw(3000);
    }
}
