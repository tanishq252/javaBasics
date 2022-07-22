package OOP_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Order {

    static Scanner sc = new Scanner(System.in);

    private ArrayList<String> orderItems = new ArrayList<>();
    private boolean cashOnDelivery;
    private static int currentOrderNumber;
    private static int orderNumber;

    static {
        orderNumber = 100;
    }
    public Order(ArrayList<String> orderItems,boolean cashOnDelivery){
        this.orderItems = orderItems;
        this.cashOnDelivery = cashOnDelivery;
        this.currentOrderNumber = orderNumber++;
    }

    public Order(boolean cashOnDelivery){
        this.cashOnDelivery = cashOnDelivery;
        this.currentOrderNumber = orderNumber++;
    }

    public void items(){
        System.out.println("Enter the number of items you want : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            orderItems.add(sc.next());
        }
    }

    public ArrayList<String> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<String> orderItems) {
        this.orderItems = orderItems;
    }

    public boolean isCashOnDelivery() {
        return cashOnDelivery;
    }

    public void setCashOnDelivery(boolean cashOnDelivery) {
        this.cashOnDelivery = cashOnDelivery;
    }

    public int getCurrentOrderNumber() {
        return currentOrderNumber;
    }

    public void setCurrentOrderNumber(int currentOrderNumber) {
        this.currentOrderNumber = currentOrderNumber;
    }
}

class Trial{


    public static List<String> getItems(ArrayList<Order> orderList){
        ArrayList<String> orders = new ArrayList<>();

        for(Order o : orderList){
                orders.addAll(o.getOrderItems());
        }
        return orders;
    }

    public static void main(String[] args) {
        ArrayList<Order> orderArrayList = new ArrayList<>();

        ArrayList<String> items1 = new ArrayList<>();
        items1.add("Shirt");
        items1.add("Gloves");
        items1.add("Jeans");
        Order o1 = new Order(items1, true);
        orderArrayList.add(o1);
        System.out.println(o1.getCurrentOrderNumber());


        ArrayList<String> items2 = new ArrayList<>();
        items2.add("Skirt");
        items2.add("SportsWear");
        items2.add("Jeans");
        orderArrayList.add(new Order(items2, false));
        System.out.println(o1.getCurrentOrderNumber());

        ArrayList<String> items3 = new ArrayList<>();
        items3.add("Shirt");
        items3.add("Gloves");
        items1.add("Jeans");
        Order o3 = new Order(items1, true);
        orderArrayList.add(o3);
        System.out.println(o3.getCurrentOrderNumber());


        List<String> allItems = getItems(orderArrayList);

        System.out.println(Arrays.deepToString(allItems.toArray()));

    }

}


