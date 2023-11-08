package ua.vodafone.lesson3;

import java.util.Scanner;

public class CounterStrikeMatchResult3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // First team
        System.out.print("Please, enter name of terrorist team: ");
        String terroristTeam = SCANNER.nextLine();
        System.out.print("Please, enter number of frags for first player of " + terroristTeam + " team: ");
        int firstTerroristPlayer = SCANNER.nextInt();
        System.out.print("Please, enter number of frags for second player of " + terroristTeam + " team: ");
        int secondTerroristPlayer = SCANNER.nextInt();
        System.out.print("Please, enter number of frags for third player of " + terroristTeam + " team: ");
        int thirdTerroristPlayer = SCANNER.nextInt();
        System.out.print("Please, enter number of frags for fourth player of " + terroristTeam + " team: ");
        int fourthTerroristPlayer = SCANNER.nextInt();
        System.out.print("Please, enter number of frags for fifth player of " + terroristTeam + " team: ");
        int fifthTerroristPlayer = SCANNER.nextInt();
        SCANNER.nextLine();
        float terroristFrags = averageFrags(terroristTeam, firstTerroristPlayer, secondTerroristPlayer, thirdTerroristPlayer, fourthTerroristPlayer, fifthTerroristPlayer);
        System.out.println();

        // Second team
        System.out.print("Please, enter name of police team: ");
        String policeTeam = SCANNER.nextLine();
        System.out.print("Please, enter number of frags for first player of " + policeTeam + " team: ");
        int firstPolicePlayer = SCANNER.nextInt();
        System.out.print("Please, enter number of frags for second player of " + policeTeam + " team: ");
        int secondPolicePlayer = SCANNER.nextInt();
        System.out.print("Please, enter number of frags for third player of " + policeTeam + " team: ");
        int thirdPolicePlayer = SCANNER.nextInt();
        System.out.print("Please, enter number of frags for fourth player of " + policeTeam + " team: ");
        int fourthPolicePlayer = SCANNER.nextInt();
        System.out.print("Please, enter number of frags for fifth player of " + policeTeam + " team: ");
        int fifthPolicePlayer = SCANNER.nextInt();
        SCANNER.nextLine();
        float policeFrags = averageFrags(policeTeam, firstPolicePlayer, secondPolicePlayer, thirdPolicePlayer, fourthPolicePlayer, fifthPolicePlayer);
        System.out.println();

        // Winner detection with accuracy from variable eps
        float eps = 0.00000001F;
        if (Math.abs(terroristFrags - policeFrags) < eps) {
            System.out.println("There is dead heat. We have equal amount of frags - " + terroristFrags + " vs " + policeFrags);
        } else if (policeFrags > terroristFrags) {
            System.out.println("The winner is " + policeTeam + " team, with score " + policeFrags + " vs " + terroristFrags);
        } else {
            System.out.println("The winner is " + terroristTeam + " team, with score " + terroristFrags + " vs " + policeFrags);
        }
    }

    private static float averageFrags(String teamName, int first, int second, int third, int fourth, int fifth) {
        final int playersNumber = 5;
        float averageFrags = (float) (first + second + third + fourth + fifth) / playersNumber;
        System.out.println("Average number of frags for " + teamName + " team = " + averageFrags);
        return averageFrags;
    }
}
