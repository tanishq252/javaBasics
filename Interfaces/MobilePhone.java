package Interfaces;


public class  MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public  MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken as  MobilePhone has no power on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("PhNo : "+phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering Mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging = true;
            System.out.println("Dhinchak pooja : Mobile Phone");
        }
        else {
            isRinging = false;
            System.out.println("Phone is OFF");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
