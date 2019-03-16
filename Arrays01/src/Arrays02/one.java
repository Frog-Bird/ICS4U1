package Arrays02;

import java.util.Arrays;

public class one {
    public static void main(String[] args) {
        int [] array = new int[]{5, 10, 25, 4, 3, 8, 57};
        int difforence = Integer.MAX_VALUE, one = array[0], two = array[1];
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            if (difforence > Math.abs(array[i + 1] - array [i])){
                difforence = Math.abs(array[i + 1] - array [i]);
                one = array[i];
                two = array[i + 1];
            }
        }
        System.out.println("The smallest difforence is: " + difforence + " between: " + one + " and " + two);
    }
}
