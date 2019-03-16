package Arrays01;

public class three {
    public static void main(String[] args) {
        int[][] a = {
                { 99, 85, 98 },
                { 98, 57, 78 },
                { 92, 77, 76 },
                { 94, 32, 11 },
                { 99, 34, 22 },
                { 90, 46, 54 },
                { 76, 59, 88 },
                { 92, 66, 89 },
                { 97, 71, 24 },
                { 89, 29, 38 }
        };
        for (int i = 0; i < a[0].length; i++) {
            for (int[] ints : a) {
                System.out.print(ints[i] + ", ");
            }
            System.out.println();
        }
    }
}
