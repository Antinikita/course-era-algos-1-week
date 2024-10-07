import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;

public class Fibonacci {
    private static long calc_fib(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(n == 0) return 0;
        if(n == 1) return 1;
        arr.add(1);
        arr.add(1);
        for (int i = 2; i < n; i++) {
            arr.add(arr.get(i - 1) + arr.get(i - 2));
        }
        return arr.get(n-1);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
