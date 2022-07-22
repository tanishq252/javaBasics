package OOP_CP;

import java.sql.DriverManager;

import java.sql.*;
import java.util.Scanner;

public class connection{

    public Connection c;
    public Statement s;
    static Scanner sc = new Scanner(System.in);

    public connection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOPCP","root","1234");
            s = c.createStatement();
            System.out.println("Connected Successfully");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void validate(String userName, String userPassword){}

    public static void add(String name, String password){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/OOPCP","root","");
            Statement stmt=con.createStatement();
            Boolean b=stmt.execute("insert into login values('"+name+"','"+password+"')");
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/OOPCP?characterEncoding=utf8","root","1234");
            Statement stmt=con.createStatement();
            System.out.println("Enter the name  : "); String name = sc.nextLine();
            System.out.println("Enter the password  : "); String password = sc.nextLine();
            add(name,password);
            ResultSet rs=stmt.executeQuery("select * from logi");
            while(rs.next())
                System.out.println(rs.getString(1)+"  "+rs.getString(2));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
