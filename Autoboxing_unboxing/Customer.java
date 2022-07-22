package Autoboxing_unboxing;

import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Double> transactions ;

    public Customer(String name, double trans) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransactions(trans);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void addTransactions(double trans){
        this.transactions.add(trans);
    }
}
