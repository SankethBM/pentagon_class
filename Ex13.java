
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        // int n = 147;
        // if (n % 7 == 0 || n % 10 == 7)
        // System.out.println("Buzz Number !!");
        // else
        // System.out.println("Not a Buzz Number !!");

        // Write a java program is automorphic number or not

        // int n = 25;
        // long sq = (long) n * n;
        // int len = String.valueOf(n).length();
        // long mod = (long) Math.pow(10, len);

        // System.out.println("\n"+sq + " " + len + " " + mod+" "+sq%mod);

        // if (sq % mod == n)
        // System.out.println("\nAutomorphic Number");
        // else
        // System.out.println("\nNot an Automorphic Number");

        // WAJP to check a given number is duck number or not

        // Scanner sc = new Scanner(System.in);
        // System.out.print("\nEnter a Number :");
        // String n = sc.next();

        // if (n.charAt(0) != '0' && n.contains("0")) {
        // System.out.println("\n" + n + " is a Duck Number");
        // } else {
        // System.out.println("\n" + n + " is Not a Duck Number");
        // }

        // WAJP to check for digit if the digit is even print the sq of if it is odd
        // print qube of it

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number : ");
        String n = sc.next();

        for (char ch : n.toCharArray()) {
            int digit = ch - '0';

            if (digit % 2 == 0) {
                System.out.println(digit * digit);
            } else {
                System.out.println(digit * digit * digit);
            }
        }

    }
}
