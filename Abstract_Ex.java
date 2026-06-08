
interface UPI {
    void pay();
}

class gpay implements UPI {
    public void pay() {
        System.out.println("\nPayment using G-Pay !");
    }
}

class ppay implements UPI {
    public void pay() {
        System.out.println("\nPayment using P-Pay !");
    }
}

class BookMyShow {
    void bookTicket(UPI ref) {
        ref.pay();
    }
}

public class Abstract_Ex {
    public static void main(String[] args) {
        BookMyShow b = new BookMyShow();

        gpay g = new gpay();
        ppay p = new ppay();

        b.bookTicket(g);
        b.bookTicket(p);
    }
}
