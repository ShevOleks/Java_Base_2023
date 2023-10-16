package ua.vodafone.lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StepArray {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //Enter initial variables
        System.out.print("Please, enter numbers of rows for array: ");
        int rows = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.print("Please, enter max size of rows for array: ");
        int maxSize = SCANNER.nextInt();
        SCANNER.nextLine();

        //Check initial variables
        if (rows <= 0 || maxSize <= 0) {
            System.out.println("\nInitial error. Check number of rows and max size of rows: ");
            System.out.printf("Number of rows = %d\nMax size of rows = %d", rows, maxSize);
            return;
        }

        //Generate array
        int[][] array = generateSteppedArray(rows, maxSize);

        //Print initial array
        System.out.println("\nInitial array is:");
        print2DArray(array);

        //Sort array
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 0) {
                sortAscend(array[i]);
            } else {
                sortDescend(array[i]);
            }
        }
        System.out.println("\nSorted array is:");
        print2DArray(array);

        //Sum of elements
        int sum = sumOfArray(array);
        System.out.printf("\nTotal sum of array's elements is: %d", sum);

        //Min elements for each row
        int[] minElements = selectMinimumForRows(array);
        System.out.print("\nMinimal elements of each existing row are: ");
        printLineArray(minElements);

        //Absolute minimum of array
        int absoluteMinimum = minimumOfArray(minElements);
        System.out.print("\nAbsolute minimum of array are: " + absoluteMinimum);

        //Divide all array's elements by absolute minimum of array
        if (absoluteMinimum == 0) {
            System.out.println("It's not possible to divide by zero, because of absolute minimum");
            return;
        }
        divideArrayElements(array, absoluteMinimum);
        System.out.println("\n\nDivided array is:");
        print2DArray(array);

    }

    private static void divideArrayElements(int[][] array, int absoluteMinimum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] /= absoluteMinimum;
            }
        }
    }

    private static int minimumOfArray(int[] minElements) {
        sortAscend(minElements);
        return minElements[0];
    }

    private static int[] selectMinimumForRows(int[][] array) {
        int[] minimumNumbersForRows = new int[array.length - numbersEmptyRows(array)];
        int index = 0;
        for (int[] row : array) {
            if (row.length != 0) {
                minimumNumbersForRows[index] = Math.min(row[0], row[row.length - 1]);
                index++;
            }
        }
        return minimumNumbersForRows;
    }

    private static int numbersEmptyRows(int[][] array) {
        int rows = 0;
        for (int[] row : array) {
            if (row.length == 0) {
                rows++;
            }
        }
        return rows;
    }

    private static int sumOfArray(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int cell : row) {
                sum += cell;
            }
        }
        return sum;
    }

    private static void sortDescend(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int j, int i) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

    private static void sortAscend(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static int[][] generateSteppedArray(int rows, int maxSize) {
        int[][] array = new int[rows][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[ThreadLocalRandom.current().nextInt(maxSize)];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(100);
            }
        }
        return array;
    }

    private static void print2DArray(int[][] arr) {
        System.out.println("================");
        for (int[] row : arr) {
            printLineArray(row);
            System.out.println();
        }
        System.out.println("================");
    }

    private static void printLineArray(int[] row) {
        for (int cell : row) {
            System.out.printf(" %2d", cell);
        }
    }
}
