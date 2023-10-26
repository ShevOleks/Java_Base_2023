package ua.vodafone.lesson9;

public class Burgers {
    private String bun;
    private String meat;
    private String cheese;
    private String salad;
    private String mayonnaise;

    public Burgers(String bun, String meat, String cheese, String salad, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        System.out.println("\nThis is a regular burger with:");
        printList();
    }

    public Burgers(String bun, String meat, String cheese, String salad) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        System.out.println("\nThis is a diet burger with:");
        printList();
    }

    public Burgers(String bun, String meat, String cheese, String salad, String mayonnaise, int meatPortion) {
        this.bun = bun;
        this.meat = meatPortion + " x " + meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        System.out.println("\nThis is a meat burger with:");
        printList();
    }

    private void printList() {
        printItem(bun);
        printItem(meat);
        printItem(cheese);
        printItem(salad);
        printItem(mayonnaise);
    }

    private static void printItem(String item) {
        if (item == null) {
            return;
        }
        System.out.println("- " + item);
    }
}
