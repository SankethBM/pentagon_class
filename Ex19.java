import java.util.Arrays;

public class Ex19 {
    public static void main(String[] args) {
        // WAJP to right rotate the array by 1

        // int[] a = { 10, 20, 30, 40, 50 };

        // int temp = a[a.length - 1];

        // for (int i = a.length - 1; i > 0; i--) {
        // a[i] = a[i - 1];
        // }
        // a[0] = temp;

        // System.out.println();
        // System.out.println(Arrays.toString(a));

        // WAJP to right rotate the array by k

        // int[] a = { 10, 20, 30, 40, 50 };
        // int k = 3, n = a.length;
        // int[] b = new int[n];

        // for (int i = 0; i < n; i++) {
        // b[(i + k) % n] = a[i];
        // }
        // a = b;

        // // System.out.println(a);
        // System.out.println();
        // System.out.println(Arrays.toString(a));

        // WAJP to left rotate the array by 1

        int[] a = { 10, 20, 30, 40, 50 };

        int temp = a[0];

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = temp;

        System.out.println();
        System.out.println(Arrays.toString(a));
    }
}
    