import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factors of " + n + " are:");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("");
        
        System.out.println("Total number of factors: " + count);

        
        boolean prime = n > 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "Prime" : "Not Prime");

        sc.close();

    }
}
