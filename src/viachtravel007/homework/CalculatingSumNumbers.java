package viachtravel007.homework;

import java.util.Scanner;

public class CalculatingSumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write which loop you want to use (For, While, Do-While)");
        String method = scanner.nextLine();

        if (method.equalsIgnoreCase("For")) {
            ForLoops();
        } else if (method.equalsIgnoreCase("While")) {
            WhileLoops();
        } else if (method.equalsIgnoreCase("Do-While")) {
            DoWhileLoops();
        } else {
            System.out.println("Invalid input. Please write For, While, or Do-While.");
        }

    }

    public static void ForLoops() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write any number");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
        }
        System.out.println("-----------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

    public static void WhileLoops() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write any number");
        int number = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= number) {
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
            i++;
        }
        System.out.println("-----------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

    public static void DoWhileLoops() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write any number");
        int number = scanner.nextInt();
        int sum = 0;
        int i = 1;
        do  {
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
            i++;
        } while (i <= number);
        System.out.println("-----------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

}
