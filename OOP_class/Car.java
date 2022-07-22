package OOP_class;

////this is how we create an abstract class
//abstract class Car {
//    //this is how we create an abstract method
//    abstract void stop();
//    abstract String getModelNumber();
//}
//
//class Tata extends Car{
//    void stop(){
//        System.out.println("Car has been stopped");
//    }
//
//    String getModelNumber(){
//        return "XZ+DT12";
//    }
//
//    public static void main(String[] args) {
//        Tata newCar = new Tata();
//        newCar.stop();
//        System.out.println(newCar.getModelNumber());
//    }
//}

//this is how we create an interface
interface mother{
    void cooking();
}

interface father{
    void driving();
}

//class child will inherit properties from multiple interfaces
//this is how we perform multiple inheritance in java
class child implements  mother,father{
    public void cooking(){
        System.out.println("Inherited cooking from mother");
    }

    public void driving(){
        System.out.println("Inherited driving from father");
    }

    public static void main(String[] args) {
        child son = new child();
        son.cooking();
        son.driving();
    }
}

