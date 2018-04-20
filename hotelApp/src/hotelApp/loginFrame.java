package hotelApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class loginFrame extends JFrame {
	private JTextField nafnField;
	private JTextField ssnField;
	public static Guest gestur = new Guest();
	static hotelFrame window = new hotelFrame();
	static loginFrame frame = new loginFrame();
	static NewUserFrame userFrame = new NewUserFrame();
	JLabel userExists = new JLabel("");
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void sub() {
		String name = nafnField.getText();
		String ssn = ssnField.getText();
		gestur.setName(name);
		gestur.setSsn(ssn);
		if(NewUserFrame.checkGuest(name, ssn)) {
			frame.setVisible(false);
			window.setVisible(true);
			hotelFrame.lblWelcome.setText(loginFrame.gestur.getName());		
			userExists.setText("");
			return;
		}
		userExists.setText("User does not exist");
	}

	/**
	 * Create the frame.
	 */
	public loginFrame() {
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblFulltNafn = new JLabel("Full name:");
		lblFulltNafn.setBounds(128, 86, 82, 20);
		getContentPane().add(lblFulltNafn);
		
		JLabel lblKennitala = new JLabel("Social security number:");
		lblKennitala.setBounds(44, 118, 166, 26);
		getContentPane().add(lblKennitala);
		
		nafnField = new JTextField();
		nafnField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == 10) {
					sub();
				}
			}
		});
		
		nafnField.setBounds(216, 87, 140, 20);
		getContentPane().add(nafnField);
		nafnField.setColumns(10);
		
		ssnField = new JTextField();
		ssnField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == 10) {
					sub();
				}
			}
		});
		ssnField.setBounds(216, 121, 140, 20);
		getContentPane().add(ssnField);
		ssnField.setColumns(10);
		
		/**
		 * Label fyrir innskráningu
		 */
		
		userExists.setBounds(128, 59, 228, 15);
		getContentPane().add(userExists);
		
		/**
		 * Login takkinn
		 */
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sub();
			}
		});
		btnLogin.setBounds(216, 168, 89, 23);
		getContentPane().add(btnLogin);
		
		JButton btnNewUser = new JButton("New user");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				userFrame.setVisible(true);
			}
		});
		btnNewUser.setBounds(76, 169, 106, 20);
		getContentPane().add(btnNewUser);
		
		

	}
}
