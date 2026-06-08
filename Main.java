public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Sanketh", "IT", "Java");
        Manager mgr1 = new Manager("Rahul", "HR", 5);

        dev1.display();
        mgr1.display();
    }
}