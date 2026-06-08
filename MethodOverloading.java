
public class MethodOverloading {
    public static void demo() {
        System.out.println("\nDemo without parameter");
    }

    public static void demo(int a) {
        System.out.println("Demo with 1 parameter i.e., " + a);
    }

    public static void main(String[] args) {
        demo();
        demo(123);
    }
}
