package ua.vodafone.lesson6_7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Transposition1 {
    public static void main(String[] args) {
        //Getting dimensions of arrays and voids them
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
        int[][] originalArray = new int[rows][columns];
        int[][] transposedArray = new int[columns][rows];

        //Generating original and transposed arrays
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[i].length; j++) {
                originalArray[i][j] = ThreadLocalRandom.current().nextInt(100);
                transposedArray[j][i] = originalArray[i][j];
            }
        }
        //Print arrays
        System.out.printf("\nOriginal array (%d x %d) is:\n", rows, columns);
        printArray(originalArray);
        System.out.printf("\nTransposed array (%d x %d) is:\n", columns, rows);
        printArray(transposedArray);

    }

    private static final Scanner SCANNER = new Scanner(System.in);

    private static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int cell : row) {
                System.out.printf(" %2d", cell);
            }
            System.out.println();
        }
    }

}
