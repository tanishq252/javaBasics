package Abstraction;

//class Fun {
//    public int var1 = 20;
//    public int var2 = 40;
//    Fun(int v1, int v2) {
//        var1 = v1;
//        var2 = v2;
//    }
//}
//public class Main{
//    public static void main(String args[]) {
//        Fun demo = new Fun();
//        System.out.println(demo.var1);
//        System.out.println(demo.var2);
//    }
//}

//class Address {
//    String cityName = "pune";
//
//    String stateName = "Maharashtra";
//
//}
//    public class Person implements Cloneable
//    {
//        Address addr = new Address();
//
//        int sid=101;
//
//        String sName="John";
//
//        int sAge=20;
//
//        public static void main(String[] args) throws CloneNotSupportedException {
//
//            Person sl = new Person();
//
//            Person s2 = (Person) sl.clone();
//
//        }}
//class tr{
//    int i;
//}
//public class Person
//{
//    public static void main(String[] args)
//    {
//        final int i;int j;
//        i=200;j=100;
//        System.out.println(i+ " " +j);
////        String s = new String("welcome") ;
////        String s1 = new String("Welcome");
////        System.out.println(s.equals(s1));
////        System.out.println(s.replace('e','@'));
//    }
//}

//public class Sample
//{
//    private static Sample s= null;
//    private Sample()
//    {
//    }
//    public static Sample get()
//    {
//        if(s==null)
//        {
//            s=new Sample();
//        }
//        return s;
//    }
//    public static void main(String[] args)
//    {
//        Sample sl= Sample.get();
//        System.out.println(sl.hashCode());
//        Sample s2= Sample.get();
//        System.out.println(s2.hashCode());
//    }
//}

//public class Sample{
//    public static void main(String[] args) {
//        Demol demol = new Demol();
//        System.out.println(demol.num);
//    }
//}
//class Demol {
//    final int num = 100;
//
//    public void setNum(String num) {
//        this.num = 50;
//    }
//}

//class Super {
//    public void display() {
//        System.out.println("super display Method Called");
//    }
//}
//    class Sub extends Super{
//        public void display() {
//            System.out.println("sub display Method Called");
//        }
//    }
//    public class Main {
//        public static void main(String[] args) {
//            Super s = new Sub();
//            s.display();
//        }
//    }
//

class Test{
    int vb=2;int vbb=1;
    Test(int v1,int v2){
        vb=v1;vbb=v2;
    }
}
public class Main{
//        void mymethod() {
//            System.out.println("Derived class method ");
//        }
        public static void main(String[] args) {
//            public static void main(String[] args) {
                int[][] arr = new int[2][3];
                int count=0;
                for (int i=0;i<arr.length;i++)
                    for (int j=0;j<arr[i].length;j++)
                        arr[i][j]=++count;
                for(int a[]:arr) {
                    for (int b : a)
                        System.out.print(b + " ");
                    System.out.println();
                }
//                }

            }
}

