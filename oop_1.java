// we will be taking car from Car.java

import java.util.Scanner;

public class oop_1 {
    public static void main(String[] args){

//        creating first object porsche
        Car porsche = new Car();
        porsche.colour = "Black";
        porsche.cost = 1200000;
        porsche.engine = "HP 3000";
//        porsche.setModel("Basic");
        System.out.println("Enter the model name for Porsche");
        Scanner sc = new Scanner(System.in);
        String model_name = sc.nextLine();
        porsche.setModel(model_name);
        porsche.print_Info();

//        creating second object nexon
        Car Nexon = new Car();
        Nexon.engine = "HP 1500";
        Nexon.cost = 1000000;
        Nexon.colour = "Red";
        Nexon.setModel("Top");
        Nexon.print_Info();

        sc.close();
    }
}
