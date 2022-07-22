package OOP_class;

import java.util.Scanner;


public class Shape {
    double a;
    double b;
    double r;
    double ss;
    final double pi = 3.14;

    static Scanner sc = new Scanner(System.in);

    void getInputs(){
        System.out.println("Enter values such that first input is base of Triangle and second is height of triangle");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Enter the Radius of Circle");
        r = sc.nextDouble();
        System.out.println("Enter length of side");
        ss = sc.nextDouble();

    }

    void setArea(Square s){
        s.area = ss*ss;
    }

    void setArea(Triangle t){
        t.area = 0.5*a*b;
    }

    void setArea(Circle c){
        c.area = pi*r*r;
    }

    double getArea(){
        System.out.println("You are in parent class");
        return 0;
    }


}
