package Inheritance;

public class Dog extends Animal {
// just click on resolve problem or generate -> constructor

//    in inherited classes we can always create new features or variables

    private int eyes;
    private int legs;
    private String breed;


//    the below one is a parameterized constructor
    public Dog(int size, int weight, String name, int eyes, int legs, String breed) {
        // super means we are taking those features from the base class
        super(1,1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.breed = breed;

    }

//    override means we are taking that from the base or main class
//    @Override
//    public void eat() {
//        System.out.println("Dog.eat() called");
//        chew();
//        super.eat(); // this calls the Animal.eat()
//    }

    public void chew(){
        System.out.println("Dog.chew() called");

    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(4);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void movelegs(int speed){
        System.out.println("Dog.movelegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        movelegs(speed);
        super.move(speed);
    }
}
