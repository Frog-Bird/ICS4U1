package Arrays01;

public class six {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                { 4, 6, 21, 14 },
                { 13, 27, 9, 8 },
                { 18, 11, 9, 3 },
                { 42, 39, 18, 22 },
                { 99, 4, 17, 37 },
                { 33, 19, 20, 40 },
                { 44, 5, 27, 31 },
        };
        final Object[][] b = new Object[8][5];

        int grandTotal = 0;
        for (int i = 0; i < a.length; i++) {
            int total = 0;
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] = a[i][j];
//                System.out.print(anInt + ", ");
                total += a[i][j];
            }
            b[i][4] = total;
//            System.out.println(total);
            grandTotal += total;
        }

        for (int i = 0; i < a[0].length; i++) {
            int total = 0;
            for (int[] ints : a) {
                total += ints[i];
            }
            b[7][i] = total;
//            System.out.print(total + ", ");
        }
        b[7][4] = grandTotal;
        for (final Object[] row : b) {
            System.out.format("%15s%15s%15s%15s%15s\n", row);
        }
//        System.out.println(grandTotal);
    }
}
