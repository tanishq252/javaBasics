
//here we will be initializing variables for car
//created some variables which are public

public class Car {
//    some variables
    public int cost;
    public String colour;
    public String engine;
    public String model;

//    functions

//    this one to just set the model of the car
    public void setModel(String model){
        // remember if name of variable and argument same as it is here then we use "this." as it is used here
        this.model = model;
    }

//    this to print all the details of the object
    public void print_Info(){
        System.out.println("******CAR_INFO******");
        System.out.println("Colour of Car is "+colour);
        System.out.println("Car costs "+ cost);
        System.out.println("It is "+model+" Model");
        System.out.println("Engine type is "+engine);
        System.out.println();
    }
}
