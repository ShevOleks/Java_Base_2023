package ua.vodafone.lesson12;

public interface Smartphones {
    void call(String msisdn, String say);

    void sms(String msisdn, String message);

    void internet(String protocol, String url);
}
