package passwordmanager;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class JPanelTest extends JFrame
{
    public static int id;


    public JPanelTest(String email , String pw) throws SQLException {
       String sql ="Select * from actor where email ='"+email+"'and password ='"+pw+"'";

       ResultSet rs= test.s.executeQuery(sql);
        System.out.println(sql);
        while (rs.next()) {
            id = rs.getInt("id");

        }
        //Créer le Jframe
        JFrame f = new JFrame("");
        f.setUndecorated(true);
        f.getContentPane().setBackground( new Color(33,33,33));
        //Créer le JPanel
       /* JPanel panel = new JPanel();
        //Spécifier la position et la taille du JPanel
        panel.setBounds(40,50,150,150);
        //Spécifier la couleur d'arrière-plan du JPanel
        panel.setBackground(Color.black);
        //Créer le bouton 1*/
        JButton btn1 = new JButton("ADD Account");
        //Spécifier la position et la taille du bouton
        btn1.setBounds(50,100,250,30);
        //Spécifier la couleur d'arrière-plan du bouton
        btn1.setBackground(new Color(33,33,33));
        btn1.setForeground(Color.white);

        JButton btn2 = new JButton("Show Account");
        btn2.setBounds(50,200,250,30);
        btn2.setBackground(new Color(33,33,33));
        btn2.setForeground(Color.white);

        f.add(btn1);
        f.add(btn2);

        f.setBounds(500,120,350,350);
        f.setLayout(null);
        f.setVisible(true);

        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                choose c = new choose(email,pw);


            }


        });
        btn2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                choose2 c=new choose2(email, pw);
            }
        });

    }

}