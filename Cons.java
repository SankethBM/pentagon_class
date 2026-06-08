
public class Cons {
    String name;
    int id;

    public Cons() {
        name = "asdfghk";
        id = 123;
    }

    public Cons(String x, int y) {
        this.name = x;
        this.id = y;
    }

    public static void main(String[] args) {
        Cons s = new Cons();
        System.out.println(s.name);

        Cons ss = new Cons("abc", 123);
        System.out.println(ss.name + " " + ss.id);
    }

}
