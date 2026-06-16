class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private int pin;

    public BankAccount(String accountNumber, String accountHolderName, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;

        if (balance >= 0)
            this.balance = balance;
        else
            this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double checkBalance(int pin) {
        if (this.pin == pin)
            return balance;

        System.out.println("Invalid PIN!");
        return -1;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount, int pin) {
        if (this.pin != pin) {
            System.out.println("Invalid PIN!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }

        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
    }
}

public class Main3 {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("ACC101", "Sanketh", 10000, 1234);

        System.out.println("Account No : " + acc.getAccountNumber());
        System.out.println("Holder Name: " + acc.getAccountHolderName());

        acc.deposit(5000);

        acc.withdraw(3000, 1234);
        acc.withdraw(2000, 1111);

        System.out.println("\nBalance: ₹" + acc.checkBalance(1234));

        acc.deposit(-500);
        acc.withdraw(20000, 1234);
    }
}
