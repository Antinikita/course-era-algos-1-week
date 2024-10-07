import java.util.*;

public class LCM {
  private static long lcm_naive(long a, long b) {
    long current_gcd = 1;
    long aa=a,bb=b;
    while (b != 0) {
      current_gcd = a % b;
      a = b;
      b = current_gcd;
    }
    return aa*bb/a;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
