
public class Ex20 {
    public static void main(String[] args) {
        // WAJP to perform left rotate by k

        // int[] a = { 10, 20, 30, 40, 50 };
        // int k = 2, n = a.length;
        // int[] b = new int[n];

        // for (int i = 0; i < n; i++) {
        // b[i] = a[(i + k) % n];
        // }

        // System.out.println();
        // System.out.println(Arrays.toString(b));

        // WAJP to get the majority element from the given array
        // note : the element should be greater than len/2
        int[] arr = { 2, 2, 1, 2, 3, 2, 2 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                System.out.println("\nMajor ele: " + arr[i]);
                return;
            }
        }

        System.out.println("\nNo Major ele");
    }
}
