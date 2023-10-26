package ua.vodafone.lesson6_7;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        int ticketLength = 7;
        int numbersRange = 9;
        int[] organizerTicket = generateTicket(ticketLength, numbersRange);
        printArray(organizerTicket);
        System.out.println(" - Initial array of organizer");
        int[] userTicket = generateTicket(ticketLength, numbersRange);
        printArray(userTicket);
        System.out.println(" - Initial array of user");

        System.out.println();
        sortArray(organizerTicket);
        printArray(organizerTicket);
        System.out.println(" - Sorted array of organizer");
        sortArray(userTicket);
        printArray(userTicket);
        System.out.println(" - Sorted array of user");

        System.out.println();
        int score = checkWin(organizerTicket, userTicket);
        if (score > 0) {
            System.out.printf("Today you guessed %d numbers of %d\n", score, ticketLength);
        } else {
            System.out.printf("Sorry, but it's not your day today...\nYou guessed %d numbers...", score);
        }
        if (score == ticketLength) {
            System.out.print("That's cool!!!\nYou lucky today! ");
        }
    }

    private static int checkWin(int[] organizerTicket, int[] userTicket) {
        int score = 0;
        for (int i = 0; i < organizerTicket.length; i++) {
            if (organizerTicket[i] == userTicket[i]) {
                score++;
            }
        }
        return score;
    }

    private static void printArray(int[] array) {
        for (int cell : array) {
            System.out.print(cell + "; ");
        }
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    private static int[] generateTicket(int length, int numbersRange) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(numbersRange + 1);
        }
        return array;
    }
}
