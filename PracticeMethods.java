
public class PracticeMethods {
    public static void square(int n) {
        System.out.println("Square of given number is : " + n * n);
    }

    public static void even_odd(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even number");
        else
            System.out.println(n + " is Odd Number");
    }

    public static void minNum(int a, int b) {
        if (a < b)
            System.out.println(a + " is minimun");
        else
            System.out.println(b + " is minimum");
    }

    public static void main(String[] args) {
        square(2);
        even_odd(3);
        minNum(2, 4);
    }
}
