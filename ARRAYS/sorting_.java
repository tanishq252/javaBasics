package ARRAYS;
//this method is sorting without bubble sort
import java.util.Arrays;
import java.util.Scanner;

public class sorting_ {

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
        boolean flag = true; // we will assign a boolean true which will traverse us through the array
        while (flag){
            flag = false;
            for (int i=0;i<arr.length-1;i++){
                if (sortedArr[i]<sortedArr[i+1]){
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] =temp;
                    flag =true;
                }
            }
        }
        return sortedArr;
    }
    // what happens in above function is that it will sort the adjacent elements in one traversing and like this
    // it will keep on doing it and at last when there will be no condition that sorting is required the flag
    // will be false as it is after start of the loop and it will exit the loop and sorted array is returned
    // array will be descending order for this but changing single sign above can reverse it


}
