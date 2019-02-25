package Methods02;

import java.util.Scanner;

public class AdvancedAssighnment {
    public static void main(String[] args) {
        double ticketpreice;
        boolean canVote, canBuyAlc, canCollectPension, canCollectEI, driversON, driversAL, canJoinArmy,
        canStayHomeAlone, canSuperviseChild, canGetTatoo, canRentCar, studentPilot;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        age = scanner.nextInt();
        ticketpreice = inRange(age, 14, 64) ? 10.50 : 7.99;
        canVote = inRange(age, 18);
        canBuyAlc = inRange(age, 19);
        canCollectPension = inRange(age, 60);
        canCollectEI = inRange(age, 14);
        driversON = inRange(age, 16);
        driversAL = inRange(age, 14);
        canJoinArmy = inRange(age, 16);
        canStayHomeAlone = inRange(age, 16);
        canSuperviseChild = inRange(age, 16);
        canGetTatoo = inRange(age, 18);
        canRentCar = inRange(age, 21);
        studentPilot = inRange(age, 14);
        System.out.println("Ticket Price: $" + ticketpreice);
        System.out.println("Can vote: " + canVote);
        System.out.println("Can buy Alcohol: " + canBuyAlc);
        System.out.println("Can collect pension: " + canCollectPension);
        System.out.println("Can collect employment insurance: " + canCollectEI);
        System.out.println("Can get a drivers licence in Ontario: " + driversON);
        System.out.println("Can get a drivers licence in Alberta: " + driversAL);
        System.out.println("Can join the army: " + canJoinArmy);
        System.out.println("Can stay home alone: " + canStayHomeAlone);
        System.out.println("Can supervise children: " + canSuperviseChild);
        System.out.println("Can get a tattoo alone: " + canGetTatoo);
        System.out.println("Can rent a car: " + canRentCar);
        System.out.println("Can get a student pilot permit: " + studentPilot);
    }

    // Checks if the age value is withing a specified range
    private static boolean inRange(int age, int min, int max){ return (age >= min) && (age <= max); }
    private static boolean inRange(int age, int min){ return (age >= min); }
    private static boolean inRange(int age, short min, short max){ return (age >= min) && (age <= max); }
    private static boolean inRange(int age, short min){ return (age >= min); }
    private static boolean inRange(int age, long min, long max){ return (age >= min) && (age <= max); }
    private static boolean inRange(int age, long min){ return (age >= min); }
    private static boolean inRange(int age, byte min, byte max){ return (age >= min) && (age <= max); }
    private static boolean inRange(int age, byte min){ return (age >= min); }
    private static boolean inRange(int age, float min, float max){ return (age >= min) && (age <= max); }
    private static boolean inRange(int age, float min){ return (age >= min); }
    private static boolean inRange(int age, double min, double max){ return (age >= min) && (age <= max); }
    private static boolean inRange(int age, double min){ return (age >= min); }
}