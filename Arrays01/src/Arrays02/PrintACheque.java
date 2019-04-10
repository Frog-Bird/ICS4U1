package Arrays02;// The "PrintACheque" class.
import java.util.Scanner;

///////////////////////////////////////////////////
//
//  This assignment prompts the user for an
//  amount to be printed on a cheque.
//
//  It uses the value and translate the numeric
//  value into a worded representation of the
//  number.  This word representation is printed.
//
//  Example:
//    If the user entered a value of 1357.86
//    the program will print the expression:
//
//    One Thousand Three Hundred Fifty Seven Dollars and 86 Cents
//
//////////////////////////////////////////////////
public class PrintACheque
{
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args)
    {
        // Set up variable to be used in the program.
        int iChqAmount, iPennies, iTens, iDollars, iHundreds, iBlockOf3, iSection;
        String[] ones = new String[]{"", "one", "two", "three", "four", "five", "six" ,"seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] hundreds = new String[]{"", "one hundred", "two hundred", "three hundred", "four hundred",
                "five hundred", "six hundred" ,"seven hundred", "eight hundred", "nine hundred"};

        double dChqAmount;

        String sPennies       = "",
                sSectionPhrase = "",
                sChqPhrase     = "";

        // Prompt the user for the cheque amount
        System.out.print("Please enter the Amount for the Cheque: ");
        dChqAmount = scanner.nextDouble();

        // Turn the Cheque Amount into an integer that
        // will be processed one section at a time
        //   e.g. dChqAmount = 1357.86
        //   ---> iChqAmount = 135786
        iChqAmount = (int) (dChqAmount * 100);
        if (iChqAmount < 0) iChqAmount *= -1;

        // Extract the pennies from the Chq Amount
        iPennies = iChqAmount % 100;
        // Turn the integer for Pennies into a string
        sPennies = "" + iPennies;
        // Pad the Pennies string with a leading zero if it is only one digit long
        if (sPennies.length() == 1) sPennies = "0" + sPennies;


        // Adjust the ChqAmount to remove the pennies
        iChqAmount /= 100;
        if (iChqAmount == 0)
        {
            sChqPhrase = "Zero ";
        }
        else
        {
            for (iSection = 1; iSection <= 2; iSection++)
            {
                // Strip last three digits from the Chq Amount
                //  & then remove them
                iBlockOf3  = iChqAmount % 1000;
                iChqAmount /= 1000;

                //Reset Section Phrase to blanks
                sSectionPhrase = "";

                iTens      = iBlockOf3 % 100;
                iDollars   = iBlockOf3 % 10;
                iHundreds  = iBlockOf3 / 100;

                // Handle the Hundreds
                sSectionPhrase += hundreds[iHundreds];

                // Handle the Tens
                if (iTens >= 20)
                {
                    iTens /= 10;
                    sSectionPhrase += tens[iTens];
                    sSectionPhrase += ones[iDollars];

                }
                else
                //  0 to 19 are handled as exceptions
                {
                    sSectionPhrase += ones [iTens];
                }
                if (iBlockOf3 > 0)
                    if (iSection == 2) sChqPhrase = sSectionPhrase + " Thousand " + sChqPhrase;
                    else sChqPhrase += sSectionPhrase;
            }
            System.out.println("\n\nThe amount in words would be:\n\t"
                    + sChqPhrase + " Dollars and " + sPennies + " Cents");
        }
    } // main method
} // PrintACheque class
