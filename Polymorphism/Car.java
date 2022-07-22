package Polymorphism;

public class Car {
    private int cylinders;
    private int wheels;
    private boolean engine;
    private String name;

    public Car(int cylinders,String name){
        this.name =name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;

    }

    public String startEngine(){
        return("Car -> startEngine()");
    }

    public String accelerate(){
        return("Car -> accelerate()");
    }

    public String brake(){
        return("Car -> brake()");
    }

    public String getName(){
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


}
