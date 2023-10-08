package ua.vodafone.lesson5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RugbyCommands {
    public static void main(String[] args) {
        //Enter numbers of players and their age
        int teamsCount = 2;
        int players = 25;
        int minAge = 18;
        int maxAge = 40;
        //Check conditions for calculation
        if (teamsCount <= 0 || players <= 0 || minAge < 0 || maxAge <= 0) {
            System.out.println("Wrong data!\nCheck your initial variables.");
            return;
        } else {
            System.out.println("\nThe age of players for each team are:");
        }
        //Make teams and print results
        for (int i = 1; i <= teamsCount; i++) {
            int[] team = teamBuild(players, minAge, maxAge);
            printResults(team, i);
        }
    }

    private static void printResults(int[] teamPrint, int index) {
        System.out.printf("Team #%d consists of such players age: ", index);
        for (int age : teamPrint) {
            System.out.print(age + "; ");
        }
        System.out.println();
        System.out.printf("Average age for team #%d is: %.1f years old.\n", index, averageAge(teamPrint));
    }

    private static float averageAge(int[] team) {
        return Arrays.stream(team).sum() / (float) team.length;
    }

    private static int[] teamBuild(int players, int minAge, int maxAge) {
        int[] teamBuild = new int[players];
        for (int i = 0; i < teamBuild.length; i++) {
            teamBuild[i] = ThreadLocalRandom.current().nextInt(minAge, maxAge + 1);
        }
        return teamBuild;
    }

}
