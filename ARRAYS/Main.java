package ARRAYS;

import java.util.Scanner;

// we are supposed to initialize array like:
// int[] array = new int[number_of_elements]

public class Main {
    public static void main(String[] args){
        // defining an array
        int[] my_array = new int[10];
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of array you want : ");
        boolean isNextInt = sc.hasNextInt();
        if (isNextInt){
            n = sc.nextInt();
            System.out.println("Enter the elements in the array : ");
            for(int i=0;i<n;i++){
                boolean isNextIntInt = sc.hasNextInt();
                if(isNextIntInt){
                    int x = sc.nextInt();
                    my_array[i] = x;
                }
                else {
                    System.out.println("Incorrect input vro");
                    return;
                }
            }
        }
        else {
            System.out.println("Error!! Incorrect input");
            return;
        }

        printArray(my_array,n);

    }

    public static void printArray(int[] my_array,int n){
        System.out.println("The array looks like :");
        for (int i=0;i<n;i++){
            System.out.print(my_array[i]+" ");
        }
    }
}
