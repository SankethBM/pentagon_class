import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        // WAJP to convert the given decimal number to binary

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number : ");
        int n = sc.nextInt();
        // System.out.println("Binary : "+ Integer.toBinaryString(n));

        // String b = "";
        // while (n > 0) {
        // b = (n % 2) + b;
        // n = n / 2;
        // }
        // System.out.println("Binary = " + b);

        // WAJP to convert the given decimal number to octal

        // String b = "";
        // while (n > 0) {
        // b = (n % 8) + b;
        // n = n / 8;
        // }
        // System.out.println("Octal = " + b);

        // WAJP to convert the given decimal number to hexa decimal
        String b = "";
        while (n > 0) {
            b = (n % 16) + b;
            n = n / 16;
        }
        System.out.println("Octal = " + b);

    }
}
