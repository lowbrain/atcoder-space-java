package math_algorithm;

import java.util.Scanner;

public class P015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");

        long a = Long.parseLong(values[0]);
        long b = Long.parseLong(values[1]);
        long result = 0;
        while(true) {
            long remainder = 0;
            if (a > b) {
                remainder = a % b;
                result = b;
            } else {
                remainder = b % a;
                result = a;
            }

            if (remainder == 0) {
                break;
            } else {
                a = remainder;
                b = result;
            }
        }

        System.out.println(result);
    }
}
