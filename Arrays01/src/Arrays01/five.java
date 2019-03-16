package Arrays01;

public class five {
    public static void main(String[] args) {
        int[] a = new int[] {46,75,61,79,70,33,62,24,29,78,45,71,86,35,47,20,38,77,22,25,58,47,59,22,33};

        for (int i = 0; i < a.length - 1; i++) System.out.println(a[i] + ", " + a[i + 1]);
        for (int i = 0; i < a.length - 2; i++) System.out.println(a[i] + ", " + a[i + 1] + ", " + a[i + 2]);
        for (int i = 0; i < a.length - 3; i++) System.out.println(a[i] + ", " + a[i + 1] + ", " + a[i + 2] + ", " + a[i + 3]);
        for (int i = 0; i < a.length - 4; i++) System.out.println(a[i] + ", " + a[i + 1] + ", " + a[i + 2] + ", " + a[i + 3] + ", " + a[i + 4]);
        for (int i = 0; i < a.length - 5; i++) System.out.println(a[i] + ", " + a[i + 1] + ", " + a[i + 2] + ", " + a[i + 3] + ", " + a[i + 4] + ", " + a[i + 5]);
    }
}
