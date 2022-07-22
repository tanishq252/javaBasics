package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    static Scanner sc = new Scanner(System.in);

    private int[] myNumbers = new int[50];

    public static void main(String[] args){
        System.out.println("Add any 5 items to groceryList");
        for (int i=0;i<5;i++){
            addGroceryItem(sc.nextLine().toString());
        }
        printList();

        //to make a string array
        String[] stringArray = new String[groceryList.size()];
        stringArray = groceryList.toArray(stringArray);
    }

    //arraylist is a class
    private static ArrayList<String> groceryList = new ArrayList<String>();

    //to copy one ArrayList to another
    ArrayList<String > newArray = new ArrayList<String>(groceryList);



    //to add an item in ArrayList
    public static void addGroceryItem(String item){
        // for a simple array
//        myNumbers[5] = 4;

        //for arrayList
        groceryList.add(item);
        //ArrayList.add(item) will add the particular datatype items to ArrayList
    }

    //to print the list that was appended
    public static void printList(){
        System.out.println("You have "+groceryList.size()+" items in your list ");
        for (int i=0;i<groceryList.size();i++){
            // arrayList.get(item) will get that particular item to print on screen
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    //to put a particular item at the position that we are going to give
    public static void modifyGroceryList(String item, int position){
        // ArrayList.set changes the item present on the given position
        groceryList.set(position,item);
        System.out.println("Grocery item "+(position+1)+" has been modified.");
    }

    //to remove an item based on it's index
    public static void deleteGroceryItem(int position){
        String deleted = groceryList.get(position);
        // ArrayList.remove() will remove the particular item from the list
        groceryList.remove(position);
        System.out.println(deleted+ " has been removed from the list");
    }

    //to find whether item is present or not in the list
    public static String findItem(String item){
//        boolean iSItem = groceryList.contains(item);
        int pos = groceryList.indexOf(item);
        if(pos>=0){
            return groceryList.get(pos);
        }
        return null;
    }

    public static void insert(int pos,String insertString){
        groceryList.add(pos,insertString);
    }

}
