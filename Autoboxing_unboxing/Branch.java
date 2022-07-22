package Autoboxing_unboxing;

import java.util.ArrayList;

public class Branch {
    String branchName;
    ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String name,double trans){
        Customer cus = findCustomerClass(name);
        if(cus!=null){
            System.out.println("Customer already exists");
            return false;
        }
        else {
            this.customers.add(new Customer(name,trans));
        }
        return true;
    }

    public boolean addCustomerTransaction(String name,double trans){
        Customer c = findCustomerClass(name);
        if(c!=null){
            c.getTransactions().add(trans);
            return true;
        }
        return false;
    }

    public boolean findCustomer(String name){
        Customer c = findCustomerClass(name);
        return c != null;
    }

    public Customer findCustomerClass(String name){
        for (Customer customer : this.customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

}
