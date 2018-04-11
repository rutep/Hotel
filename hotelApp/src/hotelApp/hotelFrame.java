package hotelApp;
import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JLabel;

public class hotelFrame {

	private JFrame frame;
	private JTextField searchField;
	private JTextField textField;
	private Controller controller = new Controller();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelFrame window = new hotelFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hotelFrame() {
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(144, 238, 144));
		frame.getContentPane().setLayout(null);
		
		searchField = new JTextField();
		searchField.setBounds(85, 61, 267, 34);
		frame.getContentPane().add(searchField);
		searchField.setColumns(10);
		
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(searchField.getText());
				// ************* Pétur *********
				// String leit = searchField.getText();
				// *************
				searchField.setText("");
				
				// DbManager db = new DbManager();
				//try {
					Object[] res = controller.search(new Object[] {searchField.getText()});
					System.out.println((String)res[0]);
					// db.dbTest();
				// } catch (ClassNotFoundException e) {
				 	// TODO Auto-generated catch block
				//	e.printStackTrace();
				// }
			}
		});
		
		searchButton.setBounds(372, 61, 89, 34);
		frame.getContentPane().add(searchButton);
		
		JCheckBox chckbxFreeWifi = new JCheckBox("Free WiFi");
		chckbxFreeWifi.setBounds(28, 142, 97, 23);
		frame.getContentPane().add(chckbxFreeWifi);
		
		JCheckBox chckbxBreakfast = new JCheckBox("Breakfast");
		chckbxBreakfast.setBounds(28, 178, 97, 23);
		frame.getContentPane().add(chckbxBreakfast);
		
		JCheckBox chckbxCarPark = new JCheckBox("Car Park");
		chckbxCarPark.setBounds(28, 217, 97, 23);
		frame.getContentPane().add(chckbxCarPark);
		
		JCheckBox chckbxSingleBed = new JCheckBox("Single Bed");
		chckbxSingleBed.setBounds(144, 142, 97, 23);
		frame.getContentPane().add(chckbxSingleBed);
		
		JCheckBox chckbxDoubleBed = new JCheckBox("Double Bed");
		chckbxDoubleBed.setBounds(144, 178, 97, 23);
		frame.getContentPane().add(chckbxDoubleBed);
		
		JCheckBox chckbxGym = new JCheckBox("Gym");
		chckbxGym.setBounds(144, 217, 97, 23);
		frame.getContentPane().add(chckbxGym);
		
		JSlider slider = new JSlider();
		slider.setBounds(259, 214, 200, 26);
		frame.getContentPane().add(slider);
		
		JLabel lblMinimumStars = new JLabel("Minimum Stars:");
		lblMinimumStars.setBounds(310, 182, 97, 21);
		frame.getContentPane().add(lblMinimumStars);
		
		textField = new JTextField();
		textField.setText("1            2             3              4                5");
		textField.setBounds(259, 251, 202, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxSpa = new JCheckBox("Spa");
		chckbxSpa.setBounds(255, 142, 97, 23);
		frame.getContentPane().add(chckbxSpa);
		frame.setBounds(100, 100, 536, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
