import java.util.Scanner;

public class ABC049C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inS = scanner.nextLine();
        scanner.close();

        StringBuilder s = new StringBuilder(inS);
        String[] tWords = { "dreamer", "dream", "eraser", "erase" };
        String result = null;

        while (result == null) {
            int wordLength = s.length();
            for (int i = 0; i < tWords.length; i++) {
                if (s.length() >= tWords[i].length()) {
                    String lastWord = s.substring(s.length() - tWords[i].length(), s.length());
                    if (lastWord.equals(tWords[i])) {
                        s.delete(s.length() - tWords[i].length(), s.length());
                        break;
                    }
                }
            }

            if (s.length() == 0) {
                result = "YES";
            } else if (wordLength == s.length()) {
                result = "NO";
            }
        }

        System.out.println(result);
    }
}
