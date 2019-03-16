package Arrays02;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class two {
    private  static int[][] a = new int[10][10];
    public static void main(String[] args) {
        for(int x = 0; x < 10; x++) {
            for(int y = 0; y < 10; y++) {
                a[x][y] = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            }
        }


        if (largestRow()[1] > largestColum()[1]){
            System.out.println("The row/colum with the larges sum is row: " + largestRow()[0]);
        }
        else if (largestRow()[1] < largestColum()[1]) {
            System.out.println("The row/colum with the larges sum is colum: " +largestColum()[0]);
        }
        else {
            System.out.println("The row/colum with the larges sum is both row: " +largestRow()[0] + " and colum: " + largestColum()[0]);
        }
    }
    private static int[] largestRow(){
        int sum = Integer.MIN_VALUE;
        int spot = 0;
        int[] retur = new int[2];
        for (int i = 0; i < a.length - 1; i++) {
            if (sum < IntStream.of(a[i]).sum()){
                sum = IntStream.of(a[0]).sum();
                spot = i;
            }
        }
        retur [0] = spot;
        retur [1] = sum;
        return retur;
    }
    private static int[] largestColum(){
        int sum = Integer.MIN_VALUE, tempSum = 0;
        int spot = 0;
        int[] retur = new int[2];
        for (int i = 0; i < a[0].length; i++) {

            for (int[] ints : a) {
                tempSum += ints[i];
            }

            if (tempSum > sum){
                spot = i;
                sum = tempSum;
                tempSum = 0;
            }

        }
        retur [0] = spot;
        retur [1] = sum;
        return retur;
    }
}
