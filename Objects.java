
public class Objects {
    int a = 10;

    public static void main(String[] args) {
        Objects o1 = new Objects();
        MinMaxVAl a = new MinMaxVAl();

        Book b = new Book();

        b.title = "ABCD";
        b.author = "sanketh";
        b.price = 299;
        b.pages = 142;
        b.publisher = "ABC Publication";

        System.out.println(b.title + " " + b.author + " " + b.price + " " + b.pages + " " + b.publisher);

        // System.out.println(a.str);

        // System.out.println(o1);
        // System.out.println(o1.a);
        // System.out.println(a);
    }
}

class Book {
    String title;
    String author;
    double price;
    int pages;
    String publisher;
}
