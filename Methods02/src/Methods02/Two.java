package Methods02;

public class Two {
    public static void main(String[] args) {

    }

    public void testPrimeNumber(int var){
        int test;
        boolean isPrime = true;
        for(int i=2; i<=var/2; i++) {
            test = var % i;
            if(test==0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(var + " is a Prime Number");
        }
        else {
            System.out.println(var + " is not a Prime Number");
        }
    }
}
