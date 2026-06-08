import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // WAJP to check the given number sunny number or not

        // Scanner sc = new Scanner(System.in);
        // System.out.print("\nEnter a Numebr : ");
        // int n = sc.nextInt();

        // int sqrt = (int) Math.sqrt(n + 1);

        // if (sqrt * sqrt == n + 1) {
        // System.out.println(n + " is a Sunny Number");
        // } else {
        // System.out.println(n + " is not a Sunny Number");
        // }

        // WAJP to find LCM

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter 2 Numebr : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = Math.max(a, b);

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM = " + lcm);
                break;
            }
            lcm++;
        }

    }
}
