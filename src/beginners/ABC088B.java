package beginners;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class ABC088B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inN = Integer.parseInt(scanner.nextLine());
        String[] inLines = scanner.nextLine().trim().split(" ");
        Integer[] inAs = Stream.of(inLines).map(Integer::valueOf).toArray(Integer[]::new);
        scanner.close();

        int alice = 0, bob = 0;
        Arrays.sort(inAs, Collections.reverseOrder());
        for (int i = 0 ; i < inN; i++) {
            if (i % 2 == 0) {
                alice += inAs[i];
            } else {
                bob += inAs[i];
            }
        }

        System.out.println(alice - bob);
    }
}
