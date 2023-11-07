package ua.vodafone.lesson8;

public class PersonRunner {
    public static void main(String[] args) {
        Person first = new Person("Oleksandr", "Shevchenko", "Kyiv", "+380992296119");
        System.out.println(first.personInfo());
        Person second = new Person("Oleg", "Blokhin", "Kyiv", "+380662005050");
        System.out.println(second.personInfo());
        Person third = new Person("Zhanna", "Dark", "Domremi", "'3 knocks at door'");
        System.out.println(third.personInfo());
    }
}
