package beginners;
import java.util.Scanner;
import java.util.stream.Stream;

public class ABC081B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[] a = scan.nextLine().trim().split(" ");
        int[] nums = Stream.of(a).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        while (true) {
            int[] nextNums = new int[n];
            for (int i = 0; i < n; i++) {
                if (nums[i] % 2 == 0) {
                    nextNums[i] = nums[i] / 2;
                } else {
                    break;
                }
            }
            if (nextNums[n - 1] != 0) {
                count++;
                nums = nextNums;
            } else {
                break;
            }
        }

        System.out.println(count);

        scan.close();
    }
}
