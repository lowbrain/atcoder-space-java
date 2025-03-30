package math_algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P013_3_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inAge = scanner.nextLong();
        scanner.close();

        List<Long> list = new ArrayList<Long>();
        long remainder = -1;
        for (long i = 1; i * i < inAge; i++) {
            remainder = inAge % i;
            if (remainder == 0) {
                list.add(Long.valueOf(i));
                list.add(Long.valueOf(inAge / i));
            }
        }

        for (Long l: list) {
            System.out.println(l);
        }

    }
}
