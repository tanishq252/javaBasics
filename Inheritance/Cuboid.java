package Inheritance;

public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double l, double w, double height) {
        super(l, w);
        if(height<0){
            this.height = 0;
        }
        else{
            this.height = height;
        }

    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return this.height*super.getArea();
    }
}
