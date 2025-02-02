import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC049C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inS = scanner.nextLine();
        scanner.close();

        String[] tWords = { "dream", "dreamer", "erase", "eraser" };
        String[] lines = new String[]{""};

        String result = null;
        while (result == null) {
            result = "NO";

            List<String> strings = new ArrayList<String>();
            for (int i = 0; i < lines.length; i++) {
                for (int j = 0; j < tWords.length; j++) {
                    String line = lines[i] + tWords[j];
                    if (inS.startsWith(line)) strings.add(line);
                }
            }

            for (String s : strings) {
                if (inS.equals(s)) {
                    result = "YES";
                    break;
                }
            }

            if (result.equals("NO") && strings.size() > 0) {
                result = null;
                lines = strings.toArray(new String[strings.size()]);
            }
        }

        System.out.println(result);
    }
}
