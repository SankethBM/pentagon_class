
public class Ex16 {
    public static void main(String[] args) {
        // WAJP

        // int[] n = { 10, 20, 30, 40, 50 };

        // int mid = (n.length % 2 == 0 ? n.length / 2 : n.length / 2 + 1);
        // for (int i = mid; i < n.length; i++) {
        // System.out.println(n[i]);
        // }

        // WAJP to reverse the frist half of the array

        // int[] arr = { 10, 20, 30, 40, 50, 60 };
        // int mid = arr.length / 2, l = 0, r = mid - 1;

        // while (l < r) {
        // arr[l] = arr[l] + arr[r] - (arr[r] = arr[l]);
        // l++;
        // r--;
        // }
        // System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // WAJP to reverse the second half of the array

        // int[] arr = { 10, 20, 30, 40, 50, 60 };
        // int mid = arr.length / 2, l = mid, r = arr.length-1;

        // while (l < r) {
        // arr[l] = arr[l] + arr[r] - (arr[r] = arr[l]);
        // l++;
        // r--;
        // }
        // System.out.println(Arrays.toString(arr));

        // // WAJP to get the min ele from the given array

        // int[] a = { 100, 250, 30, 400, 507, 60 };
        // int min = a[0];

        // for (int i = 0; i < a.length; i++) {
        // if (a[i] < min) {
        // min = a[i];
        // }
        // }

        // System.out.println(min);

        // WAJP to get the max ele from the given array

        int[] a = { 100, 250, 30, 400, 507, 60 };
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println(max);



        // Assignment :
        // 1. Min from 1st half and max from 2nd half
    }

}
