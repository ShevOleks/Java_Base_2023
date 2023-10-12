package ua.vodafone.lesson6_7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Transposition2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //Getting dimensions of arrays
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

        //Generate original array and transpose it
        int[][] origArray = generateArray(dimM, dimN);
        int[][] transArray = transposeArray(origArray);

        //Print arrays
        System.out.printf("\nOriginal array (%d x %d) is:\n", dimM, dimN);
        printArray(origArray);
        System.out.printf("\nTransposed array (%d x %d) is:\n", dimN, dimM);
        printArray(transArray);

    }

    private static int[][] generateArray(int dimM, int dimN) {
        int[][] arr = new int[dimM][dimN];
        for (int i = 0; i < dimM; i++) {
            for (int j = 0; j < dimN; j++) {
                arr[i][j] = ThreadLocalRandom.current().nextInt(100);
            }
        }
        return arr;
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
