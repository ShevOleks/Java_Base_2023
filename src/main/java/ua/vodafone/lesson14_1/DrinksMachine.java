package ua.vodafone.lesson14_1;

public enum DrinksMachine {
    COFFEE("Natural coffee", Drinks.COFFEE),
    TEA("Black tea", Drinks.TEA),
    LEMONADE("Lemonade", Drinks.LEMONADE),
    MOJITO("Mojito", Drinks.MOJITO),
    MINERAL_WATER("Mineral water", Drinks.MINERAL_WATER),
    COCA_COLA("Coca cola", Drinks.COCA_COLA);
    private final String name;
    private final double price;

    DrinksMachine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
