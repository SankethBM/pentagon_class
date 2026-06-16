abstract class Payment {
    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();
}

class CreditCardPayment extends Payment {
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(double amount, String cardNumber, String cardHolderName) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    void processPayment() {
        System.out.println("Credit Card Payment");
        System.out.println("Card Holder : " + cardHolderName);
        System.out.println("Card Number : " + cardNumber);
        System.out.println("Amount      : ₹" + amount);
        System.out.println();
    }
}

class UPIPayment extends Payment {
    String upiId;

    public UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("UPI Payment");
        System.out.println("UPI ID      : " + upiId);
        System.out.println("Amount      : ₹" + amount);
        System.out.println();
    }
}

public class Main4 {
    public static void main(String[] args) {

        Payment[] payments = {
                new CreditCardPayment(5000, "1234-5678-9012-3456", "Sanketh"),
                new UPIPayment(1200, "sanketh@upi")
        };

        for (Payment p : payments) {
            p.processPayment(); // Polymorphism
        }
    }
}
