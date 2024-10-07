import java.math.BigInteger;
import java.util.*;

public class FibonacciLastDigit {
    private static Long getFibonacciLastDigitNaive(Long n) {
        if (n <= 1)
            return n;

        Long previous = 0l;
        Long current  = 1l;

        for (int i = 0; i < n - 1; ++i) {
            Long tmp_previous = previous;
            previous = current;
            current = (tmp_previous+previous) %10;
        }
        Long a = current;
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        Long c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

