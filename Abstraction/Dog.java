package Abstraction;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getname()+" eating");
    }

    @Override
    public void breathe() {
        System.out.println(getname()+" is breathing");

    }
}
