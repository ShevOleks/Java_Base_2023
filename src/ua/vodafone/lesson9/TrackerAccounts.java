package ua.vodafone.lesson9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TrackerAccounts {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phoneNumber;
    private String surname;
    private float weight;
    private String pressure;
    private int steps;
    private int age;

    public TrackerAccounts(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email,
                           String phoneNumber, String surname, float weight, String pressure, int steps) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        age = new GregorianCalendar().get(Calendar.YEAR) - yearOfBirth;
    }

    public void printAccountInfo() {
        System.out.printf("\nUser name is: %s %s", name, surname);
        System.out.printf("\nBirth date: %02d-%02d-%d", dayOfBirth, monthOfBirth, yearOfBirth);
        System.out.printf("\nAge is %d years old.", age);
        System.out.printf("\nEmail is: %s", email);
        System.out.printf("\nPhone number is: %s", phoneNumber);
        System.out.printf("\nWeight is: %.1f kg", weight);
        System.out.printf("\nBlood pressure is: %s", pressure);
        System.out.printf("\nNumber of steps is: %d", steps);
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public float getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
