package ua.vodafone.lesson11;

public class CelsiusKelvinConverter extends Converter {
    private static final float CELSIUS_NULL = 273.15F;

    @Override
    public float fromCelsius(float temperature) {
        return temperature + CELSIUS_NULL;
    }

    @Override
    public float toCelsius(float temperature) {
        return temperature - CELSIUS_NULL;
    }
}
