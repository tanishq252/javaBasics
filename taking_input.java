import java.util.Scanner;

public class taking_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name  = scanner.nextLine();
        System.out.println("Hello "+name);

        System.out.println("Enter your age :");
        boolean is_next_int = scanner.hasNextInt(); // checks if next number is integer if not then we can do what we want

        if(is_next_int){
            int input = scanner.nextInt();
            System.out.println("Ohh u r "+input+" years old");
            System.out.println("Enter % of marks");
            double marks = scanner.nextDouble();
            System.out.println("Wow " + name + " u scored " + marks + " percentage");
            scanner.close();
        }
        else {
            System.out.println("invalid");

        }
    }
}
