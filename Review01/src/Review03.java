

import java.util.Scanner;

public class Review03 {
    public static void main(String[] args) {
        Scanner grant = new Scanner(System.in);

        int classSelection;

        System.out.println("Enter which class you would like to run: Enter 1 for class one, 2 for class two all the way up to class five");
        classSelection = grant.nextInt();
        switch (classSelection) {
            case 1:
                one();
                break;
            case 2:
                two();
                break;
            case 3:
                three();
                break;
            case 4:
                four();
                break;
            case 5:
                five();
                break;
        }
    }

    public static void one () {
        int[] countDown = {10,9,8,7,6,5,4,3,2,1};
        System.out.print("Lift off in t- ");
        for (int ignored : countDown) {
            System.out.println(ignored);
        }
        System.out.println("Lift off");
    }

    public static void two () {
        int a = 5;
        int b = 7;

        System.out.println("a^b = " + (a ^ b));
        System.out.println("a|b = " + (a | b));
        System.out.println("a&b = " + (a & b));
    }

    public static void three () {
        Scanner grant = new Scanner(System.in);

        int x = 0;
        String y;

        System.out.println("Enter any int from 1 - 10 to count to 10 starting from that int");
        x = grant.nextInt();
        switch (x){
            case 1:
                System.out.println("One");
                x ++;
            case 2:
                System.out.println("Two");
                x ++;
            case 3:
                System.out.println("Three");
                x ++;
            case 4:
                System.out.println("Four");
                x ++;
            case 5:
                System.out.println("Five");
                x ++;
            case 6:
                System.out.println("Six");
                x ++;
            case 7:
                System.out.println("Seven");
                x ++;
            case 8:
                System.out.println("Eight");
                x ++;
            case 9:
                System.out.println("Nine");
                x ++;
            case 10:
                System.out.println("Ten");
                break;
        }

        System.out.println("Enter 'if' to see how to enter an if statement, 'while' to see how to make a while loop, and 'for' to see how to make a for loop");
        y = grant.next().toLowerCase();
        switch (y){
            case "if":
                System.out.println("if('condition'){}");
                break;
            case "while":
                System.out.println("while('condition'){}");
                break;
            case "for":
                System.out.println("for (int i = 0; i < 'length'; i++) {");
                break;
        }
    }

    public static void four () {
        int[] ints = {1,2,3,4,5,6,7,8,9};
        int target = 6;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == target){
                System.out.println("Found target int at position: " + i);
                break;
            }
        }

        String[] letters = {"a","a","a","a","b","b","b","b","h","h","h","u","u","u","s","s","s"};
        String targetLetter = "a";
        int count = 0;

        for (int i = 0; i < letters.length; i++) {
            if (!letters[i].equals(targetLetter)) {
                continue;
            }
            count++;
        }
        System.out.println("There are " + count + " a's");
    }

    public static void five () {
        String x;
        double temp = 0;
        String password = "155628";

        Scanner grant = new Scanner(System.in);

        System.out.println("Enter outside temperature in celsius");
        temp = grant.nextDouble();
        System.out.println("Enter Password");
        password = grant.next();

        x = (temp >= 50) ? "Its too hot outside!": "Its not too hot outside";
        System.out.println(x);

        x = (password.equals("155628")) ? "Password is correct": "Incorrect password";
        System.out.println(x);
    }
}
