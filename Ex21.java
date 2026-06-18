import java.util.Arrays;

public class Ex21 {
    public static void main(String[] args) {
        // WAJP to perform sum of digits for 1st elements and product of digits for last
        // element and swap 1 ele with last ele

        // int[] a = { 123, 45, 67, 89 };

        // int sum = 0, n = a[0];
        // while (n > 0) {
        // sum += n % 10;
        // n /= 10;
        // }

        // int pro = 1;
        // n = a[a.length - 1];
        // while (n > 0) {
        // pro *= n % 10;
        // n /= 10;
        // }

        // a[0] = pro;
        // a[a.length - 1] = sum;

        // System.out.println("\n" + Arrays.toString(a));

        // WAJP to get the difference b/w and max and min value of the given array

        // int[] arr = { 10, 25, 5, 40, 15 };

        // int max = arr[0], min = arr[0];

        // for (int n : arr) {
        // if (n > max)
        // max = n;
        // if (n < min)
        // min = n;
        // }

        // System.out.println("\nDifference = " + (max - min));

        // WAJP to swap min and max ele for the given array

        int[] a = { 10, 5, 30, 2, 20 };

        int min = 0, max = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[min])
                min = i;
            if (a[i] > a[max])
                max = i;
        }

        a[min] = a[min] + a[max] - (a[max] = a[min]);

        System.out.println("");
        System.out.println(Arrays.toString(a));
    }
}
