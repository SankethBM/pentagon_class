
public class MOSub {
    public static void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void sub(int a, int b, int c) {
        System.out.println(a - b - c);
    }

    public static void sub(int a, int b, int c, int d) {
        System.out.println(a - b - c - d);
    }

    public static void sub(int a, int b, int c, int d, int e) {
        System.out.println(a - b - c - d -e);
    }

    public static void sub(int a, int b, int c, int d, int e, int f) {
        System.out.println(a - b - c - d - e - f);
    }

    public static void main(String[] args) {
        sub(1, 2);
        sub(1,2,3);
        sub(1,2,3,4);
        sub(1,2,3,4,5);
        sub(1,2,3,4,5,6);
    }
}
