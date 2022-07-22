package Packages;

// awt = abstract window toolkit

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {
    public MyWindow(String title){
        super(title);
        setSize(500,500);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sLarge  = new Font("SansSerif",Font.BOLD,20);
        Font sSmall = new Font("SansSerif",Font.BOLD,10);
        g.setFont(sLarge);
        g.drawString("Java Noob I Am... WoHooooo",80,80);
        g.setFont(sSmall);
        g.drawString("MiNOOB",80,150);

    }

    public static void main(String[] args){
        MyWindow mywin = new MyWindow("Nikal");
        mywin.setVisible(true);
    }
}
