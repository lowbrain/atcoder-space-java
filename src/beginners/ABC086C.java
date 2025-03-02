package beginners;
import java.util.Scanner;
import java.util.stream.Stream;

public class ABC086C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nの入力
        int inN = Integer.parseInt(scanner.nextLine());

        // XY座標の入力
        int[][] inTXY = new int[inN][3];
        for (int i = 0; i < inN; i++) {
            String line = scanner.nextLine();
            inTXY[i] = Stream.of(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        scanner.close();

        // 判定
        String answer = "Yes";
        int[] tmpTXY = {0, 0, 0};
        for (int i = 0; i < inN; i++) {
            int[] nowTXY = inTXY[i];
            int count = nowTXY[0] - tmpTXY[0]; 
            int length = Math.abs(tmpTXY[1] - nowTXY[1]) + Math.abs(tmpTXY[2] - nowTXY[2]);
            if (length > count || (count % 2 != length % 2)) {
                answer = "No";
                break;
            }
            tmpTXY = nowTXY;
        }

        System.out.println(answer);
    }
}
