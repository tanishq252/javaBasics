import java.util.Scanner;


public class tp {

    public static void odd(int m){
        if(m%2==0){
            System.out.println(m + " is even");
        }
        else {
            System.out.println(m + " is odd");
        }

    }

    public static void main(String [] args){



//        for (int i=0;i<5;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i=1;i<=10;i++){
//            System.out.println("5 x "+i+" = "+(5*i));
//        }

//        for (int i=0;i<5;i++){
//            for (int j=0;j<(i);j++){
//                System.out.print(" ");
//            }
//
//            for (int j=0;j<(5-i);j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = (a>b && a>c)? a: (b>c)? b:c;
        System.out.println(x+" is largest");

        System.out.println("Average = "+(a+b+c)/3);

        odd(a);

    }


}
