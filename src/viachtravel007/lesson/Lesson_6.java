package viachtravel007.lesson;

import java.util.Scanner;

public class Lesson_6 {
    public static void main(String[] args) {
//        Non_integer_and_integer();
//        Multiplication_table();
        DemoWhile();
    }

    private static void DemoWhile() {
        int i = 1;
        while (i < 11) {
            int j = 1;
            while (j < 11) {
                int value = i * j;
                System.out.printf("%5d", value);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    private static void Multiplication_table() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int value = i * j;
                System.out.printf("%5d", value);
            }
            System.out.println();
        }
    }

    private static void Non_integer_and_integer() {
        Scanner scanner = new Scanner(System.in);
        int bound = scanner.nextInt();

        for (int i = 1; i <= bound; i++) {
            System.out.println(i + i);
        }

        for (int i = 1; i <= bound; i++) {
            System.out.println(i + i - 1);
        }
    }
}
