package ua.vodafone.lesson12;

public class IPhones implements Smartphones, IOs {
    private final String model;
    private final String index;

    public IPhones(String model, String index) {
        this.model = model;
        this.index = index;
    }

    @Override
    public void startProgram(String name) {
        System.out.printf("To start program %s on iPhone %s %s just tap on it's icon.\n", name, this.model, this.index);
    }

    @Override
    public void reportBug(String bug) {
        System.out.printf("Hello Steve!\nWe have a some problem:\n%s\n", bug);
    }

    @Override
    public void call(String msisdn, String say) {
        System.out.printf("iPhone. Calling to number %s to say \"%s\"\n", msisdn, say);
    }

    @Override
    public void sms(String msisdn, String message) {
        System.out.printf("iPhone. Send sms to number %s with text \"%s\"\n", msisdn, message);
    }

    @Override
    public void internet(String protocol, String url) {
        System.out.printf("iPhone. It's need to use protocol %s when opening site %s\n", protocol, url);
    }

    @Override
    public String toString() {
        return "It's iPhone " + model + " " + index;
    }
}
