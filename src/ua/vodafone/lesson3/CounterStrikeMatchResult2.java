package ua.vodafone.lesson3;

import java.util.Scanner;

public class CounterStrikeMatchResult2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // First team
        System.out.print("Please, enter name of first team: ");
        String firstTeam = SCANNER.nextLine();
        int firstTeamFrags = fragsCalculation(firstTeam);
        System.out.println();

        // Second team
        System.out.print("Please, enter name of second team: ");
        String secondTeam = SCANNER.nextLine();
        int secondTeamFrags = fragsCalculation(secondTeam);
        System.out.println();

        // Winner detection
        if (firstTeamFrags > secondTeamFrags) {
            System.out.println("The winner is " + firstTeam + " team, with score " + firstTeamFrags + " vs " + secondTeamFrags);
        } else if (secondTeamFrags > firstTeamFrags) {
            System.out.println("The winner is " + secondTeam + " team, with score " + secondTeamFrags + " vs " + firstTeamFrags);
        } else {
            System.out.println("There is dead heat. We have equal amount of frags - " + firstTeamFrags + " vs " + secondTeamFrags);
        }
    }

    private static int fragsCalculation(String teamName) {
        final int numberOfPlayers = 5;
        int sumOfFrags = 0;
        System.out.print("Please, enter number of frags for first player of " + teamName + " team: ");
        sumOfFrags += SCANNER.nextInt();
        System.out.print("Please, enter number of frags for second player of " + teamName + " team: ");
        sumOfFrags += SCANNER.nextInt();
        System.out.print("Please, enter number of frags for third player of " + teamName + " team: ");
        sumOfFrags += SCANNER.nextInt();
        System.out.print("Please, enter number of frags for fourth player of " + teamName + " team: ");
        sumOfFrags += SCANNER.nextInt();
        System.out.print("Please, enter number of frags for fifth player of " + teamName + " team: ");
        sumOfFrags += SCANNER.nextInt();
        String tmp = SCANNER.nextLine();
        System.out.println("Average number of frags for " + teamName + " team = " + ((float) sumOfFrags / numberOfPlayers));
        return sumOfFrags;
    }
}
