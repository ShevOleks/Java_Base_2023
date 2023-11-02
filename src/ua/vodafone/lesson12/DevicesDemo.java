package ua.vodafone.lesson12;

public class DevicesDemo {
    static String msisdn = "+380991112233";
    static String say = "Hello somebody!\nHave a nice day!";
    static String message = "Please, check you balance by USSD request *101#";
    static String protocol = "HTTPS";
    static String url = "google.com.ua";
    static String programName = "Gallery";
    static String bug = "Just system halt when accessing memory at #A12B32C9 address...";

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
                ((Androids) device).startProgram(programName);
                ((Androids) device).reportBug(bug);
            } else {
                generalMethods(device);
                ((IPhones) device).startProgram(programName);
                ((IPhones) device).reportBug(bug);
            }
            System.out.println("===============================");
        }

    }

    private static void generalMethods(Smartphones device) {
        device.call(msisdn, say);
        device.sms(msisdn, message);
        device.internet(protocol, url);
    }

}
