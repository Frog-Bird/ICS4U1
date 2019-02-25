package Methods02;

public class Five {
    public static void main(String[] args) {
    }
    public static int GCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return (GCF(b, a % b));
        }
    }
}
