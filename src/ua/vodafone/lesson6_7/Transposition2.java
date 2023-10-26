package ua.vodafone.lesson6_7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Transposition2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please, enter dimensions of 2D array (M x N) for transposition: ");
        int rows = SCANNER.nextInt();
        while (!SCANNER.hasNextInt()) {
            SCANNER.next();
        }
        int columns = SCANNER.nextInt();
        if (rows < 1 || columns < 1) {
            System.out.println("Error. Incorrect array dimensions");
            return;
        }
        int[][] originalArray = generateArray(rows, columns);
        int[][] transposedArray = transposeArray(originalArray);
        System.out.printf("\nOriginal array (%d x %d) is:\n", rows, columns);
        printArray(originalArray);
        System.out.printf("\nTransposed array (%d x %d) is:\n", columns, rows);
        printArray(transposedArray);

    }

    private static int[][] generateArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(100);
            }
        }
        return array;
    }

    private static int[][] transposeArray(int[][] originalArray) {
        int[][] transposedArray = new int[originalArray[0].length][originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[i].length; j++) {
                transposedArray[j][i] = originalArray[i][j];
            }
        }
        return transposedArray;
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int cell : row) {
                System.out.printf(" %2d", cell);
            }
            System.out.println();
        }
    }

}
