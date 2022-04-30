package passwordmanager;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings("serial")
public class panelllSignUp extends JPanel {

    protected static final String JOtionPane = null;
    private Image img_email = new ImageIcon(Login.class.getResource("../res/mail.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) ;
    private Image img_key = new ImageIcon(Login.class.getResource("../res/key.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) ;
    private Image img_user = new ImageIcon(Login.class.getResource("../res/userrr.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) ;
    @SuppressWarnings("unused")
    private JPanel contentPane;
    private JTextField txt_EnterYourEmail;

    @SuppressWarnings("unused")
    private JPasswordField pwdEnterYourPassword;
    private JPasswordField pwdPassword;
    private JTextField txtEnterYourUsername;
    /**
     *
     * Create the panel.
     */

    public panelllSignUp() {

        setBackground(SystemColor.textInactiveText);
        setBounds(0,0,430,199);
        setLayout(null);
        setBackground(new Color(33,33,33));
        setVisible(true);




        JPanel panel_mail = new JPanel();
        panel_mail.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.textHighlightText));
        panel_mail.setBackground(new Color(33,33,33));
        panel_mail.setBounds(101, 0, 238, 42);
        add(panel_mail);
        panel_mail.setLayout(null);
        txt_EnterYourEmail = new JTextField();
        txt_EnterYourEmail.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txt_EnterYourEmail.setText("");

            }
        });

        txt_EnterYourEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txt_EnterYourEmail.setBorder(null);
        txt_EnterYourEmail.setBackground(new Color(33,33,33));
        txt_EnterYourEmail.setForeground(Color.gray);
        txt_EnterYourEmail.setText("Enter your email");
        txt_EnterYourEmail.setBounds(35, 10, 203, 25);
        panel_mail.add(txt_EnterYourEmail);
        txt_EnterYourEmail.setColumns(10);

	/*pwdEnterYourPassword = new JPasswordField();
	pwdEnterYourPassword.setBounds(35, 12, 193, 23);
	panel_mail.add(pwdEnterYourPassword);
	pwdEnterYourPassword.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			pwdEnterYourPassword.setText("");
		}
	});
	pwdEnterYourPassword.setText("Password");
	pwdEnterYourPassword.setBorder(null);
	pwdEnterYourPassword.setBackground(new Color(33,33,33));
	pwdEnterYourPassword.setForeground(Color.gray);*/
        JLabel error = new JLabel("this user already exist");
        error.setHorizontalAlignment(SwingConstants.CENTER);
        error.setBorder(null);
        error.setForeground(new Color(222, 78, 78));
        error.setBounds(0,-1, 140, 10);
        error.setVisible(false);
        panel_mail.add(error);
        JLabel lbl_icon_mail = new JLabel("");
        lbl_icon_mail.setBounds(0, 10, 40, 28);
        panel_mail.add(lbl_icon_mail);
        lbl_icon_mail.setBorder(null);
        lbl_icon_mail.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_icon_mail.setIcon(new ImageIcon(img_email));

        JPanel panel_password = new JPanel();
        panel_password.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
        panel_password.setBackground(new Color(33,33,33));
        panel_password.setBounds(101, 42, 238, 42);
        add(panel_password);
        panel_password.setLayout(null);

        JLabel lbl_icon_password = new JLabel("");
        lbl_icon_password.setBorder(null);
        lbl_icon_password.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_icon_password.setBounds(0, 11, 36, 23);
        lbl_icon_password.setIcon(new ImageIcon(img_key));
        panel_password.add(lbl_icon_password);

        pwdPassword = new JPasswordField();
        pwdPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pwdPassword.setText("");
            }
        });

        pwdPassword.setForeground(SystemColor.gray);
        pwdPassword.setText("Password");
        pwdPassword.setBackground(new Color(33,33,33));
        pwdPassword.setBorder(null);
        pwdPassword.setBounds(34, 14, 194, 20);
        panel_password.add(pwdPassword);

        JPanel panel_mail_1 = new JPanel();
        panel_mail_1.setLayout(null);
        panel_mail_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.textHighlightText));
        panel_mail_1.setBackground(new Color(33, 33, 33));
        panel_mail_1.setBounds(101, 84, 238, 42);
        add(panel_mail_1);

        txtEnterYourUsername = new JTextField();
        txtEnterYourUsername.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtEnterYourUsername.setText("");
            }
        });
        txtEnterYourUsername.setText("Enter your username");
        txtEnterYourUsername.setForeground(Color.GRAY);
        txtEnterYourUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtEnterYourUsername.setColumns(10);
        txtEnterYourUsername.setBorder(null);
        txtEnterYourUsername.setBackground(new Color(33, 33, 33));
        txtEnterYourUsername.setBounds(35, 10, 203, 25);
        panel_mail_1.add(txtEnterYourUsername);


        JLabel lbl_icon_username = new JLabel("");
        lbl_icon_username.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_icon_username.setBorder(null);
        lbl_icon_username.setBounds(0, 10, 40, 28);
        lbl_icon_username.setIcon(new ImageIcon(img_user));
        panel_mail_1.add(lbl_icon_username);

        JLabel lbl_icon_password_1 = new JLabel("");
        lbl_icon_password_1.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_icon_password_1.setBorder(null);
        lbl_icon_password_1.setBounds(0, 10, 36, 23);
        panel_mail_1.add(lbl_icon_password_1);

        final JButton btn_Login = new JButton("Sign Up");
        txt_EnterYourEmail.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                txt_EnterYourEmail.setForeground(new Color(114, 114, 114));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        pwdPassword.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                pwdPassword.setForeground(new Color(114, 114, 114));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        txtEnterYourUsername.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {


               txtEnterYourUsername.setForeground(new Color(114, 114, 114));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                txtEnterYourUsername.setForeground(new Color(0,0,0));
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


            //  System.out.println(txtEnterYourUsername.getText().length());
              if((String.valueOf(pwdPassword.getPassword()).equals("Password")|| String.valueOf(pwdPassword.getPassword()).length()==0)&&(txt_EnterYourEmail.getText().equals("Enter your email")||txt_EnterYourEmail.getText().length()==0) &&(txtEnterYourUsername.getText().equals("Enter your username") || txtEnterYourUsername.getText().length()==0))
              {
                  pwdPassword.setText("password");

                  pwdPassword.setForeground(new Color(197, 62, 62));
                  txt_EnterYourEmail.setText("email is obligatory");
                  txt_EnterYourEmail.setForeground(new Color(197, 62, 62));
                  txtEnterYourUsername.setText("username is obligatory");
                  txtEnterYourUsername.setForeground(new Color(197, 62, 62));
              }
              else if (String.valueOf(pwdPassword.getPassword()).equals("Password")|| String.valueOf(pwdPassword.getPassword()).length()==0)
              {
                  pwdPassword.setText("password");

                  pwdPassword.setForeground(new Color(197, 62, 62));
              }
              else if (txt_EnterYourEmail.getText().equals("Enter your email")||txt_EnterYourEmail.getText().length()==0)
              {
                  txt_EnterYourEmail.setText("email is obligatory");
                  txt_EnterYourEmail.setForeground(new Color(197, 62, 62));
              }
              else if (txtEnterYourUsername.getText().equals("Enter your username") || txtEnterYourUsername.getText().length()==0)
              {
                  txtEnterYourUsername.setText("username is obligatory");
                  txtEnterYourUsername.setForeground(new Color(197, 62, 62));
              }


else {
                  String pw1 =String.valueOf(pwdPassword.getPassword());
                  try {
                      pw1= test.toHexString(test.getSHA(pw1));
                  } catch (NoSuchAlgorithmException ex) {
                      ex.printStackTrace();
                  }
                  String sql="select * from actor where email='"+txt_EnterYourEmail.getText()+"' and password ='"+ pw1+"'";
                try {

                    ResultSet rs =  test.s.executeQuery(sql);
                    int rows = 0;
                    rs.last();
                    rows = rs.getRow();
                    rs.beforeFirst();
                    if (rows != 0)
                    {

                        error.setVisible(true);
                    }

                    else {

                     String pw =String.valueOf(pwdPassword.getPassword());
                      pw= test.toHexString(test.getSHA(pw));
                       sql= "INSERT INTO actor (email,password) " +
                                "VALUES ('"+txt_EnterYourEmail.getText()+"','"+pw+"')";
                        test.s.executeUpdate(sql);
                        JPanelTest p= new JPanelTest(txt_EnterYourEmail.getText(),pw);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (NoSuchAlgorithmException ex) {
                    ex.printStackTrace();
                }


            }}
        });
        btn_Login.setForeground(Color.WHITE);
        btn_Login.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn_Login.setBorder(null);
        btn_Login.setBackground(new Color(0, 117, 153));
        btn_Login.setBounds(91, 137, 248, 30);
        add(btn_Login);


    }

}