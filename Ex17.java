
import java.util.Arrays;

public class Ex17 {

    public static int isTarget(int[] a, int t) {
        int target = t;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                return i;
            }
        }
        return -1;
    }

    public static int flo(int[] a, int t, boolean f) {
        int l = 0, h = a.length - 1, ans = -1;

        while (l <= h) {
            int m = (l + h) / 2;

            if (a[m] == t) {
                ans = m;
                if (f)
                    h = m - 1;
                else
                    l = m + 1;
            } else if (a[m] < t)
                l = m + 1;
            else
                h = m - 1;
        }
        return ans;

    }

    public static boolean isPalindrome(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right])
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // WAJP to count the even elements in the array

        // int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int cnt = 0;

        // for (int i = 0; i < a.length; i++) {
        // if (a[i] % 2 == 0) {
        // cnt++;
        // }
        // }

        // System.out.println("\nTotal Even Numbers is : " + cnt);






        // WAJP to check the given target is present inside the array or not

        // int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int target = 60;
        // System.out.println(isTarget(a, target));






        // WAJP to get the first and last occurance for the given target

        // int[] a = { 1, 2, 3, 4, 5, 6, 6, 6, 8, 9, 10 };
        // int target = 6;

        // System.out.println("First: " + flo(a, target, true));
        // System.out.println("Last : " + flo(a, target, false));






        // WAJP to check the given array is palidrome or not

        int[] arr = { 1, 2, 3, 2, 1 };
        int[] rev = arr.clone();

        // System.out.println("\n" + isPalindrome(arr));

        for (int i = 0, j = rev.length - 1; i < j; i++, j--) {
            rev[i] = rev[i] + rev[j] - (rev[j] = rev[i]);
        }

        System.out.println("\n" + Arrays.equals(arr, rev));




        //Assignment
        //1. 

    }
}
