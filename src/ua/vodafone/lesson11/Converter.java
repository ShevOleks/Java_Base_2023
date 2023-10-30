package ua.vodafone.lesson11;

public abstract class Converter {
    private float temperature;

    public Converter(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    abstract float fromCelsius();

    abstract float toCelsius();
}
