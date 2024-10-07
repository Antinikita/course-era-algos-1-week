import java.util.*;

public class GCD {
    private static int gcd_naive(int a, int b) {
        int current_gcd = 1;
        int aa=0;
        while (b != 0) {
            current_gcd = a % b;
            a = b;
            b = current_gcd;
        }

        return a;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(gcd_naive(a, b));
    }
}
