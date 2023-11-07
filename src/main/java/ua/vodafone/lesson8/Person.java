package ua.vodafone.lesson8;

public class Person {
    private String name;
    private String surname;
    private String city;
    private String phoneNumber;

    public Person(String name, String surname, String city, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String personInfo() {
        return "You may call to " + name + " " + surname + " from the city " + city + " by the number " + phoneNumber + ".";
    }
}
