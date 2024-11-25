package viachtravel007.homework;

import java.util.Scanner;

public class CalculatingSumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
        }
        System.out.println("-----------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}
