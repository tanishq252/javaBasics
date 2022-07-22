package OOP_class;


import java.util.Scanner;

public class oopLab1 {
    static Scanner sc  = new Scanner(System.in);
    static int roll_number ;
    static int rollNo;
    String CollegeName;
    String Name;
    static String CollegName;

    static{
        CollegName = "VIT";
        roll_number=1;
    }

    public oopLab1(String Name){
        this.Name = Name;
        this.CollegeName = CollegName;
        this.rollNo = roll_number++;
    }

    public int getRoll_number() {
        return rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }

    public void printDetails(){
        System.out.println("Name : "+this.getName()+"\nCollegeName : "+this.getCollegeName()+"\nRoll Number : "+ this.getRoll_number()+"\n");

    }

    public static void main(String[] args){
        oopLab1 Student1 = new oopLab1("Tanishq");
        oopLab1 Student2 = new oopLab1("Tejas");
        oopLab1 Student3 = new oopLab1("Atharva");

//        Student2.printDetails(S);

        Student2.printDetails();
        Student3.printDetails();
        Student1.printDetails();
    }
}
