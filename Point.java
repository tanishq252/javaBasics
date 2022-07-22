public class Point {

    private int y;
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


   public Point(){

   }

   public Point(int x,int y){
       this.x = x;
       this.y =y;

   }

   public double distance(Point p){
       return (Math.sqrt(((this.x - p.x)*(this.x - p.x))+((this.y - p.y)*(this.y - p.y))));
   }

   public double distance(int x1, int y1){
       return (Math.sqrt(((x-x1)*(x-x1))+(y-y1)*(y-y1)));
   }

   public double distance(){
       return (Math.sqrt((x*x)+(y*y)));
   }

   public static void main(String[] args){
        Point f = new Point(6,5);
        Point s = new Point(3,1);
       System.out.println(f.distance());
       System.out.println(f.distance(s));
       System.out.println(f.distance(2,2));
//       System.out.println(6*);
   }
}
