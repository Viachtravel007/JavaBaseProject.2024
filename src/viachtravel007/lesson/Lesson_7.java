package viachtravel007.lesson;

import java.util.Scanner;

public class Lesson_7 {
    public static void main(String[] args) {

//        Prices();
        Fibonacci();

    }

    private static void Fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("count == ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        numbers[0] = 1;
        numbers[1] = 1;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }

        System.out.println();
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + "\t");
            i++;
        }

    }


    private static void Prices() {
        int[] price = {
                12, 156, 90, 1
        };

        for (int i = 0; i < price.length; i++) {
            System.out.println("price#" + i + " == " + price[i]);
        }
        System.out.println();

        int i = 0;
        for (int current : price) {
            System.out.println("price#" + i + " == " + price[i]);
            i++;
        }
    }
}

