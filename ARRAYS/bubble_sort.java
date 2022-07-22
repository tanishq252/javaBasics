package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

//classic bubble sort

public class bubble_sort {
    private static Scanner sc =  new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] myArray = getArray(n);
        int[] sortedArray = sortArray(myArray);
        printArray(sortedArray);
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static int[] getArray(int n){
        System.out.println("Enter the elements you want to sort :");
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            int x = sc.nextInt();
            array[i] = x;
        }
        return array;
    }

    public static int[] sortArray(int[] arr){
        int[] sortedArr = Arrays.copyOf(arr,arr.length); // to copy array
        int temp;
        for(int j=0;j<arr.length-1;j++)
            for (int i=0;i<arr.length-j-1;i++){
                if (sortedArr[i]<sortedArr[i+1]){
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] =temp;
                }
        }
        return sortedArr;
    }
}
