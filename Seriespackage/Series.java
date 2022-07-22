package Seriespackage;

import java.util.Scanner;

public class Series {

    public static Scanner sc=  new Scanner(System.in);

    public static void nSum(int n){
        int s=0;
        for(int i=0;i<=n;i++){
            s+=i;
            System.out.print(s+" ");
        }
        System.out.println();
    }
    public static void nFactorial(int n){
        int s=1;

        for(int i=1;i<=n;i++){
            s*=i;
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void nFibonacci(int n){
        for (int i=0;i<n;i++){
            int x = fib(i);
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static int fib(int n){
        if(n==0 || n==1 ){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }


}
