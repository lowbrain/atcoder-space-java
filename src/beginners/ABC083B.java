package beginners;
import java.util.Scanner;

public class ABC083B {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int inN = scanner.nextInt();
        int inA = scanner.nextInt();
        int inB = scanner.nextInt();
        scanner.close();

        int result = 0;
        for (int i = 1; i <= inN; i++) {
            int sum =  (i % 100000 / 10000) + (i % 10000 / 1000) + (i % 1000 / 100) + (i % 100 / 10) + (i % 10 / 1);
            if (inA <= sum && inB >= sum) result += i;
        }

        System.out.println(result);
    }
}
