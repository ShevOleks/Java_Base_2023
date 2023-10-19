package ua.vodafone.lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StepArray {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please, enter numbers of rows for array: ");
        int rows = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.print("Please, enter max size of rows for array: ");
        int maxSize = SCANNER.nextInt();
        SCANNER.nextLine();
        int maxValue = 100;
        int minValue = 0;

        if (rows <= 0 || maxSize <= 0) {
            System.out.println("\nInitial error. Check number of rows and max size of rows: ");
            System.out.printf("Number of rows = %d\nMax size of rows = %d", rows, maxSize);
            return;
        }
        int[][] array = generateSteppedArray(rows, maxSize, minValue, maxValue);
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

        int sum = sumOfArray(array, minValue);
        System.out.print("\nTotal sum of array's elements is: ");
        printVerifiedResult(sum, minValue);

        int[] minElements = selectMinimumForRows(array, minValue);
        System.out.print("\nMinimal elements of each row are: ");
        printMinElements(minElements, minValue);

        int absoluteMinimum = minimumOfArray(minElements, minValue);
        System.out.print("\nAbsolute minimum of array are: ");
        printVerifiedResult(absoluteMinimum, minValue);

        if (absoluteMinimum == 0) {
            System.out.println("\nIt's not possible to divide by zero, because of...");
            return;
        }
        divideArrayElements(array, absoluteMinimum);
        System.out.println("\n\nDivided array is:");
        print2DArray(array);

    }

    private static void printMinElements(int[] minElements, int minValue) {
        for (int i = 0; i < minElements.length; i++) {
            System.out.printf("  %d). ", i + 1);
            printVerifiedResult(minElements[i], minValue);
        }
    }

    private static void printVerifiedResult(int value, int minValue) {
        if (value == minValue - 1) {
            System.out.print("null");
        } else {
            System.out.print(value);
        }
    }

    private static void divideArrayElements(int[][] array, int absoluteMinimum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] /= absoluteMinimum;
            }
        }
    }

    private static int minimumOfArray(int[] minElements, int minValue) {
        int minimum = minElements[0];
        for (int i = 0; i < minElements.length - 1; i++) {
            if (minElements[i + 1] != minValue - 1) {
                if (minimum > minElements[i + 1] || minimum == minValue - 1) {
                    minimum = minElements[i + 1];
                }
            }
        }
        return minimum;
    }

    private static int[] selectMinimumForRows(int[][] array, int minValue) {
        int[] minimumNumbersForRows = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 0) {
                minimumNumbersForRows[i] = Math.min(array[i][0], array[i][array[i].length - 1]);
            } else {
                minimumNumbersForRows[i] = minValue - 1;
            }
        }
        return minimumNumbersForRows;
    }

    private static int sumOfArray(int[][] array, int minValue) {
        int sum = minValue - 1;
        for (int[] row : array) {
            for (int cell : row) {
                sum += cell;
            }
        }
        if (sum != minValue - 1) {
            sum = sum - minValue - 1;
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

    private static int[][] generateSteppedArray(int rows, int maxSize, int minValue, int maxValue) {
        int[][] array = new int[rows][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[ThreadLocalRandom.current().nextInt(maxSize)];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(minValue, maxValue);
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
