package Interfaces;

public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken as deskphone has no power on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("PhNo : "+phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging = true;
            System.out.println("Tring.... Tring....");
        }
        else {
            isRinging = false;
            System.out.println("Cell phone off :p");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
