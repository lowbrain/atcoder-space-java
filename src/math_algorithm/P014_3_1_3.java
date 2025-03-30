package math_algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P014_3_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inAge = scanner.nextLong();
        scanner.close();

        List<Long> list = new ArrayList<Long>();
        long lcm = inAge;
        while(true){
            long lcm1 = calcLCM(lcm);
            if (lcm1 > 0) {
                list.add(Long.valueOf(lcm1));
                lcm = lcm / lcm1;
            } else {
                list.add(Long.valueOf(lcm));
                break;
            }
        }

        for(int i = 0; i < list.size(); i++) {
            String output = null;
            switch (i) {
                case 0 :
                    output = list.get(i).toString();
                    break;
                default :
                    output = " " + list.get(i).toString();
                    break;
            }
            System.out.print(output);
        }
        System.out.println();
    }

    private static long calcLCM(long l) {
        long result = 0;
        long remainder = 0;
        for (long i = 2; i * i <= l; i++) {
            remainder = l % i;
            if (remainder == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

}
