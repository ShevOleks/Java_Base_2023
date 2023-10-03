package ua.vodafone.lesson3;

public class StrikeForce {
    public static void main(String[] args) {
        //Li's Army
        int liInfantryForce = 13;
        int liBowmanForce = 24;
        int liRiderForce = 46;
        int liManCount = 860;
        int liStrikeForce = calculation(liInfantryForce, liBowmanForce, liRiderForce, liManCount);
        System.out.println("Strike force of Lee's army = " + liStrikeForce + " units");

        //Min's Army
        int minInfantryForce = 9;
        int minBowmanForce = 35;
        int minRiderForce = 12;
        int minManCount = (int) (1.5 * liManCount);
        int minStrikeForce = calculation(minInfantryForce, minBowmanForce, minRiderForce, minManCount);
        System.out.println("Strike force of Min's army = " + minStrikeForce + " units");
    }

    private static int calculation(int infantryForce, int bowmanForce, int riderForce, int manCount) {
        return manCount * (infantryForce + bowmanForce + riderForce);
    }
}