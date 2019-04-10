package Arrays02;


import java.util.Arrays;
import java.util.Scanner;

public class four {
    private static String [] array = new String[25];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 10;
        populateArray();
        while (count < 25) {
            System.out.println("Enter word");
            String word = scanner.next();
            if(Arrays.asList(array).contains(word)){
                System.out.println("The word you entered is found at: " + Arrays.asList(array).indexOf(word));
            }
            else {
                array[count] = word;
                count ++;
            }
        }
    }
    private static void populateArray(){
        array[0] = "one";
        array[1] = "two";
        array[2] = "three";
        array[3] = "four";
        array[4] = "five";
        array[5] = "six";
        array[6] = "seven";
        array[7] = "eight";
        array[8] = "nine";
        array[9] = "ten";

    }
}
