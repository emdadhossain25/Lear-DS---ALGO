package session3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        prime(n);
    }

    /*
    definition prime: if its not divisible other then 0,1 and itself (n)
     */
    public static void prime(int n) {
        if (n == 0 || n == 1) {
            System.out.println("not prime");
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }

        }
    }
}
