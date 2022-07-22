import java.util.Scanner;
// we can perform various operations like sorting and searching using this
public class array {

    public static void main(String[] args){
//        in java we declare array as "int[] array_name"
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

//      *****************IMP*******************
        int[] array = new int[n];


        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element of array");
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are :");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }

    }


}
