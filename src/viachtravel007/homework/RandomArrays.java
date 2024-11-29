package viachtravel007.homework;

import java.util.Random;

public class RandomArrays {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 101);
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
        if (firstNegative != -1) {
            for (int i = firstNegative + 1; i < array.length; i++) {
                sumAfterNegative += array[i];
                countAfterNegative++;
            }
        }
        double average = (double) sumAfterNegative / countAfterNegative;


        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
