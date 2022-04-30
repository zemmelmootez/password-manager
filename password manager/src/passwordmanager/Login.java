package passwordmanager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import java.awt.Dimension;
import java.awt.Rectangle;


@SuppressWarnings("serial")
public class Login extends JFrame {

    public static JPanel contentPane;
    private JPanel  panelMainContent;
    private panelllSignUp pnlSignup;
    private panelllLoging pnlLogin;
    /**
     * Launch the application.
     */

    public static void main() {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                   Login frame = new Login();
                    frame.setVisible(true);
                    //(int) Toolkit.getDefaultToolkit().getScreenSize().getWidth()/3
                    frame.setBounds(450,150,450 , 350);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 452, 362);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        pnlSignup=new panelllSignUp();
        pnlSignup.setBounds(0,0,430,199);
        pnlLogin=new panelllLoging();
        pnlLogin.setBounds(0,0,430,199);


        JPanel panel = new JPanel();
        panel.setBackground(new Color(33,33,33));
        panel.setBounds(0, 0, 452, 362);
        contentPane.add(panel);

        final JLabel lbl_Close = new JLabel("X");
        lbl_Close.setBounds(410, 1, 23, 20);
        lbl_Close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbl_Close.setForeground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                lbl_Close.setForeground(Color.white);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        lbl_Close.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
            }

        });
        panel.setLayout(null);
        panel.add(lbl_Close);
        lbl_Close.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Close.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbl_Close.setForeground(Color.white);


        final JLabel lbl_Minimize = new JLabel("-");
        lbl_Minimize.setBounds(388, 1, 23, 20);
        lbl_Minimize.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbl_Minimize.setForeground(Color.gray);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                lbl_Minimize.setForeground(Color.white);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                setExtendedState(JFrame.ICONIFIED);

            }
        });
        panel.add(lbl_Minimize);
        lbl_Minimize.setFont(new Font("Tahoma", Font.BOLD, 23));
        lbl_Minimize.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Minimize.setForeground(Color.white);

        final JLabel lbl_Login = new JLabel("Login");
        lbl_Login.setBounds(135, 40, 57, 28);
        final JLabel lbl_SignUp = new JLabel("Sign Up");
        lbl_SignUp.setBounds(235, 40, 79, 28);
        lbl_Login.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.textHighlightText));
        lbl_Login.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl_Login.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.textHighlightText));
                lbl_SignUp.setBorder(null);
                menuClicked(pnlLogin);
            }
        });
        lbl_Login.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Login.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lbl_Login.setForeground(UIManager.getColor("ComboBox.buttonHighlight"));
        panel.add(lbl_Login);


        lbl_SignUp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl_SignUp.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.textHighlightText));
                lbl_Login.setBorder(null);
                menuClicked(pnlSignup);


            }
        });
        lbl_SignUp.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_SignUp.setForeground(Color.WHITE);
        lbl_SignUp.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        panel.add(lbl_SignUp);
        /*panel.add(panelllLogin);*/
        setUndecorated(true);

        panelMainContent =new JPanel();
        panelMainContent.setBounds(10, 90, 430, 199);
        panelMainContent.setBackground(new Color(33,33,33));
        panel.add(panelMainContent);
        panelMainContent.setLayout(null);
        panelMainContent.add(pnlLogin);
        panelMainContent.add(pnlSignup);
        menuClicked(pnlLogin);
    }
    public void menuClicked(JPanel pnl) {
        pnlSignup.setVisible(false);
        pnlLogin.setVisible(false);
        pnl.setVisible(true);

    }
	/*public void NonVide() {
		if(pnlSignup.isVisible()==false)
		{ if(pnlLogin.isVisible()==false)
		{
			pnlSignup.setVisible(true);
		}
		}
	}*/
}















