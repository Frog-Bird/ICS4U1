package Methods02;

public class Four {
    public static void main(String[] args) {

    }
    public int lcm(int numberOne, int numberTwo){
        int lcm = (numberOne > numberTwo) ? numberOne : numberTwo;
        while(true)
        {
            if( lcm % numberOne == 0 && lcm % numberTwo == 0 )
            {
                return lcm;
            }
            ++lcm;
        }
    }
}
