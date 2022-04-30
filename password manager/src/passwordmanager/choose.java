package passwordmanager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

public class choose  extends JFrame{

    public   choose(String email,String pw)
    {
        JFrame f = new JFrame("bhbh");
        f.setUndecorated(true);
        f.getContentPane().setBackground( new Color(33,33,33) );
        f.setBounds(500,120,350,350);
        f.setVisible(true);
        JButton btn11= new JButton("social account");
        JButton btn2= new JButton("bank account");
        JButton btn3= new JButton("wifi account");

        btn11.setBounds(50,50,250,30);

        btn11.setBackground(new Color(33,33,33));
        btn11.setForeground(Color.white);
        btn2.setBounds(50,100,250,30);

        btn3.setBounds(50,150,250,30);


        btn2.setBackground(new Color(33,33,33));
        btn2.setForeground(Color.white);
        btn3.setBackground(new Color(33,33,33));
        btn3.setForeground(Color.white);


        f.add(btn11);
        f.add(btn2);
        f.add(btn3);

        JFrame current=this;
        btn11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                social_account s=new social_account(email,pw);


            }

        });
        btn2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                bank_account b=new bank_account (email,pw);
            }
        });
        btn3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                wifi w=new wifi(email,pw);
            }
        });
        JLabel back=new JLabel("<- Back");
        back.setVisible(true);
        back.setForeground(Color.white);
        back.setBounds(50,250,250,30);
        f.add(back);
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    JPanelTest t=new JPanelTest(email,pw);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        }
}
