// We will be studying constructors here

public class Constructors {

    private String account_name;
    private double account_balance;
    private String email_id;

//    1) default Constructor as we have done in cpp
    public Constructors(){
        // after creating a 3 parametered constructor we can do the following
        this("NULL", "null@gmail.com", 0.0);

        System.out.println("This is Default Constructor");
    }


//    2) parameterized Constructor again same as cpp

    // 3 parameter
    public Constructors(String account_name,String email_id,double account_balance) {
        System.out.println("Constructor with 3 parameters");
        this.account_balance = account_balance;
        this.account_name = account_name;
        this.email_id = email_id;
    }

    // 2 parameter
    public Constructors(String email,double acc_balance){
        this("Tan_Dan",email,acc_balance);
        // after doing above it will create account with name as default
        System.out.println("Constructor with 2 parameters");
    }

    // 1 parameter
    public Constructors(String email){
        this("Tan_Tha_Dan",email,100.00);
        // after doing above it will create account with name and balance as default
        System.out.println("Constructor with 1 parameters");
    }

//    public Constructors(Constructors &copied_constructor){
//
//    }


    //    creating a method to return all details
    public void print_info(){
        System.out.println("**************************");
        System.out.println(account_balance);
        System.out.println(account_name);
        System.out.println(email_id);
        System.out.println("**************************");
    }



// we will carry the try and error part in below part
    public static void main(String[] args){

//        1) Default Constructors
        Constructors Default = new Constructors();
        // in terminal we can see default statement printed
        Default.print_info();
        // all default values will be there

        System.out.println();
//        2) Parameterized Constructors
        // NOTE : we will get printed as "Constructor with 3 parameters" because we have used "this()"

        // 3 parameters
        Constructors Tanishq_3_parameters = new Constructors("Tanishq","tan@gmail.com",150.150);
        Tanishq_3_parameters.print_info();
        System.out.println();

        // 2 parameters
        Constructors Tanishq_2_parameters = new Constructors("advya_tadvya@gmail.com",234.150);
        Tanishq_2_parameters.print_info();
        System.out.println();

        // 1 parameters
        Constructors Tanishq_1_parameters = new Constructors("tmd@gmail.com");
        Tanishq_1_parameters.print_info();
        System.out.println();

    }

}
