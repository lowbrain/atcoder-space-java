package beginners;
import java.util.Scanner;

public class ABC086A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] inNums = line.trim().split(" ");
        int answer = Integer.parseInt(inNums[0]) * Integer.parseInt(inNums[1]);

        if (answer % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        scanner.close();
    }
}
