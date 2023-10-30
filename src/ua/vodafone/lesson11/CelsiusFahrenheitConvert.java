package ua.vodafone.lesson11;

public class CelsiusFahrenheitConvert extends Converter {
    private static final float TO_FAHRENHEIT_MULTIPLIER = 1.8F;
    private static final int TO_FAHRENHEIT_INDEX = 32;

    public CelsiusFahrenheitConvert(float temperature) {
        super(temperature);
    }

    @Override
    float fromCelsius() {
        return getTemperature() * TO_FAHRENHEIT_MULTIPLIER + TO_FAHRENHEIT_INDEX;
    }

    @Override
    float toCelsius() {
        return (getTemperature() - TO_FAHRENHEIT_INDEX) / TO_FAHRENHEIT_MULTIPLIER;
    }
}
