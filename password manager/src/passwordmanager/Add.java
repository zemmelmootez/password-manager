package passwordmanager;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;


public class Add extends JPanel {
    public Component txtRibb;
    JTextField txtLink;
    JTextField txtAdd;
    JTextField txtCVC;
    JPasswordField txtPassword;
    JTextField txtNumCard;
    JTextField txtDateExp;
    JTextField txtRib;
    JTextField txtBankName;
    JButton btnSaveSA;
    JButton btnSaveBA;
    JButton btnSavePC;
    JTextField TxtMotPasse;
    JTextField TxtOperator;
    JLabel lblAdress;
    JLabel lblLink;
    JLabel lblPassword;
    JLabel lblNumcard;
    JLabel lblCvc;
    JLabel lblDateexp;
    JLabel lblRib;
    JLabel lblBankName;
    JLabel lblOperateur;
    JLabel lblMotPasse;
    JButton btnWifi;






    /**
     * Create the panel.
     */
    public Add() {

        setBackground(new Color(33,33,33));
        setBounds(0, 0,635, 308);
        setLayout(null);
        setVisible(true);
		/* panel = new JPanel();
		panel.setBackground(new Color(33,33,33));
		panel.setBounds(0, 0,635, 308);
		panel.setLayout(null);
		add(panel);
		*/


        lblLink = new JLabel("Link :");
        lblLink.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblLink.setForeground(Color.WHITE);
        lblLink.setBounds(7, 7, 57, 25);
        add(lblLink);

        txtLink = new JTextField();

        txtLink.setBounds(61, 11, 117, 20);
        add(txtLink);
        txtLink.setColumns(10);

        lblAdress = new JLabel("Adress:");
        lblAdress.setForeground(Color.WHITE);
        lblAdress.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblAdress.setBounds(7, 38, 57, 25);
        add(lblAdress);

        txtAdd = new JTextField();
        txtAdd.setColumns(10);
        txtAdd.setBounds(61, 42, 117, 20);
        add(txtAdd);

        lblPassword = new JLabel("Password:");
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPassword.setBounds(0, 74, 70, 25);
        add(lblPassword);

        lblNumcard = new JLabel("NumCard:");
        lblNumcard.setForeground(Color.WHITE);
        lblNumcard.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNumcard.setBounds(188, 42, 70, 25);
        add(lblNumcard);

        txtCVC = new JTextField();
        txtCVC.setColumns(10);
        txtCVC.setBounds(256, 11, 110, 20);
        add(txtCVC);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(61, 74, 117, 20);
        add(txtPassword);

        txtNumCard = new JTextField();
        txtNumCard.setColumns(10);
        txtNumCard.setBounds(256, 42, 110, 20);
        add(txtNumCard);

        lblCvc = new JLabel("CVC:");
        lblCvc.setForeground(Color.WHITE);
        lblCvc.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCvc.setBounds(188, 7, 57, 25);
        add(lblCvc);

        lblDateexp = new JLabel("DateExp:");
        lblDateexp.setForeground(Color.WHITE);
        lblDateexp.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDateexp.setBounds(188, 74, 70, 25);
        add(lblDateexp);

        txtDateExp = new JTextField();
        txtDateExp.setColumns(10);
        txtDateExp.setBounds(256, 78, 110, 20);
        add(txtDateExp);

        lblRib = new JLabel("RIB:");
        lblRib.setForeground(Color.WHITE);
        lblRib.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblRib.setBounds(393, 7, 57, 25);
        add(lblRib);

        txtRib = new JTextField();
        txtRib.setColumns(10);
        txtRib.setBounds(448, 11, 110, 20);
        add(txtRib);

        setTxtBankName(new JTextField());
        getTxtBankName().setColumns(10);
        getTxtBankName().setBounds(448, 42, 110, 20);
        add(getTxtBankName());

        lblBankName = new JLabel("Bank name:");
        lblBankName.setForeground(Color.WHITE);
        lblBankName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBankName.setBounds(376, 38, 74, 25);
        add(lblBankName);

        btnSaveSA = new JButton("Save");
        btnSaveSA.setEnabled(false);
        btnSaveSA.setForeground(Color.WHITE);
        btnSaveSA.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnSaveSA.setBackground(SystemColor.activeCaption);
        btnSaveSA.setBounds(89, 105, 89, 23);
        add(btnSaveSA);

        JButton btnSavePC = new JButton("Save");
        btnSavePC.setEnabled(false);
        btnSavePC.setForeground(Color.WHITE);
        btnSavePC.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnSavePC.setBackground(SystemColor.activeCaption);
        btnSavePC.setBounds(277, 105, 89, 23);
        add(btnSavePC);

        JButton btnSaveBA = new JButton("Save");
        btnSaveBA.setEnabled(false);
        btnSaveBA.setForeground(Color.WHITE);
        btnSaveBA.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnSaveBA.setBackground(SystemColor.activeCaption);
        btnSaveBA.setBounds(469, 98, 89, 23);
        add(btnSaveBA);

        lblMotPasse = new JLabel("PasswordW:");
        lblMotPasse.setForeground(Color.WHITE);
        lblMotPasse.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblMotPasse.setBounds(0, 164, 74, 25);
        add(lblMotPasse);

        TxtMotPasse = new JTextField();
        TxtMotPasse.setColumns(10);
        TxtMotPasse.setBounds(78, 168, 110, 20);
        add(TxtMotPasse);

        TxtOperator = new JTextField();
        TxtOperator.setColumns(10);
        TxtOperator.setBounds(78, 199, 110, 20);
        add(TxtOperator);

        lblOperateur = new JLabel("Operator:");
        lblOperateur.setForeground(Color.WHITE);
        lblOperateur.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblOperateur.setBounds(7, 194, 63, 25);
        add(lblOperateur);

        btnWifi = new JButton("Save");
        btnWifi.setEnabled(false);
        btnWifi.setForeground(Color.WHITE);
        btnWifi.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnWifi.setBackground(SystemColor.activeCaption);
        btnWifi.setBounds(99, 230, 89, 23);
        add(btnWifi);

    }

    public JTextField getTxtBankName() {
        return txtBankName;
    }
    public JTextField getTxtLink() {
        return txtLink;
    }
    public JTextField getTxtAdd() {
        return txtAdd;
    }

    public JTextField getTxtCVC() {
        return txtCVC;
    }
    public JTextField getTxtnumCard() {
        return txtNumCard;
    }
    public JTextField getTxtDateExp() {
        return txtDateExp;
    }
    public JTextField getTxtRib() {
        return txtRib;
    }
    public JTextField getTxtPassword() {
        return txtPassword;
    }
    public JTextField getTxtPasswordd() {
        return TxtMotPasse ;
    }
    public JTextField getTxtOperator() {
        return TxtOperator ;
    }
    public JButton  getSA() {
        return btnSaveSA ;
    }
    public void btn(){/*cette fonction change la couleur d'ecriture de toutes les zones des texts */
        lblAdress.setForeground(Color.GRAY);
        lblLink.setForeground(Color.GRAY);
        lblPassword.setForeground(Color.GRAY);
        lblBankName.setForeground(Color.GRAY);
        lblBankName.setForeground(Color.GRAY);
        lblRib.setForeground(Color.GRAY);
        lblNumcard.setForeground(Color.GRAY);
        lblDateexp.setForeground(Color.GRAY);
        lblCvc.setForeground(Color.GRAY);
        lblMotPasse.setForeground(Color.GRAY);
        lblOperateur.setForeground(Color.GRAY);

    }






    public void setTxtBankName(JTextField txtBankName) {
        this.txtBankName = txtBankName;
    }
    public void Visibilite(JTextField t,boolean b){
        t.setVisible(b);

    }

}
