package ua.vodafone.lesson12;

public class Androids implements Smartphones, LinuxOs {
    private final String brand;
    private final String model;

    public Androids(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void startProgram(String name) {
        System.out.printf("To start program %s on Android %s %s just tap on it's icon.\n", name, this.brand, this.model);
    }

    @Override
    public void reportBug(String bug) {
        System.out.printf("Hello Linus!\nWe have a some problem:\n%s\n", bug);
    }

    @Override
    public void call(String msisdn, String say) {
        System.out.printf("Android. Calling to number %s to say \"%s\"\n", msisdn, say);
    }

    @Override
    public void sms(String msisdn, String message) {
        System.out.printf("Android. Send sms to number %s with text \"%s\"\n", msisdn, message);
    }

    @Override
    public void internet(String protocol, String url) {
        System.out.printf("Android. It's need to use protocol %s when opening site %s\n", protocol, url);
    }

    @Override
    public String toString() {
        return "It's Android " + brand + " " + model;
    }
}
