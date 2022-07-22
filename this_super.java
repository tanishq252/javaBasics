
public class this_super {
    public static void main(String[] args){

        Shape s = new Shape(2,3);
        System.out.println(s.x+" "+s.y);

        Rectangle r = new Rectangle(1,2,3,4);
        System.out.println(r.b+" "+r.h);
        System.out.println(r.get_x()+" "+r.get_y());

    }
}

class Shape{
    public int x,y;

    public Shape(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int get_x(){
        return x;
    }

    public int get_y(){
        return y;
    }

}

class Rectangle extends Shape{

    public int h,b;
    public Rectangle(int x,int y){
        this(x,y,0,0); // calls the second constructor
    }

    public Rectangle(int x,int y,int h,int b){
        super(x, y); //calls the parent constructor
        this.h = h;
        this.b = b;
    }
}