package passwordmanager;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class social_account {
    private Image img_email = new ImageIcon(Login.class.getResource("../res/mail.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) ;
    private Image img_key = new ImageIcon(Login.class.getResource("../res/key.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) ;

    public social_account(String email,String pw)
    {
        JFrame f = new JFrame("");
        f.setUndecorated(true);
        f.getContentPane().setBackground( new Color(33,33,33) );
        f.setBounds(420,120,700,340);
        f.setVisible(true);
        JTextField textField = new JTextField();
        textField.setText("Enter your email");
        textField.setForeground(Color.GRAY);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField.setColumns(10);
        textField.setBorder(null);
        textField.setBackground(new Color(0x333333));
        textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.textHighlightText));
        textField.setBounds(280, 50, 203, 25);
        JLabel lbl_icon_mail = new JLabel("");
        lbl_icon_mail.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_icon_mail.setBorder(null);
        lbl_icon_mail.setBounds(240, 53, 40, 28);
        lbl_icon_mail.setIcon(new ImageIcon(img_email));
        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField.setText("");
            }
        });
        f.add(lbl_icon_mail);
        f.add(textField);

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


        JTextField namefield = new JTextField();
        namefield.setText("Name of social website");
        namefield.setForeground(Color.GRAY);
        namefield.setFont(new Font("Tahoma", Font.PLAIN, 13));
        namefield.setColumns(10);
        namefield.setBorder(null);
        namefield.setBackground(new Color(0x333333));
        namefield.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.textHighlightText));
        namefield.setBounds(280, 140, 203, 25);
        JLabel lbl_icon_mail2 = new JLabel("");
        lbl_icon_mail2.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_icon_mail2.setBorder(null);
        lbl_icon_mail2.setBounds(240, 143, 40, 28);
        lbl_icon_mail2.setIcon(new ImageIcon(img_email));
        namefield.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                namefield.setText("");
            }
        });
        f.add(lbl_icon_mail2);
        f.add(namefield);
        JTextField website = new JTextField();
        website.setText("Link of website");
        website.setForeground(Color.GRAY);
        website.setFont(new Font("Tahoma", Font.PLAIN, 13));
        website.setColumns(10);
        website.setBorder(null);
        website.setBackground(new Color(0x333333));
        website.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.textHighlightText));
        website.setBounds(280, 190, 203, 25);
        JLabel  lbl_icon_mail3 = new JLabel("");
        lbl_icon_mail3.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_icon_mail3.setBorder(null);
        lbl_icon_mail3.setBounds(240, 193, 40, 28);
        lbl_icon_mail3.setIcon(new ImageIcon(img_email));
        website.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                website.setText("");
            }
        });
        f.add(lbl_icon_mail3);
        f.add(website);

        JButton add = new JButton("Add social Account");
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

                String  sql= "INSERT INTO social_account (email,name,link,password,id) " +
                        "VALUES ('"+textField.getText()+"','"+namefield.getText()+"',"+"'"+website.getText()+"',"+"'"+pw+"',"+JPanelTest.id+")";
                try {
                    test.s.executeUpdate(sql);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                choose c= new choose(email, pw);
            }
        });
    }

}
