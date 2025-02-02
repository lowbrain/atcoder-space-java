import java.util.Scanner;

public class ABC087B {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int inA = Integer.parseInt(scanner.nextLine()); // 500
        int inB = Integer.parseInt(scanner.nextLine()); // 100
        int inC = Integer.parseInt(scanner.nextLine()); // 50
        int inX = Integer.parseInt(scanner.nextLine());
        scanner.close();

        // calc
        int result = 0;
        for (int i = 0; i <= inA; i++) {
            for (int j = 0; j <= inB; j++) {
                for (int k = 0; k <= inC; k++) {
                    int sum = 500 * i + 100 * j + 50 * k;
                    if (sum == inX) result++;
                }
            }
        }

        // output
        System.out.println(result);
    }
}
