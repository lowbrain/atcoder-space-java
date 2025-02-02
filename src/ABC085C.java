    import java.util.Scanner;

    public class ABC085C {
        public static void main(String[] args) {
            // input
            Scanner scanner = new Scanner(System.in);
            int inN = scanner.nextInt();
            int inY = scanner.nextInt();
            scanner.close();

            for (int i = 0; i <= inN; i++) {
                for (int j = 0; j <= inN - i; j++) {
                    int calc = 10000 * i + 5000 * j + 1000 * (inN - i - j);
                    if (inY == calc) {
                        System.out.printf("%d %d %d\n", i, j, (inN - i - j));
                        return;
                    }
                }
            }

            // output
            System.out.printf("%d %d %d\n", -1, -1, -1);
        }
    }