public class Op {
    public static void main(String[] args) {

        int a = -5;
        int b = 36;
        int c = -71;

        a = a++ - --b + --c - --a;
        b = --b - --a + ++c + --c;
        c = a++ - --b + --c - --b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}