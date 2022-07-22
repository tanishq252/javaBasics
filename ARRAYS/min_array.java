package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class min_array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int n = readInteger();
        int[] myArray = readElements(n);
        int min = findMin(myArray);
        System.out.println("The min is : "+min);
        int[] reversedArray = reverse(myArray);
        System.out.println("The reversed array looks like : "+ Arrays.toString(reversedArray));
    }

    public static int readInteger(){
        System.out.println("Enter the size of array :");
        int x = sc.nextInt();
        return x;
    }

    public static int[] readElements(int n){
        System.out.println("Enter the elements :");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] reverse(int[] array){
        int[] reversed_array = new int[array.length];
        int counter =0;
        for (int i=array.length-1;i>=0;i--){
            reversed_array[counter] = array[i];
            counter++;
        }

        return reversed_array;
    }
}
