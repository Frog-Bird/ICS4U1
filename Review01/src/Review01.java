import java.text.DecimalFormat;

public class Review01 {
    public static void main(String[] args) {
        byte a; //Primitive data type
        char b; //Primitive data type
        short c; //Primitive data type
        int d; //Primitive data type
        long e; //Primitive data type
        float f; //Primitive data type
        double g; //Primitive data type
        boolean h; //Primitive data type

        String i; //One other data type

        int numberOfBottles = 12; //Number of bottles in a package
        double cost = 3.5; //Cost of the package
        String name = "Pure Life"; //Name of the brand

        DecimalFormat decimalFormat = new DecimalFormat("##.00"); // Formats decimal to 2 places

        double[] costPerBottle = new double[100];

        int table[][]= new int[10][3];

        int tableFill = 1;

        numberOfBottles = 24;
        cost = 4.5;
        name = "Selection Natural Spring Water";

        System.out.println("Cost per bottle: $" + decimalFormat.format(cost/numberOfBottles));

        for (int j = 1; j <= numberOfBottles; j++) {
            System.out.println(j + " Bottles of " + name + " costs $" + decimalFormat.format(j*(cost/numberOfBottles)));
        }

        for (int j = 0; j < 100; j++) { //Could also be a while loop
            costPerBottle[j] = Double.parseDouble(decimalFormat.format((j+1)*(cost/numberOfBottles)));
        }

        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 3; k++) {
                table[j][k] = tableFill;
                tableFill++;
            }
        }
    }
}
