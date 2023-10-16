package ua.vodafone.lesson6_7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Transposition2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //Getting dimensions of arrays
        System.out.print("Please, enter dimensions of 2D array (M x N) for transposition: ");
        int rows = SCANNER.nextInt();
        //Exclude some symbols between numbers
        while (!SCANNER.hasNextInt()) {
            SCANNER.next();
        }
        int columns = SCANNER.nextInt();
        //Check for correct dimensions
        if (rows < 1 || columns < 1) {
            System.out.println("Error. Incorrect array dimensions");
            return;
        }

        //Generate original array and transpose it
        int[][] originalArray = generateArray(rows, columns);
        int[][] transposedArray = transposeArray(originalArray);

        //Print arrays
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

    private static int[][] transposeArray(int[][] origArray) {
        int[][] arr = new int[origArray[0].length][origArray.length];
        for (int i = 0; i < origArray.length; i++) {
            for (int j = 0; j < origArray[i].length; j++) {
                arr[j][i] = origArray[i][j];
            }
        }
        return arr;
    }

    private static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int cell : row) {
                System.out.printf(" %2d", cell);
            }
            System.out.println();
        }
    }

}
