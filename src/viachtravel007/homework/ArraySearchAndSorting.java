package viachtravel007.homework;

import java.util.Scanner;
import java.util.Random;

public class ArraySearchAndSorting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the number of array elements: ");
        int number = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt( 1, 101);
        }

        System.out.print("Unsorted array: ");
        for ( int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int steps = 0;
        boolean sorted = false;
        for (int j = 0; j < array.length; j++) {
            if ( sorted ) {
               break;
            }
           sorted = true;
            for (int i = 0; i < array.length - j- 1; i++) {
                steps++;
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    sorted = false;
                }
            }
        }

        System.out.print("\nSorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nWrite a number to search in the array: ");
        int numeric = scanner.nextInt();
        int position = NumberSearch(array, numeric);
        if ( position != -1) {
            System.out.printf("The index of the number %d in the sorted array: %d", numeric, position);
        } else {
            System.out.printf("There is no number %d in the array", numeric);
        }
    }

    public static int NumberSearch(int[] array, int numeric) {
        int left = 0;
        int right = array.length - 1;
        do {
            int middle = (left + right) / 2;
            if (array[middle] > numeric) {
                right = middle - 1;
            } else if ( array[middle] < numeric) {
                left = middle + 1;
            } else {
                return middle;
            }
        } while (left <= right);
        return -1;
    }

}
