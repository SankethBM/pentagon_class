public class Ex7 {
    public static void main(String[] args) {

        System.out.println("");

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print(j + " ");
        // }

        // System.out.println("");
        // }

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println("");
        // }

        // char alp = 'A';
        // int num = 1;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i == j) {
        // System.out.print(alp + " ");
        // num++;
        // alp++;
        // } else {
        // System.out.print(num + " ");
        // // alp++;
        // num++;
        // }
        // }
        // System.out.println("");
        // }

        // int space = 4;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 1; j++) {
        // System.out.print(j);
        // }
        // space--;
        // System.out.println("");
        // }

        int n = 5;
        int num = 1;
        int space = (2 * n) - 3;

        System.out.println("");

        for (int i = 1; i <= (2 * n) - 1; i++) {

            for (int j = 1; j <= num; j++) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= num; j++) {
                if (j != 5)
                    System.out.print(j + " ");
            }

            if (i < n) {
                num++;
                space -= 2;
            } else {
                num--;
                space += 2;
            }

            System.out.println();
        }
    }
}
