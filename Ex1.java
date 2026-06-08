public class Ex1 {
    public static void main(String[] args) {
        int r = 5, c = 5;
        System.out.println("");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 0 || j == 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 0 || i == 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 0 || j == 0 || i == 5 || j == 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j == 0 || j == 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 0 || j == 5    )
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n\n");
    }
}
