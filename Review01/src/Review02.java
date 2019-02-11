import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javafx.scene.input.KeyCode.Z;

public class Review02 {
    public static void main(String[] args) {
        Scanner grant = new Scanner(System.in);

        int classSelection;

        System.out.println("Enter which class you would like to run: Enter 1 for class one, 2 for class two all the way up to class ten");
        classSelection = grant.nextInt();
        switch (classSelection){
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
            case 6:
                six();
                break;
            case 7:
                seven();
                break;
            case 8:
                eight();
                break;
            case 9:
                nine();
                break;
            case 10:
                ten();
                break;
        }
    }
    public static void one() {
        String notes = "ABCDEFG";

        char[] a = new char[7];
        int start = 2;

        for (int i = 0; i < 7; i++) {
            a[i] = notes.charAt(start);

            start ++;
            if (start == 7){
                start = 0;
            }
        }

        System.out.print("The key of C is: ");

        for (int i = 0; i < 6; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void two(){
        int males = 0, females = 0;
        String[] names = new String[]{"Beyonce (f)", "David Bowie (m)", "Elvis Costello (m)", "Madonna (f)", "Elton John (m)", "Charles Aznavour (m)"};

        for (int i = 0; i < names.length; i++) {
            if(names[i].contains("(m)")){
                males ++;
            }
            else{
                females ++;
            }
        }
        System.out.println("There are " + males + " male vocalists and " + females + " female vocalists");
    }

    public static void three(){
        String[] instruments = new String[]{"cello", "guitar", "violin", "double bass"};

        for (int i = 0; i < instruments.length; i++) {
            System.out.print(instruments[i].replaceAll("[AEIOUaeiou]", "") + ", ");
        }
        System.out.println();
    }

    public static void four() {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i%3 == 0){
                count ++;
            }
        }
    }

    public static void five() {
        int[] singles = new int[20];
        int[] doubles = new int[20];
        int[] trebles = new int[20];
        for (int i = 1; i <= 20; i++) {
            singles[i-1] = i;
            doubles[i-1] = i * 2;
            trebles[i-1] = i * 3;
        }
    }

    public static void six() {
        int a = 0;

        for (int i = 0; i < 64; i++) {
            if (i % 8 == 0){
                System.out.println();
            }
            switch (a) {
                case 0:
                    System.out.print("white-");
                    a ++;
                    break;

                case 1:
                    System.out.print("black-");
                    a --;
                    break;
            }
        }
    }

    public static void seven() {
        String numbers = "1-2-1-2-3";

        Pattern p = Pattern.compile("-");
        String[] number = p.split(numbers);

        for (int i = 1; i <= number.length; i++) {
            if (Integer.parseInt(number[0]) != Integer.parseInt(number[i]) + i && Integer.parseInt(number[0]) != Integer.parseInt(number[i]) - i){
                System.out.println("The series is non consecutive");
                break;
            }
        }
    }

    public static void eight() {
        String numbers2 = "1-2-3-4-4";

        Pattern p = Pattern.compile("-");
        String[] number2 = p.split(numbers2);

        for (int i = 1; i <= number2.length; i++) {
            if (Integer.parseInt(number2[i - 1]) == Integer.parseInt(number2[i])) {
                System.out.println("Pair of numbers found");
            }
            if (Integer.parseInt(number2[0]) != Integer.parseInt(number2[i]) + i && Integer.parseInt(number2[0]) != Integer.parseInt(number2[i]) - i){
                System.out.println("The series is non consecutive");
                break;
            }
            }
        }

    public static void nine() {
        System.out.println("D");
        System.out.println(" I");
        System.out.println("  A");
        System.out.println("   G");
        System.out.println("    O");
        System.out.println("     N");
        System.out.println("      A");
        System.out.println("       L");
        System.out.println("        L");
        System.out.println("         Y");
    }

    public static void ten() {
        int wins = 0, losses = 0, ties = 0, goals = 0, goalsAgainst = 0;
        String results = "Manchester United 1 Chelsea 0, Arsenal 1 Manchester United 1, Manchester United 3 Fulham 1, Liverpool 2 Manchester United 1, Swansea 2 Manchester United 4";

        String matches[] = results.split(",");

        for (int i = 0; i < matches.length; i++) {
            String points = matches[i].replaceAll("[a-zA-Z]", "");
            points = points.replaceAll("\\s*", "");
            if (matches[i].indexOf("M") == 0 || matches[i].indexOf("M") == 1){
                if (points.charAt(0) > points.charAt(1)){
                    goals = goals + Integer.parseInt(String.valueOf(points.charAt(0)));
                    goalsAgainst = goalsAgainst + Integer.parseInt(String.valueOf(points.charAt(1)));
                    wins ++;
                }
                else if(points.charAt(0)< points.charAt(1)) {
                    goals = goals + Integer.parseInt(String.valueOf(points.charAt(0)));
                    goalsAgainst = goalsAgainst + Integer.parseInt(String.valueOf(points.charAt(1)));
                    losses ++;
                }
                else {
                    goals = goals + Integer.parseInt(String.valueOf(points.charAt(0)));
                    goalsAgainst = goalsAgainst + Integer.parseInt(String.valueOf(points.charAt(1)));
                    ties ++;
                }
            }

            else {
                if (points.charAt(0) > points.charAt(1)){
                    goalsAgainst = goalsAgainst + Integer.parseInt(String.valueOf(points.charAt(0)));
                    goals = goals + Integer.parseInt(String.valueOf(points.charAt(1)));
                    losses ++;
                }
                else if(points.charAt(0)< points.charAt(1)) {
                    goalsAgainst = goalsAgainst + Integer.parseInt(String.valueOf(points.charAt(0)));
                    goals = goals + Integer.parseInt(String.valueOf(points.charAt(1)));
                    wins ++;
                }
                else {
                    goalsAgainst = goalsAgainst + Integer.parseInt(String.valueOf(points.charAt(0)));
                    goals = goals + Integer.parseInt(String.valueOf(points.charAt(1)));
                    ties ++;
                }
            }
        }
        System.out.println("Number of wins: " + wins);
        System.out.println("Number of draws: " + ties);
        System.out.println("Number of losses: " + losses);
        System.out.println("Goals for: " + goals);
        System.out.println("Goals against: " + goalsAgainst);
        System.out.println("Number of points: " + goals);
    }
}