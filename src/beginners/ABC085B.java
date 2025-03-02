package beginners;
import java.util.Arrays;
import java.util.Scanner;

public class ABC085B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inN = Integer.valueOf(scanner.nextLine());
        
        int[] inDs = new int[inN];
        for(int i = 0; i < inDs.length; i++) inDs[i] = Integer.valueOf(scanner.nextLine());
        Arrays.sort(inDs);
        
        scanner.close();

        int max = 101;
        int record = 0;
        for(int i = inDs.length - 1; i >= 0; i--) {
            if (max > inDs[i]) {
                max = inDs[i];
                record++;
            }
        }

        System.out.println(record);
    }
}
