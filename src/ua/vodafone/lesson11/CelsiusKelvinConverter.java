package ua.vodafone.lesson11;

public class CelsiusKelvinConverter extends Converter {
    private static final float CELSIUS_NULL = 273.15F;

    public CelsiusKelvinConverter(float temperature) {
        super(temperature);
    }

    @Override
    float fromCelsius() {
        return getTemperature() + CELSIUS_NULL;
    }

    @Override
    float toCelsius() {
        return getTemperature() - CELSIUS_NULL;
    }
}
