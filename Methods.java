
public class Methods {
    public static void demo() {
        System.out.println("Demo Method");
    }

    // public static int sum(int a, int b) {
    // System.out.println(a + b);
    // return 0;
    // }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void mul(int a, int b) {
        System.out.println(a * b);
    }

    public static void div(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        System.out.println("Main Starts");
        // demo();
        add(2, 2);
        sub(2, 2);
        mul(2, 2);
        div(2, 2);
        System.out.println("Main Ends");
    }
}
