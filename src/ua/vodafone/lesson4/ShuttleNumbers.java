package ua.vodafone.lesson4;

import java.util.Scanner;

public class ShuttleNumbers {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //Getting quantity of shuttles
        System.out.print("Please, enter quantity of shuttles: ");
        int shuttlesQuantity = SCANNER.nextInt();
        //Method for finding and saving lucky numbers
        int[] luckyNumbers = lucNums(shuttlesQuantity);
        //Method for printing lucky numbers
        printNumbers(luckyNumbers);
    }

    private static int[] lucNums(int shuttlesQuantity) {
        //Creating array with selected quantity of shuttles
        int[] luckyNumbers = new int[shuttlesQuantity];
        //Found lucky numbers without 4 and 9, and save it to array
        int count = 1;
        String tmp;
        for (int i = 0; i < luckyNumbers.length; i++) {
            tmp = String.valueOf(count);
            while (tmp.contains("4") || tmp.contains("9")) {
                count++;
                tmp = String.valueOf(count);
            }
            luckyNumbers[i] = count;
            count++;
        }
        return luckyNumbers;
    }

    private static void printNumbers(int[] luckyNumbers) {
        //Print list of lucky numbers
        System.out.println("The list of lucky numbers are:");
        for (int number : luckyNumbers) {
            System.out.println(number);
        }
    }

}
