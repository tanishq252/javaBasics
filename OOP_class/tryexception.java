package OOP_class;

import java.util.Scanner;

public class tryexception {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Select a number fo following scenarios : \n1. Arithmetic Exception Test\n2. Array Index Exception Test\n3. Null Pointer Exception Test\n\nEnter the number");
        int n = sc.nextInt();
        switch (n){
            case 1: {
                System.out.println("Enter n1 : ");
                int n1 = sc.nextInt();
                System.out.println("Enter n2 : ");
                int n2 = sc.nextInt();
                try{
                    int ans = n1/n2;
                    System.out.println(n1/n2);

                }catch(ArithmeticException e){
                    System.out.println("You shouldn’t divide a number by zero.");
                }
                break;

            }case 2: {
                System.out.println("Enter the size of array which contains all numbers from 1 to the size of array");
                int s = sc.nextInt();
                int ar[] = new int[s];
                for(int i=0;i<s;i++){
                    ar[i] = i+1;
                }

                try{
                    System.out.println("Enter the ith index you want access");
                    int i = sc.nextInt();
                    System.out.println(ar[i] + " is the value");
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("OOPs!!!Array Index out of bounds for length "+ s);
                }
                break;
            }case 3: {
                String st = null;
                try{
                    System.out.println("length is : "+st.length());
                }catch(NullPointerException e){
                    System.out.println("Null Pointer Exception arises!!");
                }
                break;
            } default:{
                System.out.println("Wrong case number try again");
            }
        }
    }
}
