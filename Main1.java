class Books {
    String title;
    String author;
    String ISBN;

    public Books(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author); 
        System.out.println("ISBN   : " + ISBN);
    }
}

class Fiction extends Books {
    String genre;

    public Fiction(String title, String author, String ISBN, String genre) {
        super(title, author, ISBN);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Fiction Book ---");
        super.displayDetails();
        System.out.println("Genre  : " + genre);
    }
}

class NonFiction extends Books {
    String subject;

    public NonFiction(String title, String author, String ISBN, String subject) {
        super(title, author, ISBN);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Non-Fiction Book ---");
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

public class Main1 {
    public static void main(String[] args) {

        Fiction f = new Fiction(
                "Harry Potter",
                "J.K. Rowling",
                "9780747532743",
                "Fantasy");	

        NonFiction nf = new NonFiction(
                "A Brief History of Time",
                "Stephen Hawking",
                "9780553380163",
                "Science");

        f.displayDetails();
        nf.displayDetails();
    }
}