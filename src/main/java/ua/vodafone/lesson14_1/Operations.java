package ua.vodafone.lesson14_1;

import java.util.Scanner;

public class Operations {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static boolean orderProcessing(DrinksMachine[] order) {
        if (paymentCheck()) {
            System.out.println("Your payment successful. Please wait for your drinks...");
        } else {
            System.out.println("Check your payment, please...");
            return false;
        }
        for (DrinksMachine item : order) {
            if (item == null) {
                break;
            }
            switch (item) {
                case COFFEE:
                    coffeeMaker();
                    break;
                case TEA:
                    teaMaker();
                    break;
                case LEMONADE:
                    lemonadeMaker();
                    break;
                case MOJITO:
                    mojitoMaker();
                    break;
                case COCA_COLA:
                    cocaColaMaker();
                    break;
                case MINERAL_WATER:
                    mineralWaterMaker();
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private static void mineralWaterMaker() {
        System.out.printf("\nYour %s is ready. Please take it.", DrinksMachine.MINERAL_WATER.getName());
    }

    private static void cocaColaMaker() {
        System.out.printf("\nYour %s is ready. Please take it.", DrinksMachine.COCA_COLA.getName());
    }

    private static void mojitoMaker() {
        System.out.printf("\nYour %s is ready. Please take it.", DrinksMachine.MOJITO.getName());
    }

    private static void lemonadeMaker() {
        System.out.printf("\nYour %s is ready. Please take it.", DrinksMachine.LEMONADE.getName());
    }

    private static void teaMaker() {
        System.out.printf("\nYour %s is ready. Please take it.", DrinksMachine.TEA.getName());
    }

    private static void coffeeMaker() {
        System.out.printf("\nYour %s is ready. Please take it.", DrinksMachine.COFFEE.getName());
    }

    private static boolean paymentCheck() {
        System.out.println("Please check your order and make payment if everything OK.");
        System.out.println("Did the payment successful (Y/N)?");
        return "y".equalsIgnoreCase(SCANNER.next());
    }
}
