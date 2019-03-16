package Arrays02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class three {
    public static void main(String[] args) {
        int[] a = new int[10];
        int number;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            a[i] = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        }
        System.out.println("Enter number to search for");
        number = scanner.nextInt();

        for (int i1 : a) {
            if (number == i1) {
                System.out.println("Number is in array");
            }
        }
    }
}
