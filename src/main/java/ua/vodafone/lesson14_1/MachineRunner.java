package ua.vodafone.lesson14_1;

public class MachineRunner {
    public static void main(String[] args) {
        System.out.print("Welcome!");
        MakingOrder order = new MakingOrder();
        DrinksMachine[] menuList = DrinksMachine.values();
        order.printPriceMenu(menuList);
        DrinksMachine[] newOrder = order.getOrder(menuList);
        if (newOrder == null) {
            System.out.print("Good luck!\nWaiting for you if you need some drinks.");
            return;
        }
        order.printOrder(newOrder);
        boolean result = Operations.orderProcessing(newOrder);
        if (result) {
            System.out.println("\nThanks for your order!\nGoodbye!");
            return;
        }
        System.out.println("Something went wrong......\nPlease, contact support for ask questions.");
    }
}
