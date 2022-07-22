package OOP_class;

import java.util.Scanner;

public class Adder {
    static Scanner sc = new Scanner(System.in);
    int[] array;
    static int targetSum;

    Adder(int size){
        this.array = new int[size];
        targetSum = 0;
    }

    void getData(){
        for(int i=0;i<this.array.length;i++){
            this.array[i] = sc.nextInt();
        }
        System.out.println("Enter targetSum :");
        targetSum = sc.nextInt();
    }

    public static int[] numSum(int[] array){
        int[] arr = new int[2];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if((array[i]+array[j]==targetSum)&&(i!=j)) {
                    arr[0] = array[i];
                    arr[1] = array[j];
                    return arr;
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        System.out.println("Enter the size of array you want : ");
        int size = sc.nextInt();
        Adder add = new Adder(size);
        System.out.println("Enter the Elements of array :");
        add.getData();
        int[] arrayAnswer = numSum(add.array);
        if(arrayAnswer!=null){
            System.out.println("Resultant array  :  ["+arrayAnswer[0]+","+arrayAnswer[1]+"]");
        }
        else {
            System.out.println("Resultant array  :  []");
        }
    }
}
