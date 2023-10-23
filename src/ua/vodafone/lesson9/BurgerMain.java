package ua.vodafone.lesson9;

public class BurgerMain {
    public static void main(String[] args) {
        Burgers regularBurger = new Burgers("bun", "meat", "cheese", "salad", "mayonnaise");
        Burgers dietBurger = new Burgers("bun", "meat", "cheese", "salad");
        Burgers meatBurger = new Burgers("bun", "meat", 2, "cheese", "salad", "mayonnaise");
    }
}
