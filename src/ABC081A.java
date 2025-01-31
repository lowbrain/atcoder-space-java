import java.util.Scanner;

public class ABC081A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        char[] cs = line.toCharArray();

        int answer = 0;
        for (char c : cs) answer += Character.getNumericValue(c);
        System.out.println(answer);

        scanner.close();
    }
}
