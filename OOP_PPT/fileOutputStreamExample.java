package OOP_PPT;

import java.io.FileOutputStream;
import java.util.Scanner;

public class fileOutputStreamExample {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        try{
            FileOutputStream f = new FileOutputStream("D:\\Java_Masterclass\\Hello_World\\src\\OOP_PPT\\trial.txt");
//            f.write(65);
            String s = "Welcome to VIT";
            byte[] byteArray = s.getBytes();
            f.write(byteArray);
//            as we are not converting the data into bytes the IntellijIdea will not allow us to write the data
//            f.write("Hey");
            f.write(97);
            f.close();
            System.out.println("Done");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
