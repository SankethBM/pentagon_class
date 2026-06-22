
public class Ex23 {
    public static void main(String[] args) {
        // WAJP to add the given matrices and store those in resultant array

        // int[][] a = { { 1, 2 }, { 3, 4 } };
        // int[][] b = { { 5, 6 }, { 7, 8 } };

        // int[][] result = new int[a.length][a[0].length];

        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a[i].length; j++) {
        // result[i][j] = a[i][j] + b[i][j];
        // }
        // }

        // System.out.println("\nResultant Matrix:");

        // for (int[] r : result) {
        // for (int j = 0; j < r.length; j++) {
        // System.out.print(r[j] + " ");
        // }
        // System.out.println();
        // }

        // WAJP to get the transpose of a matrix

        // int[][] a = { { 1, 2 }, { 3, 4 } };

        // int[][] t = new int[2][2];

        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < 2; j++) {
        // t[j][i] = a[i][j];
        // }
        // }

        // System.out.println("\nTranspose Matrix:");

        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < 2; j++) {
        // System.out.print(t[i][j] + " ");
        // }
        // System.out.println();
        // }

        // WAJP to get the max element from each row

        // int[][] arr = { { 10, 20, 30 }, { 45, 15, 25 }, { 5, 60, 40 } };
        // System.out.println();

        // for (int i = 0; i < arr.length; i++) {
        // int max = arr[i][0];

        // for (int j = 1; j < arr[i].length; j++) {
        // if (arr[i][j] > max) {
        // max = arr[i][j];
        // }
        // }

        // System.out.println("Max ele in row " + (i + 1) + " = " + max);
        // }

        // WAJP to get the min value from each column

        int[][] arr = { { 10, 20, 30 }, { 5, 25, 15 }, { 8, 12, 40 } };

        System.out.println();

        for (int col = 0; col < arr[0].length; col++) {
            int min = arr[0][col];

            for (int row = 1; row < arr.length; row++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }

            System.out.println("Min val in col " + (col + 1) + " = " + min);
        }
    }
}
