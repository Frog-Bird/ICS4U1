package Methods02;

public class Three {
    public static void main(String[] args) {

    }
    public boolean testPrimeNumber(int var){
        int test;
        boolean isPrime = true;
        for(int i=2; i<=var/2; i++) {
            test = var % i;
            if(test==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
