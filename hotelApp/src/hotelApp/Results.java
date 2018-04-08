package hotelApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Results extends JFrame {

	private JPanel contentPane;
	private JTextField txtFleiriFilterar;
	private JTextField txtHrVriHgt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Results frame = new Results();
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
	public Results() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHomePage = new JButton("Til baka");
		btnHomePage.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHomePage.setBounds(330, 7, 94, 23);
		contentPane.add(btnHomePage);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 34, 117, 216);
		contentPane.add(panel);
		
		txtFleiriFilterar = new JTextField();
		txtFleiriFilterar.setText("fleiri filterar");
		panel.add(txtFleiriFilterar);
		txtFleiriFilterar.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(137, 34, 287, 216);
		contentPane.add(panel_1);
		
		JLabel lblBirtumListaAf = new JLabel("Birtum lista af ni\u00F0urst\u00F6\u00F0um h\u00E9r?");
		panel_1.add(lblBirtumListaAf);
		
		JLabel lblLogo = new JLabel("Logo?");
		lblLogo.setBounds(10, 11, 46, 14);
		contentPane.add(lblLogo);
		
		txtHrVriHgt = new JTextField();
		txtHrVriHgt.setText("Takkar til a\u00F0 ra\u00F0a ni\u00F0urst\u00F6\u00F0um");
		txtHrVriHgt.setBounds(49, 8, 271, 20);
		contentPane.add(txtHrVriHgt);
		txtHrVriHgt.setColumns(10);
	}
}
