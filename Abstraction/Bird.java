package Abstraction;

public abstract class Bird extends Animal implements canFLy{

    public Bird(String name){
        super(name);


    }

    @Override
    public void eat() {
        System.out.println(getname()+" pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getname()+" is breathing");
    }

    @Override
    public void fly() {
        System.out.println(getname()+" is flapping the wings");
    }
}
