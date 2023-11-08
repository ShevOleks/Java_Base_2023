package ua.vodafone.lesson9;

public class TrackerAccountsRunner {
    public static void main(String[] args) {
        TrackerAccounts firstUser = new TrackerAccounts("Anton", 1, 2, 1980, "anton@gmail.com", "+380112223344", "Antonenko", 95, "120/80", 5500);
        TrackerAccounts secondUser = new TrackerAccounts("Borys", 22, 8, 1979, "borys@gmail.com", "+380223334455", "Borysov", 80, "125/85", 3300);
        TrackerAccounts thirdUser = new TrackerAccounts("Hanna", 8, 12, 1999, "hanna@gmail.com", "+380334445566", "Hydra", 65, "125/85", 15000);
        System.out.println("\nNew users account info:");
        firstUser.printAccountInfo();
        System.out.println();
        secondUser.printAccountInfo();
        System.out.println();
        thirdUser.printAccountInfo();

        firstUser.setSteps(10000);
        firstUser.setWeight(85.5F);
        secondUser.setSteps(8000);
        secondUser.setPressure("160/95");

        System.out.println("\nUpdated users account info:");
        firstUser.printAccountInfo();
        System.out.println();
        secondUser.printAccountInfo();
        System.out.println();
        thirdUser.printAccountInfo();

    }
}
