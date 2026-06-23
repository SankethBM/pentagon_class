public class Ex24 {
    public static void main(String[] args) {
        /*
         * JAGGED ARRAY : Jagged arrayis nothing but a 2D array where the col size will
         * be different for each row.
         * 
         * Eg. : without using new keyword
         * int[][] a = {{1,2}, {3,4,5}, {6,7,8,9}};
         * 
         * Eg. : with new keyword
         * int[][] a = new int[3][];
         * a[0] = new int[2];
         * a[1] = new int[6];
         * a[2] = new int[3];
         * 
         * 
         */

        // int[][] a = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };

        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a[i].length; j++) {
        // System.out.print(a[i][j] + " ");
        // }
        // System.out.println();
        // }

        int[][] a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[3];

        System.out.println();

        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a[i].length; j++) {
        // System.out.print(a[i][j] + " ");
        // }
        // System.out.println();
        // }

        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }
}
