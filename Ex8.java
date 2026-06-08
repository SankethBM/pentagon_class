public class Ex8 {
    public static void main(String[] args) {
        System.out.println("");

        // int space = 7;
        // for (int i = 0; i < 5; i++) {
        // char c = 'A';
        // for (int j = 0; j <= i; j++) {
        // if (j != 5)
        // System.out.print(c++ + " ");
        // }

        // for (int j = 0; j <= space; j++) {
        // System.out.print(" ");
        // }

        // // c++;
        // // c = 'A';
        // for (int j = 0; j <= i; j++) {
        // c--;
        // System.out.print(c + " ");
        // }
        // space -= 2;

        // System.out.println("");
        // }

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j <= space; j++) {
        // System.out.print(" ");
        // }
        // space--;
        // for (int j = 0; j <= i; j++) {
        // System.out.print(c++ + " ");
        // }
        // c = 'A';
        // System.out.println("");

        // }

        int space = 4;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            char c = 'A';

            for (int j = 0; j <= i; j++) {
                System.out.print(c++ + " ");
            }

            c -= 2;

            for (int j = 0; j < i; j++) {
                System.out.print(c-- + " ");
            }

            space--;

            System.out.println();

        }

        for (int i = 5 - 1; i >= 1; i--) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

    }
}
