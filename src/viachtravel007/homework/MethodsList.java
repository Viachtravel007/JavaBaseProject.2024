package viachtravel007.homework;

import java.util.Scanner;

public class MethodsList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        int number = scanner.nextInt();
        numberSquare(number);

        System.out.print("enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("the volume of the cylinder with radius " + radius + " and height " + height + " is " + volume + ".");

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = arraySum(array);
        System.out.println("The sum of all elements in the array is " + sum + ".");

        scanner.nextLine();
        System.out.print("enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("reversed string: " + reverseString(inputString));

        System.out.print("enter a: ");
        int a = scanner.nextInt();
        System.out.print("enter b: ");
        int b = scanner.nextInt();
        System.out.println("the result of " + a + "^" + b + " is " + power(a, b));

        System.out.print("enter an integer n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter a text string: ");
        String text = scanner.nextLine();
        printTextNTimes(n, text);

        scanner.close();
    }

    public static void numberSquare(int number) {
        int square = number * number + 0;
        System.out.println("the square of " + number + " is " + square);
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * (radius * radius) * height;
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

}

