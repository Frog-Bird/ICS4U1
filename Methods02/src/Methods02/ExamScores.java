package Methods02;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class ExamScores {
    private static ArrayList<String> answers = new ArrayList<>();
    private static ArrayList<Integer> studentNumber = new ArrayList<>();
    private static ArrayList<Integer> scores = new ArrayList<>();
    private static ArrayList<Integer> mostCommonGrades = new ArrayList<>();
    private static ArrayList<Integer> numberOfCorrectAnswersPerQuestion = new ArrayList<>();
    private static ArrayList<String> grade = new ArrayList<>();
    private static String[] answerKey = {"F","T","F","F","T","F","F","T","F","T"};
    private static double average = 0;
    private static int A;
    private static int B;
    private static int C;
    private static int F;
    private static int one;
    private static int two;
    private static int three;
    private static int four;
    private static int five;
    private static int six;
    private static int seven;
    private static int eight;
    private static int nine;
    private static int ten;

    public static void main(String[] args) throws IOException {
        readFile();
        checkAnswers();
        gradeScores();
        printTable();
        statistics();
    }

    private static void readFile() throws IOException {
        FileReader file = new FileReader("C:/Users/aavin/Desktop/ICS4U1/Methods02/text files/ExamDataFile.txt");
        FileWriter filew = new FileWriter("C:/Users/aavin/Desktop/ICS4U1/Methods02/text files/ExamDataFile.txt");
        File text = new File("C:/Users/aavin/Desktop/ICS4U1/Methods02/text files/ExamDataFile.txt");
        Scanner scanner = new Scanner(text);
        BufferedReader reader = new BufferedReader(file);
        BufferedWriter writer = new BufferedWriter(filew);

        reader.lines().forEach((s -> Stream.of(s.split(",")).map(Double::parseDouble).forEach(x-> {
            try {
                writer.write(x + ",");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        })));

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(" ");
            answers.add(data[1]);
            studentNumber.add(Integer.parseInt(data[0]));
        }
    }

    private static void checkAnswers(){
        int score = 0;
        for (String answer : answers) {
            String[] studentAnswers = answer.split("");
            for (int j = 0; j < studentAnswers.length; j++) {
                score += (studentAnswers[j].equals(answerKey[j]) ? 1 : 0);
                if (studentAnswers[j].equals(answerKey[j])) {
                    switch (j) {
                        case 0:
                            one++;
                            break;
                        case 1:
                            two++;
                            break;
                        case 2:
                            three++;
                            break;
                        case 3:
                            four++;
                            break;
                        case 4:
                            five++;
                            break;
                        case 5:
                            six++;
                            break;
                        case 6:
                            seven++;
                            break;
                        case 7:
                            eight++;
                            break;
                        case 8:
                            nine++;
                            break;
                        case 9:
                            ten++;
                            break;
                    }
                }

            }
            scores.add(score);
            score = 0;
        }
        numberOfCorrectAnswersPerQuestion.add(one);
        numberOfCorrectAnswersPerQuestion.add(two);
        numberOfCorrectAnswersPerQuestion.add(three);
        numberOfCorrectAnswersPerQuestion.add(four);
        numberOfCorrectAnswersPerQuestion.add(five);
        numberOfCorrectAnswersPerQuestion.add(six);
        numberOfCorrectAnswersPerQuestion.add(seven);
        numberOfCorrectAnswersPerQuestion.add(eight);
        numberOfCorrectAnswersPerQuestion.add(nine);
        numberOfCorrectAnswersPerQuestion.add(ten);
    }

    private static void gradeScores(){
        for (Integer score : scores) {
            if (score >= 9) {
                grade.add("A");
            } else if (score == 8) {
                grade.add("B");
            } else if (score == 7) {
                grade.add("C");
            } else {
                grade.add("F");
            }
        }
    }

    private static void printTable(){
        for (int i = 0; i < studentNumber.size(); i++) {
            System.out.print("Student Number: " + studentNumber.get(i) + " | ");
            System.out.print("Score: : " + scores.get(i) + " | ");
            System.out.println("Grade: " + grade.get(i));
        }
    }

    private static void statistics(){
        System.out.println("Number of people who wrote the exam: " + scores.size());
        System.out.println("The highest score: " + Collections.max(scores));
        System.out.println("The lowest score: " + Collections.min(scores));
        System.out.println("The most common numeric score: " + modeOfScore());
        System.out.println("The most common letter grade: " + mostCommonLetter());
        System.out.println("Average score: " + average());
        System.out.println("Number of students with an A: " + A);
        System.out.println("Number of students with an B: " + B);
        System.out.println("Number of students with an C: " + C);
        System.out.println("Number of students with an F: " + F);
        System.out.println("Number of people who answered question 1 correctly: " + one);
        System.out.println("Number of people who answered question 2 correctly: " + two);
        System.out.println("Number of people who answered question 3 correctly: " + three);
        System.out.println("Number of people who answered question 4 correctly: " + four);
        System.out.println("Number of people who answered question 5 correctly: " + five);
        System.out.println("Number of people who answered question 6 correctly: " + six);
        System.out.println("Number of people who answered question 7 correctly: " + seven);
        System.out.println("Number of people who answered question 8 correctly: " + eight);
        System.out.println("Number of people who answered question 9 correctly: " + nine);
        System.out.println("Number of people who answered question 10 correctly: " + ten);
        System.out.println("The best answered question: " + bestAnswerdQuestion());
        System.out.println("The worst answered question: " + worstAnswerdQuestion());
    }

    private static double average(){
        for (Integer score : scores) {
            average += score;
        }
        average = average / scores.size();
        return average;
    }

    private static String mostCommonLetter(){
        for (String s : grade) {
            switch (s) {
                case "A":
                    A++;
                    break;
                case "B":
                    B++;
                    break;
                case "C":
                    C++;
                    break;
                default:
                    F++;
                    break;
            }
        }

        mostCommonGrades.add(A);
        mostCommonGrades.add(B);
        mostCommonGrades.add(C);
        mostCommonGrades.add(F);

        int max = Collections.max(mostCommonGrades);

        if (mostCommonGrades.indexOf(max) == 0){
            return "A";
        }
        else if (mostCommonGrades.indexOf(max) == 1){
            return "B";
        }
        else if (mostCommonGrades.indexOf(max) == 2){
            return "C";
        }
        else {
            return "F";
        }
    }

    private static int modeOfScore() {
        int mode = scores.get(0);
        int maxCount = 0;
        for (int i = 0; i < scores.size(); i++) {
            int value = scores.get(i);
            int count = 1;
            for (Integer score : scores) {
                if (score == value)
                    count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
    }

    private static int bestAnswerdQuestion() {
        int max = Collections.max(numberOfCorrectAnswersPerQuestion);
        return numberOfCorrectAnswersPerQuestion.indexOf(max) + 1;
    }

    private static int worstAnswerdQuestion() {
        int max = Collections.min(numberOfCorrectAnswersPerQuestion);
        return numberOfCorrectAnswersPerQuestion.indexOf(max) + 1;
    }
}