package ua.vodafone.lesson6_7;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        // Making arrays
        int ticketLength = 7;
        int numbersRange = 9;
        int[] org = generateTicket(ticketLength, numbersRange);
        printArray(org);
        System.out.println(" - Initial array of organizer");
        int[] user = generateTicket(ticketLength, numbersRange);
        printArray(user);
        System.out.println(" - Initial array of user");

        //Sort and print arrays
        System.out.println();
        sortArray(org);
        printArray(org);
        System.out.println(" - Sorted array of organizer");
        sortArray(user);
        printArray(user);
        System.out.println(" - Sorted array of user");

        //Check and print results
        System.out.println();
        int score = checkWin(org, user);
        if (score > 0) {
            System.out.printf("Today you guessed %d numbers of %d\n", score, ticketLength);
        } else {
            System.out.printf("Sorry, but it's not your day today...\nYou guessed %d numbers...", score);
        }
        if (score == ticketLength) {
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

    private static int[] generateTicket(int length, int numbersRange) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(numbersRange + 1);
        }
        return array;
    }
}
