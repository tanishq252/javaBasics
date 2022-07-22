package generics;

import java.util.ArrayList;

public class generics_1 {
    public static void main(String[] args){

        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        // here if we try to get a string stored here then it throws an error
//        because as of now we have not provided the datatype of the list

        printDoubled(items);
    }

    private static void printDoubled(ArrayList n){
        for(Object i:n){
            System.out.println((Integer) i*2 + " ");
        }
    }
}
