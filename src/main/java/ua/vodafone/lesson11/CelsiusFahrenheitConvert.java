package ua.vodafone.lesson11;

public class CelsiusFahrenheitConvert extends Converter {
    private static final float MULTIPLIER = 1.8F;
    private static final int CONSTANT = 32;

    @Override
    public float fromCelsius(float temperature) {
        return temperature * MULTIPLIER + CONSTANT;
    }

    @Override
    public float toCelsius(float temperature) {
        return (temperature - CONSTANT) / MULTIPLIER;
    }
}
