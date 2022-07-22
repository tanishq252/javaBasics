package OOP_class;

public class Participant {
    static int counter ;
    String registrationID ;
    String name;
    long contactNumber;
    String branch;

    static {
        counter=1001;
    }

    public Participant(String name, long contactNumber, String branch) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.branch = branch;
        this.registrationID = "D" + counter;
        Participant.counter++;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void printDetails(){
        System.out.println("Hi "+getName()+"! Your registration id is "+getRegistrationID());
    }

    public static void main(String[] args){
        Participant p1 = new Participant("Rohit", 1234567889, "Computer");
        p1.printDetails();
        Participant p2 = new Participant("Sayli", 1988612300, "Mechanical");
        p2.printDetails();
    }
}
