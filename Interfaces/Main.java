package Interfaces;

public class Main {
    public static void main(String[] args){
        // initialize an interface
        ITelephone timsPhone;
        timsPhone = new DeskPhone(213423432);

        timsPhone.powerOn();
        timsPhone.callPhone(213423432);
        timsPhone.answer();


        timsPhone = new MobilePhone(1234);

        // this is power of interface over simple classes that same object name for 2 different classes
        timsPhone.powerOn();
        timsPhone.callPhone(1234);
        timsPhone.answer();
    }
}
