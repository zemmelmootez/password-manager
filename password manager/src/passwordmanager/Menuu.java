package passwordmanager;

import passwordmanager.Add;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Menuu extends JFrame {
	private JButton btnAll;
	private JButton btnSA;
	private JButton btnPC;
	private JButton btnW;
	private JButton btnBA;
	private JPanel contentPane;
	private JPanel panelPayementCaard;
	private JPanel panelBanckAccount;
	private JPanel panelWifi;
	private JPanel panelAll;
	private JPanel panelSocialAccount;
	private JTextField txtBanckAccouts;
	private JLabel verif;
	private Image img_menu = new ImageIcon(Login.class.getResource("../res/menupng.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) ;
    private Image img_wifi = new ImageIcon(Login.class.getResource("../res/wifi.png")).getImage().getScaledInstance(60,60,Image.SCALE_SMOOTH) ;
    private Image img_mony = new ImageIcon(Login.class.getResource("../res/monypng.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH) ;
    private Image img_card = new ImageIcon(Login.class.getResource("../res/hedhi.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH) ;
    private Image img_key = new ImageIcon(Login.class.getResource("../res/key.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) ;
    private Image img_email = new ImageIcon(Login.class.getResource("../res/mail.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) ;
    private Image img_plus = new ImageIcon(Login.class.getResource("../res/p.png")).getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH) ;
    private Image  img_social= new ImageIcon(Login.class.getResource("../res/sociall.png")).getImage().getScaledInstance(40,30,Image.SCALE_SMOOTH) ;
    private Image img_moins = new ImageIcon(Login.class.getResource("../res/m.png")).getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH) ;
    private Add pnlAdd;
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menuu frame = new Menuu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menuu() {
		setUndecorated(true);
		setFont(null);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		/*final JButton btnAll = new JButton("");
		final JButton btnBA = new JButton("");
		final JButton btnSM = new JButton("");
		final JButton btnW = new JButton("");
		final JButton btnPC = new JButton("");*/
		final JButton btnAll = new JButton("");
		final JButton btnSM = new JButton("");
		final JButton btnBA = new JButton("");
		final JButton btnPC = new JButton("");
		final JButton btnW = new JButton("");
		btnAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnAll.setBackground(new Color(235,10,10));
				btnSM.setBackground(new Color(33,33,33));
				btnBA.setBackground(new Color(33,33,33));
				btnPC.setBackground(new Color(33,33,33));
				btnW.setBackground(new Color(33,33,33));
				verif.setText("ALL");
			}
		});
		
		btnSM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnSM.setBackground(new Color(235,10,10));
				btnAll.setBackground(new Color(33,33,33));
				btnBA.setBackground(new Color(33,33,33));
				btnPC.setBackground(new Color(33,33,33));
				btnW.setBackground(new Color(33,33,33));
				verif.setText("SA");
			}
		});
		btnBA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnBA.setBackground(new Color(235,10,10));
				btnSM.setBackground(new Color(33,33,33));
				btnAll.setBackground(new Color(33,33,33));
				btnPC.setBackground(new Color(33,33,33));
				btnW.setBackground(new Color(33,33,33));
				verif.setText("BA");
			}
		});
		btnPC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnPC.setBackground(new Color(235,10,10));
				btnSM.setBackground(new Color(33,33,33));
				btnAll.setBackground(new Color(33,33,33));
				btnBA.setBackground(new Color(33,33,33));
				btnW.setBackground(new Color(33,33,33));
				verif.setText("PC");
			}
		});
		btnW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnW.setBackground(new Color(235,10,10));
				btnSM.setBackground(new Color(33,33,33));
				btnAll.setBackground(new Color(33,33,33));
				btnBA.setBackground(new Color(33,33,33));
				btnPC.setBackground(new Color(33,33,33));
				verif.setText("W");
			}
		});
		
		pnlAdd=new Add();
		pnlAdd.getTxtRib().setLocation(448, 11);
		pnlAdd.setLocation(210, 83);
		
		final JPanel panelGrid = new JPanel();
		panelGrid.setVisible(true);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(33, 33, 33));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		 
		
		JPanel panelKOL = new JPanel();
		panelKOL.setOpaque(false);
		panelKOL.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(230, 230, 250)));
		panelKOL.setBackground(new Color(33,33,33));
		panelKOL.setBounds(0, 63, 200, 363);
		panel.add(panelKOL);
		panelKOL.setLayout(null);
		
		
		
			
		
		btnAll.setContentAreaFilled(false);
		btnAll.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAll.setForeground(Color.WHITE);
		btnAll.setBackground(new Color(33,33,33));
		btnAll.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, Color.BLACK, null));
		btnAll.setBounds(22, 25, 168, 37);
		panelKOL.add(btnAll);
		
		JLabel lblNewLabel = new JLabel("All");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setName("lblAll");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(110, 27, 50, 27);
		panelKOL.add(lblNewLabel);
		
		JLabel lblmenu = new JLabel("");
		lblmenu.setBounds(49, 24, 39, 38);
		lblmenu.setIcon(new ImageIcon(img_menu));
		panelKOL.add(lblmenu);
		
		JLabel lblsocialmedia = new JLabel("");
		lblsocialmedia.setBounds(42, 73, 57, 37);
		panelKOL.add(lblsocialmedia);
		lblsocialmedia.setIcon(new ImageIcon(img_social));
		
		JLabel lblSocialAccount = new JLabel("Social account");
		lblSocialAccount.setBounds(75, 73, 103, 26);
		panelKOL.add(lblSocialAccount);
		lblSocialAccount.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		lblSocialAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblSocialAccount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSocialAccount.setForeground(new Color(255, 255, 255));
		
		
	
		btnSM.setForeground(Color.WHITE);
		btnSM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSM.setContentAreaFilled(false);
		btnSM.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, Color.BLACK, null));
		btnSM.setBackground(new Color(33, 33, 33));
		btnSM.setBounds(22, 73, 168, 37);
		panelKOL.add(btnSM);
		
		JLabel lblBankAccounts = new JLabel("bank accounts");
		lblBankAccounts.setBounds(87, 126, 103, 26);
		panelKOL.add(lblBankAccounts);
		lblBankAccounts.setHorizontalAlignment(SwingConstants.CENTER);
		lblBankAccounts.setForeground(Color.WHITE);
		lblBankAccounts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		
		JLabel lblBank = new JLabel("");
		lblBank.setBounds(42, 121, 39, 31);
		panelKOL.add(lblBank);
		lblBank.setIcon(new ImageIcon(img_mony));
		
		
		btnBA.setForeground(Color.WHITE);
		btnBA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBA.setContentAreaFilled(false);
		btnBA.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, Color.BLACK, null));
		btnBA.setBackground(new Color(33, 33, 33));
		btnBA.setBounds(22, 121, 168, 37);
		panelKOL.add(btnBA);
		
		JLabel lblPayemntCard = new JLabel("Payemnt card");
		lblPayemntCard.setBounds(87, 169, 103, 26);
		panelKOL.add(lblPayemntCard);
		lblPayemntCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayemntCard.setForeground(Color.WHITE);
		lblPayemntCard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblpaymentcard = new JLabel("");
		lblpaymentcard.setBounds(42, 169, 36, 26);
		panelKOL.add(lblpaymentcard);
		lblpaymentcard.setIcon(new ImageIcon(img_card));
		
		
		btnPC.setForeground(Color.WHITE);
		btnPC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPC.setContentAreaFilled(false);
		btnPC.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, Color.BLACK, null));
		btnPC.setBackground(new Color(33, 33, 33));
		btnPC.setBounds(22, 169, 168, 37);
		panelKOL.add(btnPC);
		
		
		btnW.setForeground(Color.WHITE);
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnW.setContentAreaFilled(false);
		btnW.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, Color.BLACK, null));
		btnW.setBackground(new Color(33, 33, 33));
		btnW.setBounds(22, 217, 168, 37);
		panelKOL.add(btnW);
		
		JLabel lblWifi = new JLabel("");
		lblWifi.setBounds(40, 217, 48, 26);
		panelKOL.add(lblWifi);
		lblWifi.setIcon(new ImageIcon(img_wifi));
		
		JLabel lblWifi_1 = new JLabel("Wifi");
		lblWifi_1.setBounds(87, 217, 103, 26);
		panelKOL.add(lblWifi_1);
		lblWifi_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWifi_1.setForeground(Color.WHITE);
		lblWifi_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/*panelGrid.setLayout(grid);*/
		
		final JLabel lbl_Close = new JLabel("X");
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
		lbl_Close.setBounds(848, 11, 23, 20);
		panel.add(lbl_Close);
		lbl_Close.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Close.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_Close.setForeground(Color.white);
		
		final JLabel lbl_Minimize = new JLabel("-");
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
		lbl_Minimize.setBounds(822, 11, 23, 20);
		panel.add(lbl_Minimize);
		lbl_Minimize.setFont(new Font("Tahoma", Font.BOLD, 23));
		lbl_Minimize.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Minimize.setForeground(Color.white);
		
		JButton btnplus = new JButton("");
		btnplus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(verif.getText()=="SA"){
					panelGrid.setVisible(false);
					pnlAdd.setVisible(true);
					pnlAdd.txtAdd.setEnabled(true);
					pnlAdd.txtLink.setEnabled(true);
					pnlAdd.txtPassword.setEnabled(true);
					pnlAdd.txtBankName.setEnabled(false);
					pnlAdd.txtRibb.setEnabled(false);
					pnlAdd.txtNumCard.setEnabled(false);
					pnlAdd.txtDateExp.setEnabled(false);
					pnlAdd.txtCVC.setEnabled(false);
					pnlAdd.TxtOperator.setEnabled(false);
					pnlAdd.TxtMotPasse.setEnabled(false);
					pnlAdd.lblPassword.setForeground(Color.white);
					pnlAdd.lblLink.setForeground(Color.white);
					pnlAdd.lblAdress.setForeground(Color.white);
					pnlAdd.lblBankName.setForeground(new Color(33,33,33));
					pnlAdd.lblRib.setForeground(new Color(33,33,33));
					pnlAdd.lblCvc.setForeground(new Color(33,33,33));
					pnlAdd.lblMotPasse.setForeground(new Color(33,33,33));
					pnlAdd.lblNumcard.setForeground(new Color(33,33,33));
					pnlAdd.lblOperateur.setForeground(new Color(33,33,33));
					pnlAdd.lblPassword.setForeground(new Color(33,33,33));
					pnlAdd.lblDateexp.setForeground(new Color(33,33,33));
					
					
					
					pnlAdd.txtAdd.setBackground(new Color(255,255,255));
					pnlAdd.txtLink.setBackground(new Color(255,255,255));
					pnlAdd.txtPassword.setBackground(new Color(255,255,255));
					pnlAdd.txtBankName.setBackground(new Color(33,33,33));
					pnlAdd.txtRibb.setBackground(new Color(33,33,33));
					pnlAdd.txtNumCard.setBackground(new Color(33,33,33));
					pnlAdd.txtDateExp.setBackground(new Color(33,33,33));
					pnlAdd.txtCVC.setBackground(new Color(33,33,33));
					pnlAdd.TxtOperator.setBackground(new Color(33,33,33));
					pnlAdd.TxtMotPasse.setBackground(new Color(33,33,33));
				}
			
					
					
					
					/*panelGrid.setVisible(false);
					pnlAdd.setVisible(true);
					pnlAdd.Visibilite(pnlAdd.getTxtBankName(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtRib(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtDateExp(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtnumCard(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtCVC(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtOperator(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtPasswordd(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtLink(),true);
					pnlAdd.Visibilite(pnlAdd.getTxtPassword(),true);
					pnlAdd.Visibilite(pnlAdd.getTxtAdd(),true);
					pnlAdd.btn();
					pnlAdd.lblPassword.setForeground(Color.white);
					pnlAdd.lblLink.setForeground(Color.white);
					pnlAdd.lblAdress.setForeground(Color.white);
				/*	pnlAdd.btnSaveSA.setEnabled(true);
					pnlAdd.btnSaveSA.setVisible(true);
					pnlAdd.btnSavePC.setEnabled(false);
					pnlAdd.btnSaveBA.setEnabled(false);*/
					
					/*pnlAdd.btnWifi.setEnabled(false);
					pnlAdd.btnSaveBA.setVisible(false);
					pnlAdd.btnSavePC.setVisible(false);
					pnlAdd.btnWifi.setVisible(false);*/
					
					/*pnlAdd.btnWifi.setBackground(new Color(33,33,33));*/
					
					/*pnlAdd.btnSaveBA.setBackground(new Color(33,33,33));*/
					
					
					
					
				
				
				
				
				
				else if(verif.getText()=="BA"){
					panelGrid.setVisible(false);
					pnlAdd.setVisible(true);
					pnlAdd.txtAdd.setEnabled(false);
					pnlAdd.txtLink.setEnabled(false);
					pnlAdd.txtPassword.setEnabled(false);
					pnlAdd.txtBankName.setEnabled(true);
					pnlAdd.txtRibb.setEnabled(true);
					pnlAdd.txtNumCard.setEnabled(false);
					pnlAdd.txtDateExp.setEnabled(false);
					pnlAdd.txtCVC.setEnabled(false);
					pnlAdd.TxtOperator.setEnabled(false);
					pnlAdd.TxtMotPasse.setEnabled(false);
					pnlAdd.lblPassword.setForeground(new Color(33,33,33));
					pnlAdd.lblLink.setForeground(new Color(33,33,33));
					pnlAdd.lblAdress.setForeground(new Color(33,33,33));
					pnlAdd.lblBankName.setForeground(Color.white);
					pnlAdd.lblRib.setForeground(Color.white);
					pnlAdd.lblCvc.setForeground(new Color(33,33,33));
					pnlAdd.lblMotPasse.setForeground(new Color(33,33,33));
					pnlAdd.lblNumcard.setForeground(new Color(33,33,33));
					pnlAdd.lblOperateur.setForeground(new Color(33,33,33));
					pnlAdd.lblPassword.setForeground(new Color(33,33,33));
					pnlAdd.lblDateexp.setForeground(new Color(33,33,33));
					
					
					pnlAdd.txtAdd.setBackground(new Color(33,33,33));
					pnlAdd.txtLink.setBackground(new Color(33,33,33));
					pnlAdd.txtPassword.setBackground(new Color(33,33,33));
					pnlAdd.txtBankName.setBackground(new Color(255,255,255));
					pnlAdd.txtRibb.setBackground(new Color(255,255,255));
					pnlAdd.txtNumCard.setBackground(new Color(33,33,33));
					pnlAdd.txtDateExp.setBackground(new Color(33,33,33));
					pnlAdd.txtCVC.setBackground(new Color(33,33,33));
					pnlAdd.TxtOperator.setBackground(new Color(33,33,33));
					pnlAdd.TxtMotPasse.setBackground(new Color(33,33,33));
					
					
					
					/*pnlAdd.Visibilite(pnlAdd.getTxtDateExp(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtnumCard(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtCVC(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtOperator(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtPasswordd(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtLink(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtPassword(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtAdd(),false);
					pnlAdd.Visibilite(pnlAdd.getTxtBankName(),true);
					pnlAdd.Visibilite(pnlAdd.getTxtRib(),true);
					pnlAdd.btn();
					
					pnlAdd.lblRib.setForeground(Color.white);
					pnlAdd.lblBankName.setForeground(Color.white);
					/*pnlAdd.btnSaveSa().setEnabled(false);
					pnlAdd.btnWifi.setEnabled(false);
					pnlAdd.btnSavePC.setEnabled(false);
					pnlAdd.btnSaveBA.setEnabled(true);
					pnlAdd.btnSaveBA.setVisible(true);
					pnlAdd.btnSavePC.setVisible(false);
					pnlAdd.btnWifi.setVisible(false);
					pnlAdd.btnSaveSa().setVisible(false);*/
					
					
					/*pnlAdd.btnWifi.setBackground(new Color(33,33,33));*/
					
					
					/*pnlAdd.btnSaveBA.setBackground(new Color(33,33,33));*/
					
					
					
					
				}
				else if(verif.getText()=="PC"){
					panelGrid.setVisible(false);
					pnlAdd.setVisible(true);
					pnlAdd.txtAdd.setEnabled(false);
					pnlAdd.txtLink.setEnabled(false);
					pnlAdd.txtPassword.setEnabled(false);
					pnlAdd.txtBankName.setEnabled(false);
					pnlAdd.txtRibb.setEnabled(false);
					pnlAdd.txtNumCard.setEnabled(true);
					pnlAdd.txtDateExp.setEnabled(true);
					pnlAdd.txtCVC.setEnabled(true);
					pnlAdd.TxtOperator.setEnabled(false);
					pnlAdd.TxtMotPasse.setEnabled(false);
					pnlAdd.lblPassword.setForeground(new Color(33,33,33));
					pnlAdd.lblLink.setForeground(new Color(33,33,33));
					pnlAdd.lblAdress.setForeground(new Color(33,33,33));
					pnlAdd.lblBankName.setForeground(new Color(33,33,33));
					pnlAdd.lblRib.setForeground(new Color(33,33,33));
					pnlAdd.lblCvc.setForeground(Color.white);
					pnlAdd.lblMotPasse.setForeground(new Color(33,33,33));
					pnlAdd.lblNumcard.setForeground(Color.white);
					pnlAdd.lblOperateur.setForeground(new Color(33,33,33));
					pnlAdd.lblPassword.setForeground(new Color(33,33,33));
					pnlAdd.lblDateexp.setForeground(Color.white);
					
					
					pnlAdd.txtAdd.setBackground(new Color(33,33,33));
					pnlAdd.txtLink.setBackground(new Color(33,33,33));
					pnlAdd.txtPassword.setBackground(new Color(33,33,33));
					pnlAdd.txtBankName.setBackground(new Color(33,33,33));
					pnlAdd.txtRibb.setBackground(new Color(33,33,33));
					pnlAdd.txtNumCard.setBackground(Color.white);
					pnlAdd.txtDateExp.setBackground(Color.white);
					pnlAdd.txtCVC.setBackground(Color.white);
					pnlAdd.TxtOperator.setBackground(new Color(33,33,33));
					pnlAdd.TxtMotPasse.setBackground(new Color(33,33,33));
				}
				else if(verif.getText()=="W"){
					panelGrid.setVisible(false);
					pnlAdd.setVisible(true);
					pnlAdd.txtAdd.setEnabled(false);
					pnlAdd.txtLink.setEnabled(false);
					pnlAdd.txtPassword.setEnabled(false);
					pnlAdd.txtBankName.setEnabled(false);
					pnlAdd.txtRibb.setEnabled(false);
					pnlAdd.txtNumCard.setEnabled(false);
					pnlAdd.txtDateExp.setEnabled(false);
					pnlAdd.txtCVC.setEnabled(false);
					pnlAdd.TxtOperator.setEnabled(true);
					pnlAdd.TxtMotPasse.setEnabled(true);
					pnlAdd.lblPassword.setForeground(new Color(33,33,33));
					pnlAdd.lblLink.setForeground(new Color(33,33,33));
					pnlAdd.lblAdress.setForeground(new Color(33,33,33));
					pnlAdd.lblBankName.setForeground(new Color(33,33,33));
					pnlAdd.lblRib.setForeground(new Color(33,33,33));
					pnlAdd.lblCvc.setForeground(new Color(33,33,33));
					pnlAdd.lblMotPasse.setForeground(Color.white);
					pnlAdd.lblNumcard.setForeground(new Color(33,33,33));
					pnlAdd.lblOperateur.setForeground(Color.white);
					pnlAdd.lblPassword.setForeground(new Color(33,33,33));
					pnlAdd.lblDateexp.setForeground(Color.white);
					
					
					pnlAdd.txtAdd.setBackground(new Color(33,33,33));
					pnlAdd.txtLink.setBackground(new Color(33,33,33));
					pnlAdd.txtPassword.setBackground(new Color(33,33,33));
					pnlAdd.txtBankName.setBackground(new Color(33,33,33));
					pnlAdd.txtRibb.setBackground(new Color(33,33,33));
					pnlAdd.txtNumCard.setBackground(new Color(33,33,33));
					pnlAdd.txtDateExp.setBackground(new Color(33,33,33));
					pnlAdd.txtCVC.setBackground(new Color(33,33,33));
					pnlAdd.TxtOperator.setBackground(Color.white);
					pnlAdd.TxtMotPasse.setBackground(Color.white);
					
				}
				
			}
		});
		btnplus.setBorder(null);
		btnplus.setBackground(new Color(33,33,33));
		
		btnplus.setBounds(799, 382, 61, 55);
		btnplus.setIcon(new ImageIcon(img_plus));
		panel.add(btnplus);
		panel.add(pnlAdd);
		pnlAdd.setVisible(false);
		
		panelGrid.setBounds(210, 61, 635, 308);
		
		panelGrid.setBackground(new Color(33,33,33));
		panelGrid.setLayout(new GridLayout(3,4,10,10));
		
		 verif = new JLabel("");
		verif.setBounds(637, 402, 58, 52);
		panel.add(verif);
		
		JLabel lblverif = new JLabel("");
		lblverif.setBounds(627, 423, 46, 14);
		panel.add(lblverif);
		btnplus.setIcon(new ImageIcon(img_plus));
		
		JButton button = new JButton("");
		button.setOpaque(false);
		button.setBorder(null);
		button.setBackground(new Color(33, 33, 33));
		button.setBounds(717, 382, 68, 55);
		panel.add(button);
		button.setIcon(new ImageIcon(img_moins));
		
		/*panelGrid.setVisible(false);*/
		
		
		

	}
}
	