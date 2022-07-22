package Inheritance;

public class Fish extends Animal{
    private int fins;
    private int gills;

    public Fish( int size, int weight, String name,int gills, int fins) {
        super(1,1, size, weight, name);
    }

    public void swims(int speed){
        System.out.println("Fish.swims() called. Fish swims at speed of "+ speed);
    }

    public void swallows(){
        System.out.println("Fish.swallows() called. Fish swallows worms");
    }

    @Override
    public void move(int speed) {
        swims(speed);
        super.move(speed);
    }

//    @Override
//    public void eat() {
//        swallows();
//        super.eat();
//    }
}
