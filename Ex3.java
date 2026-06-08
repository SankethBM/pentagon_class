public class Ex3 {
    public static void main(String[] args) {

        int star = 0;
        int space = 5;

        for (int i = 0; i <= 10; i++) {

            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= star; j++) {
                System.out.print("* ");
            }

            if (i < 5) {
                star++;
                space--;
            } else {
                star--;
                space++;
            }

            System.out.println();
        }
    }
}
