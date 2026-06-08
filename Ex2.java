public class Ex2 {
    public static void main(String[] args) {
        int star = 0;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= star; j++) {
                System.out.print("* ");
            }

            if (i < 5)
                star++;
            else
                star--;

            System.out.println("");
        }
    }
}
