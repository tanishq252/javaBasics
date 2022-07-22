package Autoboxing_unboxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

   public boolean addBranch(String branchName){
        Branch b = findBranchClass(branchName);
        if(b==null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
   }

   public boolean addCustomer(String branchName,String customerName,double initialTransaction){
        Branch b  = findBranchClass(branchName);
        if(b!=null){
            b.getCustomers().add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
   }

   public boolean addCustomerTransaction(String branchName,String customerName,double newTransaction){
       Branch b = findBranchClass(branchName);
       if(b!=null){
           b.addCustomerTransaction(customerName, newTransaction);
           return true;
       }
       return false;
   }

   public boolean findBranch(String name){
       Branch b = findBranchClass(name);
       return b!= null;

   }

   public Branch findBranchClass(String name){
       for(Branch branch:this.branches){
           if(branch.getBranchName().equals(name)){
               return branch;
           }                                                    
       }
       return null;
   }

   public boolean listCustomers(String branchName, boolean print){
       Branch b = findBranchClass(branchName);
       if(b!=null){
            if(print){
                for(int i=0;i<b.customers.size();i++){
                    System.out.println("Customer : "+b.customers.get(i).getName());
                    printTransactions(b.customers.get(i));
                }
            }
            else{
                for(int i=0;i<b.customers.size();i++){
                    System.out.println("Customer : "+b.customers.get(i).getName());
                }
            }
            return true;
       }
       return false;

   }

   public static void printTransactions(Customer cust){
       System.out.println("Transactions");
       for(int i=0;i<cust.getTransactions().size();i++){
           System.out.println("["+(i+1)+"]"+" Amount "+cust.getTransactions().get(i));
       }

   }
}
