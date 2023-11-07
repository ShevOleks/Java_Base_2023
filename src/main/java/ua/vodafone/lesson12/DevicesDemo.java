package ua.vodafone.lesson12;

public class DevicesDemo {
    private static final String PROGRAM_NAME = "Gallery";
    private static final String BUG = "Just system halt when accessing memory at #A12B32C9 address...";

    public static void main(String[] args) {
        Smartphones[] devices = {
                new Androids("Nexus", "N5"),
                new Androids("Motorola", "G4"),
                new IPhones("14S", "Pro"),
                new IPhones("15X", "Max")
        };
        for (Smartphones device : devices) {
            System.out.println(device);
            System.out.println("===============================");
            if (device.getClass() == Androids.class) {
                generalMethods(device);
                ((Androids) device).startProgram(PROGRAM_NAME);
                ((Androids) device).reportBug(BUG);
            } else {
                generalMethods(device);
                ((IPhones) device).startProgram(PROGRAM_NAME);
                ((IPhones) device).reportBug(BUG);
            }
            System.out.println("===============================");
        }

    }

    private static void generalMethods(Smartphones device) {
        String msisdn = "+380991112233";
        String say = "Hello somebody!\nHave a nice day!";
        String message = "Please, check you balance by USSD request *101#";
        String protocol = "HTTPS";
        String url = "google.com.ua";
        device.call(msisdn, say);
        device.sms(msisdn, message);
        device.internet(protocol, url);
    }

}
