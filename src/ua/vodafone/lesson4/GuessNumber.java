package ua.vodafone.lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//      Number generation
        int randomInt = ThreadLocalRandom.current().nextInt(11);

        //      How many attempts will be
        System.out.print("I guessed a number from 0 to 10.\nHow many attempts do you need to guess it (need minimum 3)? : ");
        int attemptsNumber = SCANNER.nextInt();
        SCANNER.nextLine();

        //      Do attempts
        if (attemptsNumber > 2) {
            System.out.println("Ok, let's try...");
        } else {
            System.out.println("The number of attempts must be minimum 3. Goodbye.");
            attemptsNumber = 0;
        }
        for (int i = 0; i < attemptsNumber; i++) {
            System.out.print("Please, enter your number: ");
            int userNumber = SCANNER.nextInt();
            if (userNumber == randomInt) {
                System.out.println("My congratulations, you did it!!!\nThe number is: " + randomInt);
                break;
            } else if (i == attemptsNumber - 1) {
                System.out.println("Sorry, but you didn't guess...\nAll attempts used. Goodbye!");
            } else {
                System.out.println("Sorry, but you didn't guess " + (i+1) + " attempt, try another one.");
            }
        }

    }
}
