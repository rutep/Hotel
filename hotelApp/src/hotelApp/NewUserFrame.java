package hotelApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.StringUtils;

import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Bókunar rammi sem sér um að skrá nýjan notenda í kerfið
 */

public class NewUserFrame extends JFrame {

	private JPanel contentPane;
	static Guest[] guest = new Guest[100];
	static int guestIndex = -1;
	JFormattedTextField inpSsn = new JFormattedTextField();
	JFormattedTextField inpUser = new JFormattedTextField();
	JLabel msg = new JLabel("");
	
	
	/**
	 * Notkun: checkGuest(n, ssn)
	 * @param String n
	 * @param String ssn
	 * @return true  ef notendandi er til annars false
	 */
	static boolean checkGuests(String n, String ssn) {
		for (int i = 0; i <= guestIndex; i++) {
			if(guest[i].getName().equals(n) || guest[i].getSsn().equals(ssn)) {
				return true;
			}
		}
		return false;
	}
	
	static boolean checkGuest(String n, String ssn) {
		for (int i = 0; i <= guestIndex; i++) {
			if(guest[i].getName().equals(n) && guest[i].getSsn().equals(ssn)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Notkun: bokun()
	 * Fyrir:
	 * Eftir: Búið er að ná í gögn úr texta field og ath 
	 * 		: Ef gögn standast skorður þá hefur ný notandi verið skráður
	 */
	public void bokun() {
		String user = inpUser.getText();
		String ssn = inpSsn.getText();
		if(checkGuests(user,ssn)) {
			msg.setText("User exists try another user");
			return;
		}
		if(user.length() < 1) {
			msg.setText("");
			msg.setText("User name must be larger then one character");
			return;
		}
		if(ssn.length() < 3) {
			msg.setText("");
			msg.setText("Ssn name must be larger then four numbers");
			return;
		}
		
		if(!StringUtils.isStrictlyNumeric(ssn)){
			msg.setText("");
			msg.setText("Ssn must be integers");
			return;
		}
		Guest tmpGuest = new Guest();
		tmpGuest.setName(user);
		tmpGuest.setSsn(ssn);
		guestIndex++;
		guest[guestIndex] = tmpGuest;
		inpUser.setText("");
		inpSsn.setText("");
		msg.setText("New user booked");
	}
	
	/**
	 * Create the frame.
	 */
	public NewUserFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 * Leifir að íta á enter fyrir inp
		 */
		inpUser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == 10) {
					bokun();
				}
			}
		});
		inpUser.setBounds(226, 82, 119, 26);
		contentPane.add(inpUser);
		inpSsn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == 10) {
					bokun();
				}
			}
		});
		
		
		inpSsn.setBounds(226, 118, 119, 26);
		contentPane.add(inpSsn);
		
		JLabel lblNewLabel = new JLabel("New user:");
		lblNewLabel.setBounds(136, 87, 72, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Social security number:");
		lblNewLabel_1.setBounds(42, 123, 166, 15);
		contentPane.add(lblNewLabel_1);
		
		
		msg.setBounds(75, 27, 341, 15);
		contentPane.add(msg);
		
		/**
		 * Takki fyrir bókun nýss notenda: submit ->  nýr notandi í gagnagrunni.
		 */
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bokun();
			}
		});
		btnSubmit.setBounds(185, 189, 117, 25);
		contentPane.add(btnSubmit);
		
		/**
		 * Takkinn fyrir Back Userframe -> LoginFrame
		 */
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginFrame.userFrame.setVisible(false);
				loginFrame.frame.setVisible(true);
				
			}
		});
		btnBack.setBounds(50, 189, 117, 25);
		contentPane.add(btnBack);
		
		
	}
}
