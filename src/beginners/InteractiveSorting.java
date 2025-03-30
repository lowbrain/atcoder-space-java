package beginners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InteractiveSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputN = scanner.nextInt();
        int inputQ = scanner.nextInt();
        scanner.nextLine();

        // リストの作成
        List<String> sortList = new ArrayList<String>();
        for (int i = 0; i < inputN; i++ ) {
            sortList.add(Character.toString('A' + i));
        }

        // シェルソート
        int interval = 4;
        interval = interval > inputN ? 1 : interval;
        while (interval > 0) {
            for (int i = 0; i < interval; i++) {
                int size = (int)Math.ceil(sortList.size() / (interval * 1.00));
                String[] list = new String[size];

                // 選択
                for (int j = 0; j < list.length; j++) {
                    int index = interval * j + i;
                    list[j] = sortList.size() > index ? sortList.get(index) : null;
                }

                // ソート
                // System.out.println(Arrays.toString(list));
                for (int j = 1; j < list.length && list[j] != null; j++) {
                    for (int k = 0; k < j; k++) {
                        System.out.printf("? %s %s\n", list[j], list[k]);
                        String result = scanner.nextLine();
                        if (result.equals("<")) {
                            String value = list[j];
                            for (int l = j; l > 0; l--) list[l] = list[l - 1];
                            list[k] = value;
                            break;
                        }    
                    }
                }
                // System.out.println(Arrays.toString(list));

                // 入替
                for (int j = 0; j < list.length; j++) {
                    int index = interval * j + i;
                    if (list[j] != null) sortList.set(index, list[j]);
                }
            }
            interval = interval / 2;
        }

        StringBuilder sb = new StringBuilder();
        sortList.stream().forEach(sb::append);
        System.out.printf("! %s\n", sb.toString());

        scanner.close();
    }
}
