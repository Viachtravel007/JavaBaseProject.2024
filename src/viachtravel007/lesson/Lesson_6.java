package viachtravel007.lesson;

import java.util.Scanner;

public class Lesson_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bound = scanner.nextInt();

        for (int i = 1; i <= bound; i++) {
            System.out.println(i + i);
        }

        for (int i = 1; i <= bound; i++) {
            System.out.println(i + i - 2);
        }
    }
}
