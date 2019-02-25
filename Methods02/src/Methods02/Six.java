package Methods02;

public class Six {
    public static void main(String[] args) {

    }
    public double myround(double number, int numberOfDecimals){
        for (int i = 0; i < numberOfDecimals; i++) {
            number = number * 10;
        }
        number = Math.round(number);
        for (int i = 0; i < numberOfDecimals; i++) {
            number = number / 10;
        }
        return number;
    }
}
