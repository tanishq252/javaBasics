package ARRAYS;

import java.util.Scanner;

class Flower{
    String whatsYourName(){
        return "I have many names and types";
    }
}

class Jasmine extends Flower{
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Region{
    Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region{
    Jasmine yourNationalFlower(){
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    Lily yourNationalFlower(){
        return new Lily();
    }
}

public class f {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            int a=sc.nextInt();
            int b = sc.nextInt();
            System.out.println((a/b));
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}
