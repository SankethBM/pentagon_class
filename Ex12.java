import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        // reverse the given number
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        // int rev = 0;

        // while (num != 0) {
        // rev = rev * 10 + num % 10;
        // num /= 10;
        // }

        // System.out.println("Reversed Number: " + rev);

        // program to check the number is palindrome or not

        System.out.println("The Given Number is : " + num);
        // int n = num;
        // int rev = 0;

        // while (num != 0) {
        // rev = rev * 10 + num % 10;
        // num /= 10;
        // }

        // if (rev == n) {
        // System.out.println("The number is Palindrome !");
        // } else {
        // System.out.println("The Number is Not Palindrome !");
        // }

        // Program to check the given number is perfect number or not

        // int sum = 0;
        // for (int i = 1; i < num; i++) {
        // if (num % i == 0) {
        // System.out.print(i + " ");
        // sum += i;
        // }
        // }
        // System.out.println(sum == num ? "\nPerfect Number" : "\nNot Perfect Number");

        // neon number

        int sq = num * num;
        int sum = 0;

        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }

        System.out.println(sum == num ? "Neon Number" : "Not a Neon Number");
    }
}


