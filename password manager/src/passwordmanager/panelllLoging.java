package passwordmanager;

import com.mysql.cj.log.Log;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import java.awt.Font;
/*import java.awt.Image;*/

import javax.swing.JPasswordField;
/*import javax.swing.ImageIcon;*/
import javax.swing.JButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings("serial")
public class panelllLoging extends JPanel {
    private static JTextField textField;
    private static JLabel errorLogin;
    private JPasswordField passwordField;
    private Image img_email = new ImageIcon(Login.class.getResource("../res/mail.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) ;
    private Image img_key = new ImageIcon(Login.class.getResource("../res/key.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) ;
    /**
     * Create the panel.
     */
    public  static JTextField getTextField(){
        return textField;
    }
    public panelllLoging() {

        setBackground(SystemColor.textInactiveText);
        setBounds(0,0,430,199);
        setLayout(null);
        setBackground(new Color(33,33,33));
        setVisible(true);

        JPanel panel_mail = new JPanel();
        panel_mail.setLayout(null);
        panel_mail.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.textHighlightText));
        panel_mail.setBackground(new Color(33, 33, 33));
        panel_mail.setBounds(96, 11, 238, 42);
        add(panel_mail);

        textField = new JTextField();
        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField.setText("");
            }
        });
        JLabel error = new JLabel("this user doesnt exist");
        error.setHorizontalAlignment(SwingConstants.CENTER);
        error.setBorder(null);
        error.setForeground(new Color(222, 78, 78));
        error.setBounds(0, -2, 140, 15);
        error.setVisible(false);
        panel_mail.add(error);
        textField.setText("Enter your email");
        textField.setForeground(Color.GRAY);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField.setColumns(10);
        textField.setBorder(null);
        textField.setBackground(new Color(33, 33, 33));
        textField.setBounds(35, 10, 203, 25);
        panel_mail.add(textField);



        JLabel lbl_icon_mail = new JLabel("");
        lbl_icon_mail.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_icon_mail.setBorder(null);
        lbl_icon_mail.setBounds(0, 10, 40, 28);
        lbl_icon_mail.setIcon(new ImageIcon(img_email));
        panel_mail.add(lbl_icon_mail);


        JPanel panel_password = new JPanel();
        panel_password.setLayout(null);
        panel_password.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
        panel_password.setBackground(new Color(33, 33, 33));
        panel_password.setBounds(96, 54, 238, 42);
        add(panel_password);

        JLabel lbl_icon_password = new JLabel("");
        lbl_icon_password.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_icon_password.setBorder(null);
        lbl_icon_password.setBounds(0, 11, 36, 23);
        lbl_icon_password.setIcon(new ImageIcon(img_key));
        panel_password.add(lbl_icon_password);

        passwordField = new JPasswordField();
        passwordField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                passwordField.setText("");
            }
        });
        passwordField.setText("Password");
        passwordField.setForeground(Color.GRAY);
        passwordField.setBorder(null);
        passwordField.setBackground(new Color(33, 33, 33));
        passwordField.setBounds(34, 14, 194, 20);
        panel_password.add(passwordField);

        passwordField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                passwordField.setForeground(new Color(114, 114, 114));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        final JButton btn_Login = new JButton("Login");
        btn_Login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
             //   Menuu menu=new Menuu();
            //    menu.show();

            }
        });
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                textField.setForeground(new Color(114, 114, 114));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        btn_Login.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn_Login.setBackground(new Color(135,206,250));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn_Login.setBackground(new Color(0, 117, 153));
            }

            @Override

            public void mouseClicked(MouseEvent e) {

                if ((String.valueOf(passwordField.getPassword()).equals("Password") || String.valueOf(passwordField.getPassword()).length() == 0) && (textField.getText().equals("Enter your email") || textField.getText().length() == 0)) {
                    passwordField.setText("password");

                    passwordField.setForeground(new Color(197, 62, 62));

                        textField.setText("email is obligatory");
                        textField.setForeground(new Color(197, 62, 62));

                }
              else if (textField.getText().equals("Enter your email") || textField.getText().length() == 0) {
                    textField.setText("email is obligatory");
                    textField.setForeground(new Color(197, 62, 62));
                }
              else if (String.valueOf(passwordField.getPassword()).equals("Password") || String.valueOf(passwordField.getPassword()).length() == 0)
                {
                    passwordField.setText("password");

                    passwordField.setForeground(new Color(197, 62, 62));
                }
                else {
                    try {
                        String sql = "SELECT * FROM actor where email='" + textField.getText() + "' and password='" + test.toHexString(test.getSHA(String.valueOf(passwordField.getPassword()))) + "'";

                        ResultSet rs = test.s.executeQuery(sql);
                        int rows = 0;
                        rs.last();
                        rows = rs.getRow();
                        rs.beforeFirst();
                        System.out.println(rows);
                        if (rows == 0) {
                            error.setVisible(true);
                        } else {
                           JPanelTest p=new JPanelTest(textField.getText(),test.toHexString(test.getSHA(String.valueOf(passwordField.getPassword()))));


                        }

                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    } catch (NoSuchAlgorithmException ex) {
                        ex.printStackTrace();
                    }

                }
            }
        });


        btn_Login.setForeground(Color.WHITE);
        btn_Login.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn_Login.setBorder(null);
        btn_Login.setBackground(new Color(0, 117, 153));
        btn_Login.setBounds(86, 121, 248, 30);
        add(btn_Login);

    }


}

