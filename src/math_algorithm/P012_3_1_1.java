package math_algorithm;

import java.util.Scanner;

public class P012_3_1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inAge = scanner.nextLong();
        scanner.close();

        long remainder = -1;
        for (long i = 2; i * i < inAge; i++) {
            remainder = inAge % i;
            if (remainder == 0) break;
        }

        if (remainder == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
