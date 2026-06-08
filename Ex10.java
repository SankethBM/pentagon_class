
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("");

        // int amt = 1234;
        // int[] notes = {500, 200, 100, 50, 20, 10};
        // for (int note : notes) {
        // System.out.println(note + " : " + amt / note);
        // amt %= note;
        // }
        // System.out.println("Coins : " + amt);

        //

        System.out.print("Natural Numbers : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //
        System.out.print("Sum of N Natural Numbers : ");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        //
        System.out.print("Product of N Natural Numbers : ");
        int prod = 1;
        for (int i = 1; i <= 10; i++) {
            prod *= i;
        }
        System.out.println(prod);

        //

        System.out.print("Enter an number : ");
        int num = sc.nextInt();
        System.out.print("Factorial of given number : ");
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }
}