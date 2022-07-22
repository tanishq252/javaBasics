package OOP_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(isr);
        System.out.println("Enter number");
        int s = b.read();
        System.out.println(" no = "+s);

        // we have to give an extra readLine in order to get proper output
        b.readLine();

        System.out.println("Enter the String");
        String st = (String) b.readLine();
        System.out.println(st);
    }
}
