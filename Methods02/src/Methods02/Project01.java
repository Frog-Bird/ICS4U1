package Methods02;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Project01 {
    private static PrintStream fileOut;

    static {
        try {
            fileOut = new PrintStream("./text files/output.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static DecimalFormat format = new DecimalFormat("##.00");
    private static ArrayList<Double> ammounts = new ArrayList<>();
    private static ArrayList<String> lines = new ArrayList<>();
    private static String[] sAccountTypes = {"CMI","CDI","SMI","SDI","STF"};
    private static double[] interestRates = {0.5, 0.25, 2.25, 2.0, 2.5};
    private static int accountNumber;
    private static String accountType;

    public static void main(String[] args) throws IOException {
        saveTextFile();
        for (int i = 0; i < lines.size(); i++) {
            readNextLine(i);
            String printline = accountNumber + ", " + interestCalc(intrestType());
            printFile(printline);
        }
        closeFile();
    }
    private static void saveTextFile() throws FileNotFoundException {
        File text = new File("C:/Users/aavin/Desktop/ICS4U1/Methods02/text files/Project01Data.txt");
        Scanner scanner = new Scanner(text);
        while (scanner.hasNextLine()){
            lines.add(scanner.nextLine());
        }
    }
    private static void readNextLine(int l) {
        String[] data = lines.get(l).split(",");
        accountNumber = Integer.parseInt(data[0]);
        accountType = data[1].toUpperCase();
        if (l == 0){
            for (int i = 0; i < (data.length - 2); i++) {
                ammounts.add(Double.parseDouble(data[i + 2]));
            }
        }
        else {
            for (int i = 0; i < (data.length - 2); i++) {
                ammounts.set(i, Double.parseDouble(data[i + 2]));
            }
        }
    }

    private static int intrestType() {
        int num = 0;
        for (int i = 0; i < sAccountTypes.length; i++) {
            if (sAccountTypes[i].equals(accountType)){
                num = i;
            }
        }
        return num;
    }

    private static double interestCalc(int spot) {
        double totalInterest = 0;
        if (spot == 0 || spot == 2 || spot == 4){
            totalInterest = Collections.min(ammounts) * (interestRates[spot]/100/12);
        }
        else {
            for (Double ammount : ammounts) {
                totalInterest += (ammount * (interestRates[spot] / 100 / 365));
            }
        }
        return Double.parseDouble(format.format(totalInterest));
    }
    private static void printFile(String message) {
        System.setOut(fileOut);
        System.out.println(message);
    }
    private static void closeFile() {
        fileOut.close();
    }
}