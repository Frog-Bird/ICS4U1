package Arrays01;

public class four {
    public static void main(String[] args) {
        int[][] a = {
                { 99, 85, 98, 99 },
                { 98, 57, 78 },
                { 92, 77, 76 },
                { 94, 32 },
                { 99, 34, 22 },
                { 90, 46, 54 },
                { 76, 59, 88, 50 },
                { 92, 66, 89 },
                { 97, 71, 24 },
                { 89, 29}
        };
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
            System.out.println();
        }
    }
}
