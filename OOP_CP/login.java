package OOP_CP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
class MyCanvas extends Canvas
{
    // class constructor
    public MyCanvas() {
        setBackground (Color.BLUE);
        setSize(600, 400);
    }
}

    class login  implements ActionListener{

    JFrame f;
    JLabel l1,l2, id15,id8;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    login(){

        f=new JFrame("Login");

        f.setBackground(Color.blue);
        f.setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        f.add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        f.add(l2);

        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        f.add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        f.add(t2);


//        id15=new JLabel();
//        id15.setBounds(0,0,900,700);
//        id15.setLayout(null);
//        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("OOP_CP/Employee/front.jpg"));
//        id15.setIcon(img);

//        id8 = new JLabel("New Employee Details");
//        id8.setBounds(320,30,500,50);
//        id8.setFont(new Font("serif",Font.ITALIC,25));
//        id8.setForeground(Color.black);
//        id15.add(id8);
        f.add(id15);
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/login.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
//        ImageIcon i3 =  new ImageIcon(i2);
//        JLabel l3 = new JLabel(Image());
//        l3.setBounds(350,20,150,150);
//        f.add(l3);


        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        f.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        f.add(b2);

        b2.addActionListener(this);

        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(600,300);
        f.setLocation(400,300);
        f.add(new MyCanvas());


    }

    public void actionPerformed(ActionEvent ae){

        try{
            connection c1 = new connection();
            String u = t1.getText();
            String v = t2.getText();

            String q = "select * from login where username='"+u+"' and password='"+v+"'";

            ResultSet rs = c1.s.executeQuery(q);
            if(rs.next()){
//                new details().f.setVisible(true);
                JOptionPane.showMessageDialog(null, "Login Successful");
                f.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                f.setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] arg){
        login l=new login();
    }
}