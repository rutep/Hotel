package hotelApp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTable;

public class Afrit extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Afrit dialog = new Afrit();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Afrit() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblEnjoyYourStay = new JLabel("Enjoy your stay!");
		lblEnjoyYourStay.setBounds(337, 203, 87, 14);
		contentPanel.add(lblEnjoyYourStay);
		{
			JLabel lblNafn = new JLabel("Nafn:");
			lblNafn.setBounds(10, 11, 46, 14);
			contentPanel.add(lblNafn);
		}
		{
			JLabel label = new JLabel("");
			label.setBounds(66, 11, 46, 14);
			contentPanel.add(label);
			label.setText(loginFrame.gestur.getName());
		}
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				getRootPane().setDefaultButton(cancelButton);
			}
			
			
			{
				JButton printButton = new JButton("Print");
				printButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						
					/*	try {
							contentPanel.print();
						}
						catch(java.awt.print.PrinterException e) {
							System.err.format("No printer found", e .getMessage());
						}*/
					}
				});
				printButton.setActionCommand("Print");
				buttonPane.add(printButton);
			}
		}
	}
}
