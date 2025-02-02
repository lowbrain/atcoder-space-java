import java.util.Scanner;

public class WellcomeToAtCoder {

    public static void main(String[] args) {
        String[] lines = new String[3];
        int sum = 0;

        // 入力
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < lines.length; i++) lines[i] = scan.nextLine();

        // 1行目
        sum += Integer.parseInt(lines[0].trim());

        // 2行目
        for (String str : lines[1].trim().split(" ")) sum += Integer.parseInt(str);

        // 3行目
        String str = lines[2];

        // 出力
        System.out.println(sum + " " + str);
        scan.close();
    }
}
