package ua.vodafone.lesson14_1;

import java.util.Scanner;

public class MakingOrder {
    private static double totalPrice;
    private static int totalDrinks;
    private static final Scanner SCANNER = new Scanner(System.in);

    public void printPriceMenu(DrinksMachine[] menuList) {
        System.out.print("\nOur today menu with prices is:\n=============================");
        for (DrinksMachine item : menuList) {
            System.out.printf("\n%d %s --- %.2f", item.ordinal(), item, item.getPrice());
        }
    }

    public DrinksMachine[] getOrder(DrinksMachine[] menuList) {
        DrinksMachine[] newOrder = new DrinksMachine[menuList.length];
        Integer choice;
        System.out.print("\nEnter a number of drink or 'C' to cancel order");
        for (int i = 0; i < newOrder.length; i++) {
            do {
                System.out.print("\nPlease, make your choice: ");
                choice = getValue();
                if (choice == null) {
                    System.out.println("Do you want to cancel order (Y/N)?");
                    String answer = SCANNER.next();
                    if ("y".equalsIgnoreCase(answer)) {
                        return null;
                    }
                } else if (choice >= menuList.length || choice < 0) {
                    System.out.println("Your choice is incorrect, please enter existing number");
                }
            } while (choice == null || choice >= menuList.length || choice < 0);
            newOrder[i] = menuList[choice];
            System.out.print("Do you want something else (Y/N)?");
            String answer = SCANNER.next();
            if ("n".equalsIgnoreCase(answer)) {
                break;
            } else if (i == newOrder.length - 1) {
                System.out.println("The order has maximum items.\nIf you want something else, please make another order.");
            }
        }
        return newOrder;
    }

    private static Integer getValue() {
        while (!SCANNER.hasNextInt()) {
            String input = SCANNER.next();
            if ("c".equalsIgnoreCase(input)) {
                return null;
            }
            System.out.println("Please, enter number of desired item or 'C' to cancel.");
        }
        return SCANNER.nextInt();
    }

    public void printOrder(DrinksMachine[] order) {
        if (order == null) {
            System.out.print("You have no order yet. Please make your order first.");
            return;
        }
        System.out.print("Your current order is:");
        for (DrinksMachine item : order) {
            if (item == null) {
                break;
            }
            totalDrinks++;
            totalPrice += item.getPrice();
            System.out.printf("\n- %s", item);
        }
        System.out.printf("\nTotally %d drinks and amount %.2f of money\n", totalDrinks, totalPrice);
    }
}
