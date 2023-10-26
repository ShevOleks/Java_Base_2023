package ua.vodafone.lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StepArray {
    private static final Scanner SCANNER = new Scanner(System.in);
    static final int MIN_VALUE = 0;
    static final int MAX_VALUE = 100;
    static final int IS_NULL = MIN_VALUE - 1;

    public static void main(String[] args) {
        System.out.print("Please, enter numbers of rows for array: ");
        int rows = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.print("Please, enter max size of rows for array: ");
        int maxSize = SCANNER.nextInt();
        SCANNER.nextLine();

        if (rows <= 0 || maxSize <= 0 || MIN_VALUE == Integer.MIN_VALUE) {
            System.out.println("\nInitial error. Check number of rows and max size of rows: ");
            System.out.printf("Number of rows = %d\nMax size of rows = %d", rows, maxSize);
            System.out.printf("Minimal array value = %d vs (%d)", MIN_VALUE, Integer.MIN_VALUE + 1);
            return;
        }
        int[][] array = generateSteppedArray(rows, maxSize);
        System.out.println("\nInitial array is:");
        print2DArray(array);

        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 0) {
                sortAscend(array[i]);
            } else {
                sortDescend(array[i]);
            }
        }
        System.out.println("\nSorted array is:");
        print2DArray(array);

        int sum = sumOfArray(array);
        System.out.print("\nTotal sum of array's elements is: ");
        printVerifiedResult(sum);

        int[] minElements = selectMinimumForRows(array);
        System.out.print("\nMinimal elements of each row are: ");
        printMinElements(minElements);

        int absoluteMinimum = minimumOfArray(minElements);
        System.out.print("\nAbsolute minimum of array are: ");
        printVerifiedResult(absoluteMinimum);

        divideArrayElements(array, absoluteMinimum);
        if (absoluteMinimum == 0 || absoluteMinimum == IS_NULL) {
            System.out.println("The result of dividing by zero or null is undefined.");
        } else {
            System.out.println("\n\nDivided array is:");
            print2DArray(array);
        }

    }

    private static void printMinElements(int[] minElements) {
        for (int i = 0; i < minElements.length; i++) {
            System.out.printf("  %d). ", i + 1);
            printVerifiedResult(minElements[i]);
        }
    }

    private static void printVerifiedResult(int value) {
        if (value == IS_NULL) {
            System.out.print("null");
        } else {
            System.out.print(value);
        }
    }

    private static void divideArrayElements(int[][] array, int absoluteMinimum) {
        if (absoluteMinimum == 0 || absoluteMinimum == IS_NULL) {
            System.out.println("\nIt's not possible to divide by zero or null, because of...");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] /= absoluteMinimum;
            }
        }
    }

    private static int minimumOfArray(int[] minElements) {
        int minimum = minElements[0];
        for (int i = 0; i < minElements.length - 1; i++) {
            if (minElements[i + 1] != IS_NULL) {
                if (minimum > minElements[i + 1] || minimum == IS_NULL) {
                    minimum = minElements[i + 1];
                }
            }
        }
        return minimum;
    }

    private static int[] selectMinimumForRows(int[][] array) {
        int[] minimumNumbersForRows = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 0) {
                minimumNumbersForRows[i] = Math.min(array[i][0], array[i][array[i].length - 1]);
            } else {
                minimumNumbersForRows[i] = IS_NULL;
            }
        }
        return minimumNumbersForRows;
    }

    private static int sumOfArray(int[][] array) {
        int sum = IS_NULL;
        for (int[] row : array) {
            for (int cell : row) {
                sum += cell;
            }
        }
        if (sum != IS_NULL) {
            sum = sum - IS_NULL;
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
                array[i][j] = ThreadLocalRandom.current().nextInt(MIN_VALUE, MAX_VALUE);
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
        if (row.length == 0) {
            System.out.print("null");
            return;
        }
        for (int cell : row) {
            System.out.printf(" %2d", cell);
        }
    }
}
