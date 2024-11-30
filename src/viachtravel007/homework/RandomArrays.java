package viachtravel007.homework;

import java.util.Scanner;
import java.util.Random;

public class RandomArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the number of array elements: ");
        int number = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt( -100, 101);
        }

        int sumNegatives = 0;
        for (int i : array) {
            if (i < 0) {
                sumNegatives += i;
            }
        }

        int integer = 0;
        int nonInteger = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                integer++;
            } else {
                nonInteger++;
            }
        }

        int minElement = array[0];
        int maxElement = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
                minIndex = i;
            }
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
        }

        int firstNegative = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegative = i;
                break;
            }
        }
        int sumAfterNegative = 0;
        int countAfterNegative = 0;
        double average = 0;
        if (firstNegative != -1) {
            for (int i = firstNegative + 1; i < array.length; i++) {
                sumAfterNegative += array[i];
                countAfterNegative++;
            }
        }
        if (countAfterNegative > 0) {
            average = (double) sumAfterNegative / countAfterNegative;
        }

        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.printf("\nThe sum of negative numbers: " + sumNegatives);
        System.out.printf("\nNumber of integer numbers: " + integer);
        System.out.printf("\nNumber of nonInteger numbers: " + nonInteger);
        System.out.printf("\nSmallest element: " + minElement + " (with index " + minIndex + ")");
        System.out.printf("\nLargest element: " + maxElement + " (with index " + maxIndex + ")");
        if (firstNegative != -1) {
            System.out.printf("\nArithmetic average of numbers after the first negative number: %.2f", average);
        } else {
            System.out.printf("\nThere are no negative numbers in the array");
        }

    }
}
