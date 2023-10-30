package ua.vodafone.lesson11;

import java.util.Scanner;

public class ConverterDemo {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please, enter initial Fahrenheit temperature: ");
        CelsiusFahrenheitConvert celsiusFahrenheit = new CelsiusFahrenheitConvert();
        System.out.printf("Converted to Celsius = %.1f °C\n", celsiusFahrenheit.toCelsius(getValue()));
        System.out.print("Please, enter initial Celsius temperature: ");
        System.out.printf("Converted to Fahrenheit = %.1f °F\n", celsiusFahrenheit.fromCelsius(getValue()));

        System.out.print("Please, enter initial Kelvin temperature: ");
        CelsiusKelvinConverter celsiusKelvin = new CelsiusKelvinConverter();
        System.out.printf("Converted to Celsius = %.1f °C\n", celsiusKelvin.toCelsius(getValue()));
        System.out.print("Please, enter initial Celsius temperature: ");
        System.out.printf("Converted to Kelvin = %.1f °K\n", celsiusKelvin.fromCelsius(getValue()));

    }

    private static float getValue() {
        while (!SCANNER.hasNextFloat()) {
            SCANNER.next();
            System.out.println("Please, enter decimal number though ',' delimiter");
        }
        return SCANNER.nextFloat();
    }
}
