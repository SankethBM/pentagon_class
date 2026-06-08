public class Ex9 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2 * n - 1; i++) {

            int row = (i <= n) ? i : 2 * n - i;

            for (char ch = 'A'; ch < 'A' + row; ch++)
                System.out.print(ch + " ");

            for (int j = 1; j <= 2 * (n - row); j++)
                System.out.print("  ");

            for (char ch = (char) ('A' + row - 1); ch >= 'A'; ch--)
                System.out.print(ch + " ");

            System.out.println();
        }
    }
}
    