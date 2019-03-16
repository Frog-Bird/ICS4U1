package Arrays02;


import java.util.Arrays;
import java.util.Scanner;

public class four {
    private static String [] a = new String[25];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 10;
        populateArray();
        while (count < 25) {
            System.out.println("Enter word");
            String word = scanner.next();
            if(Arrays.asList(a).contains(word)){
                System.out.println("The word you entered is found at: " + Arrays.asList(a).indexOf(word));
            }
            else {
                a[count] = word;
                count ++;
            }
        }
    }
    private static void populateArray(){
        a[0] = "one";
        a[1] = "two";
        a[2] = "three";
        a[3] = "four";
        a[4] = "five";
        a[5] = "six";
        a[6] = "seven";
        a[7] = "eight";
        a[8] = "nine";
        a[9] = "ten";

    }
}
