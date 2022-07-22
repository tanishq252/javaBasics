package Abstraction;

public class Penguin extends Bird{
    public Penguin(String name){
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("But the prnguins prefer to catch fishes");
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I can swim u dumbass :p");
    }
}
