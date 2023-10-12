package ua.vodafone.lesson6_7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Transposition1 {
    public static void main(String[] args) {
        //Getting dimensions of arrays and voids them
        System.out.print("Please, enter dimensions of 2D array (M x N) for transposition: ");
        int dimM = SCANNER.nextInt();
        //Exclude some symbols between numbers
        while (!SCANNER.hasNextInt()) {
            SCANNER.next();
        }
        int dimN = SCANNER.nextInt();
        //Check for correct dimensions
        if (dimM < 1 || dimN < 1) {
            System.out.println("Error. Incorrect array dimensions");
            return;
        }
        int[][] origArray = new int[dimM][dimN];
        int[][] transArray = new int[dimN][dimM];

        //Generating original and transposed arrays
        for (int i = 0; i < origArray.length; i++) {
            for (int j = 0; j < origArray[i].length; j++) {
                origArray[i][j] = ThreadLocalRandom.current().nextInt(100);
                transArray[j][i] = origArray[i][j];
            }
        }
        //Print arrays
        System.out.printf("\nOriginal array (%d x %d) is:\n", dimM, dimN);
        printArray(origArray);
        System.out.printf("\nTransposed array (%d x %d) is:\n", dimN, dimM);
        printArray(transArray);

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
