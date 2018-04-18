package hotelApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginFrame extends JFrame {
	private JTextField nafnField;
	private JTextField ssnField;
	public static Guest gestur = new Guest();
	hotelFrame window = new hotelFrame();
	static loginFrame frame = new loginFrame();
				
	
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

	/**
	 * Create the frame.
	 */
	public loginFrame() {
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblFulltNafn = new JLabel("Full name:");
		lblFulltNafn.setBounds(69, 87, 67, 20);
		getContentPane().add(lblFulltNafn);
		
		JLabel lblKennitala = new JLabel("Social security number:");
		lblKennitala.setBounds(10, 118, 111, 26);
		getContentPane().add(lblKennitala);
		
		nafnField = new JTextField();
		nafnField.setBounds(146, 87, 140, 20);
		getContentPane().add(nafnField);
		nafnField.setColumns(10);
		
		ssnField = new JTextField();
		ssnField.setBounds(146, 121, 140, 20);
		getContentPane().add(ssnField);
		ssnField.setColumns(10);
		
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window.setVisible(true);
				String name = nafnField.getText();
				String ssn = ssnField.getText();
				gestur.setName(name);
				gestur.setSsn(ssn);
				System.out.println(name + ", " + ssn);
				frame.setVisible(false);
			}
		});
		btnLogin.setBounds(146, 165, 89, 23);
		getContentPane().add(btnLogin);		

	}
}
