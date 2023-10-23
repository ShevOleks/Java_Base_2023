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

    public Burgers(String bun, String meat, int portion, String cheese, String salad, String mayonnaise) {
        this.bun = bun;
        this.meat = portion + " x " + meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        System.out.println("\nThis is a meat burger with:");
        printList();
    }

    private void printList() {
        String item = bun;
        printItem(item);
        item = meat;
        printItem(item);
        item = cheese;
        printItem(item);
        item = salad;
        printItem(item);
        item = mayonnaise;
        printItem(item);
    }

    private static void printItem(String item) {
        if (item == null) {
            return;
        }
        System.out.println("- " + item);
    }
}
