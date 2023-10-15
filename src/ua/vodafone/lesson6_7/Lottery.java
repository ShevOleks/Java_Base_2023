package ua.vodafone.lesson6_7;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        // Making arrays
        int lengthArr = 7;
        int numRange = 9;
        int[] org = genArray(lengthArr, numRange);
        int[] user = genArray(lengthArr, numRange);

        //Sort and print arrays
        sortArray(org);
        printArray(org);
        System.out.println(" - Sorted array of organizer");
        sortArray(user);
        printArray(user);
        System.out.println(" - Sorted array of user");

        //Check and print results
        int score = checkWin(org, user);
        if (score > 0) {
            System.out.printf("Today you guessed %d numbers of %d\n", score, lengthArr);
        } else {
            System.out.printf("Sorry, but it's not your day today...\nYou guessed %d numbers...", score);
        }
        if (score == lengthArr) {
            System.out.print("That's cool!!!\nYou lucky today! ");
        }
    }

    private static int checkWin(int[] org, int[] user) {
        int score = 0;
        for (int i = 0; i < org.length; i++) {
            if (org[i] == user[i]) {
                score++;
            }
        }
        return score;
    }

    private static void printArray(int[] arr) {
        for (int cell : arr) {
            System.out.print(cell + "; ");
        }
    }

    private static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    private static int[] genArray(int length, int numRange) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(numRange + 1);
        }
        return arr;
    }
}
