public class Assi {
    public static void main(String[] args) {

        int n = 1;
        char small = 'a';

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print("" + ch + small + n + " ");

            small++;
            n++;
        }
    }
}