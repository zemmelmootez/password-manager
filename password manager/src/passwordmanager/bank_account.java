package passwordmanager;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class bank_account extends JFrame {
    private Image img_email = new ImageIcon(Login.class.getResource("../res/mail.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) ;
    private Image img_key = new ImageIcon(Login.class.getResource("../res/key.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) ;
    bank_account(String email,String pw)
    {
        JFrame f = new JFrame("");
        f.setUndecorated(true);
        f.getContentPane().setBackground( new Color(33,33,33) );
        f.setBounds(420,120,700,340);
        f.setVisible(true);
        JTextField bank_name=new JTextField("enter Bank name");
        bank_name.setForeground(Color.GRAY);
        bank_name.setFont(new Font("Tahoma", Font.PLAIN, 13));
        bank_name.setColumns(10);
        bank_name.setBorder(null);
        bank_name.setBackground(new Color(0x333333));
        bank_name.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.textHighlightText));
        bank_name.setBounds(280, 50, 203, 25);
        JLabel lbl_icon_mail = new JLabel("");
        lbl_icon_mail.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_icon_mail.setBorder(null);
        lbl_icon_mail.setBounds(240, 53, 40, 28);
        lbl_icon_mail.setIcon(new ImageIcon(img_email));
        bank_name.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                bank_name.setText("");
            }
        });

        JPasswordField passwordField = new JPasswordField();
        passwordField.setText("password");
        passwordField.setForeground(Color.GRAY);
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        passwordField.setColumns(10);
        passwordField.setBorder(null);
        passwordField.setBackground(new Color(0x333333));
        passwordField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.textHighlightText));
        passwordField.setBounds(280, 90, 203, 25);

        JLabel lbl_icon_password = new JLabel("");
        lbl_icon_password.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_icon_password.setBorder(null);
        lbl_icon_password.setBounds(240, 93, 36, 23);
        lbl_icon_password.setIcon(new ImageIcon(img_key));
        passwordField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                passwordField.setText("");
            }
        });
        f.add(lbl_icon_password);
        f.add(passwordField);

        f.add(lbl_icon_mail);

        f.add(bank_name);
        JButton add = new JButton("Add bank Account");
        add.setBounds(280, 250, 203, 25);
        f.add(add);
        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String pw =String.valueOf(passwordField.getPassword());
                try {
                    pw= test.toHexString(test.getSHA(pw));
                } catch (NoSuchAlgorithmException ex) {
                    ex.printStackTrace();
                }

                String  sql= "INSERT INTO bank_account (bank_name,password,id) " +
                        "VALUES ('"+bank_name.getText()+"','"+pw+"',"+JPanelTest.id+")";
                System.out.println(sql);
                try {
                    test.s.executeUpdate(sql);
                    choose c= new choose(email, pw);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
