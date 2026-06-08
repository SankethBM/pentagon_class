
public class MOAdd {
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public static void add(int a, int b, int c, int d, int e) {
        System.out.println(a + b + c + d + e);
    }

    public static void add(int a, int b, int c, int d, int e, int f) {
        System.out.println(a + b + c + d + e + f);
    }

    public static void main(String[] args) {
        add(1, 2);
        add(1, 2, 3);
        add(1, 2, 3, 4);
        add(1, 2, 3, 4, 5);
        add(1, 2, 3, 4, 5, 6);
    }
}
