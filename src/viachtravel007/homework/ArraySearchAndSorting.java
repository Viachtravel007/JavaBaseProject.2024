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
            array[i] = random.nextInt( 1, 1001);
        }

        System.out.print("Unsorted array: ");
        PrintArray(array);

        SortArray(array);

        System.out.print("\nSorted array: ");
        PrintArray(array);

        System.out.print("\nWrite a number to search in the array: ");
        int numeric = scanner.nextInt();
        int position = NumberSearch(array, numeric);
        if ( position != -1) {
            System.out.printf("The index of the number %d in the sorted array: %d", numeric, position);
        } else {
            System.out.printf("There is no number %d in the array", numeric);
        }
    }

    public static void PrintArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void SortArray(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
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
