public class RTO {
    static void provideDL(int age) throws UnderAgeException, OverAgeException {
        if (age > 18 && age < 60) {
            System.out.println("\nYou are Eligible for DL !");
        } else if (age < 18) {
            UnderAgeException u = new UnderAgeException();
            throw u;
        } else if (age > 60) {
            OverAgeException o = new OverAgeException();
            throw o;
        }
    }
}
