package ua.vodafone.lesson6_7;

import java.util.concurrent.ThreadLocalRandom;

public class Array {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(100);
        }
        System.out.println("Array before sorting");
        printArr(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println("\nArray after sorting");
        printArr(arr);

        swap(arr, 0, arr.length-1);
        System.out.println("\nArray after change 1-st and last cells");
        printArr(arr);

    }

    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    private static void printArr(int[] arr) {
        for (int cell : arr) {
            System.out.print(cell + "; ");
        }
    }
}
