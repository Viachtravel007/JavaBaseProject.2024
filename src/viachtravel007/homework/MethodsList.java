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

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        System.out.println("The result of " + base + "^" + exponent + " is " + power(base, exponent));

        System.out.print("enter an integer number of times: ");
        int times = scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter a text string: ");
        String text = scanner.nextLine();
        printTextNTimes(times, text);

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
        char[] chars = input.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[n - 1 - i];
            chars[n - 1 - i] = temp;
        }
        return new String(chars);
    }

    public static double power(int base, int exponent) {
        return (float) Math.pow(base, exponent);
    }

    public static void printTextNTimes(int times, String text) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}

