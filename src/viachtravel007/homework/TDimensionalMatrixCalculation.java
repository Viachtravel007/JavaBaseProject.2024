package viachtravel007.homework;

import java.util.Random;
import java.util.Scanner;

public class TDimensionalMatrixCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("enter the number of columns: ");
        int columns = scanner.nextInt();
        System.out.print("enter the minimum number in the matrix: ");
        int min = scanner.nextInt();
        System.out.print("enter the maximum number in the matrix: ");
        int max = scanner.nextInt();

        int[][] matrix = createMatrix(rows, columns, min, max);

        matrixOutput(matrix);

        sumRows(matrix);

        productColumns(matrix);

        magicSquare(matrix, rows, columns);

        if (magicSquare(matrix, rows, columns)) {
            System.out.println("matrix is a magic square");
        } else {
            System.out.println("matrix is not a magic square");
        }
    }

    private static int[][] createMatrix(int rows, int columns, int min, int max) {
        int[][] matrix = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(min, max+1); // Генеруємо значення у діапазоні
            }
        }

        return matrix;
    }

    private static void matrixOutput(int[][] matrix) {
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d", matrix[i][j]); // Вивід у рядок
            }
            System.out.println();
        }
    }

    private static void sumRows(int[][] matrix) {
        int sumOddRows = 0;
        int sumEvenRows = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sumEvenRows += matrix[i][j];
                }
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    sumOddRows += matrix[i][j];
                }
            }
        }

        System.out.println("sum even rows = " + sumEvenRows);
        System.out.println("sum odd rows = " + sumOddRows);
    }

    private static void productColumns(int[][] matrix) {
        long productEvenColumns = 1;
        long productOddColumns = 1;

        for (int j = 0; j < matrix[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    productEvenColumns *= matrix[i][j];
                }
            } else {
                for (int i = 0; i < matrix.length; i++) {
                    productOddColumns *= matrix[i][j];
                }
            }
        }

        System.out.println("Product of even columns = " + productEvenColumns);
        System.out.println("Product of odd columns = " + productOddColumns);
    }

    private static boolean magicSquare(int[][] matrix, int rows, int columns) {

        if ( rows != columns) {
            return false;
        }

        int controlSum = 0;
        for (int num : matrix[0]) {
            controlSum += num;
        }

        for (int i = 0; i < rows; i++) {
            int rowMagicSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                rowMagicSum += matrix[i][j];
            }
            if (rowMagicSum != controlSum) {
                return false;
            }
        }

        for (int j = 0; j < matrix.length; j++) {
            int columnMagicSum = 0;
            for (int i = 0; i < rows; i++) {
                columnMagicSum += matrix[i][j];
            }
            if (columnMagicSum != controlSum) {
                return false;
            }
        }

        int firstDiagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            firstDiagonalSum += matrix[i][i];
        }
        if (firstDiagonalSum != controlSum) {
            return false;
        }

        int secondaryDiagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            secondaryDiagonalSum += matrix[i][rows - 1 - i];
        }
        if (secondaryDiagonalSum != controlSum) {
            return false;
        }

        return true;
    }
}
