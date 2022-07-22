package ARRAYS;

import java.util.Scanner;

public class practice1 {

    private static Scanner sc= new Scanner(System.in);

    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+number +" integer values for array.");
        int[] int_values = new int[number];
        for (int i=0;i<number;i++){
            int x = sc.nextInt();
            int_values[i] = x;
        }
        return int_values;
    }

    public static void printArray(int[] array){
        System.out.println("The array you wanted looks like :");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

}
