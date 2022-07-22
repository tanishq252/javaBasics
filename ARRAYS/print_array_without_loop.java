package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class print_array_without_loop {

    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] myArray = new int[n];
        getArray(myArray);

        // print array with loop
        printArrayWithLoop(myArray);

        // print array without loop
        System.out.println("My array without loop is : "+ Arrays.toString(myArray));
    }

    public static void getArray(int[] array){
        System.out.println("Enter the elements for the array : ");
        for(int i=0;i<array.length;i++){
            int x=sc.nextInt();
            array[i] = x;
        }
    }

    public static void printArrayWithLoop(int[] arr){
        System.out.println("Array printed with loop: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
