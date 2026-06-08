public class Ex6 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i < 2 * n; i++) {

            int star;

            if (i <= n)
                star = n - i + 1;
            else
                star = i - n + 1;

            for (int j = 1; j <= n - star; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * star - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
