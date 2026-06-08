
public class Static_Method {
    public static void demo() {
        System.out.println("Demo Executed !");
    }

    public static void main(String[] args) {
        System.out.println("Main Starts !");
        demo();
        Static_Method.demo();
        P1.p1();
        Sq.sqrt(2);
        System.out.println("Main Ends !");

    }
}
