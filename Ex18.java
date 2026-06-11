public class Ex18 {
    public static void main(String[] args) {
        // WAJP to find the unique elements in the array

        // int[] a = { 18, 5, 18, 45, 5, 1 };

        // for (int i = 0; i < a.length; i++) {
        // int count = 0;

        // for (int j = 0; j < a.length; j++) {
        // if (a[i] == a[j])
        // count++;
        // }

        // if (count == 1)
        // System.out.print(a[i] + " ");
        // }

        // System.out.println();

        // // WAJP to get the 2nd Max ele from the given array

        // int[] a = { 18, 52, 118, 45, 15, 11 };

        // int max = Integer.MIN_VALUE;
        // int sec = Integer.MIN_VALUE;

        // for (int n : a) {
        // if (n > max) {
        // sec = max;
        // max = n;
        // } else if (n > sec && n != max) {
        // sec = n;
        // }
        // }

        // System.out.println("\n2nd Max = " + sec);

        // WAJP to get the 2nd min ele from the given array
        int[] a = { 18, 52, 118, 45, 15, 11 };

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int n : a) {
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2 && n != min1) {
                min2 = n;
            }
        }

        System.out.println("\n2nd Min = " + min2);

        // Assignment
        // 1.WAJP to get get 2nd min from 1st half of the array
        // 2.WAJP to get the 2nd max even ele from the 2nd half of the array
    }
}
