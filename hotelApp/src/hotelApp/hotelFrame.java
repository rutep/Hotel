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
		searchField.setBounds(106, 11, 267, 34);
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
		
		searchButton.setBounds(394, 11, 89, 34);
		frame.getContentPane().add(searchButton);
		
		JCheckBox chckbxFreeWifi = new JCheckBox("Free WiFi");
		chckbxFreeWifi.setBounds(6, 85, 97, 23);
		frame.getContentPane().add(chckbxFreeWifi);
		
		JCheckBox chckbxBreakfast = new JCheckBox("Breakfast");
		chckbxBreakfast.setBounds(6, 111, 97, 23);
		frame.getContentPane().add(chckbxBreakfast);
		
		JCheckBox chckbxCarPark = new JCheckBox("Car Park");
		chckbxCarPark.setBounds(6, 137, 97, 23);
		frame.getContentPane().add(chckbxCarPark);
		
		JCheckBox chckbxSingleBed = new JCheckBox("Single Bed");
		chckbxSingleBed.setBounds(106, 163, 97, 23);
		frame.getContentPane().add(chckbxSingleBed);
		
		JCheckBox chckbxDoubleBed = new JCheckBox("Double Bed");
		chckbxDoubleBed.setBounds(106, 189, 97, 23);
		frame.getContentPane().add(chckbxDoubleBed);
		
		JCheckBox chckbxGym = new JCheckBox("Gym");
		chckbxGym.setBounds(6, 163, 97, 23);
		frame.getContentPane().add(chckbxGym);
		
		JSlider slider = new JSlider();
		slider.setBounds(261, 85, 200, 26);
		frame.getContentPane().add(slider);
		
		JLabel lblMinimumStars = new JLabel("Minimum Stars:");
		lblMinimumStars.setBounds(364, 56, 97, 21);
		frame.getContentPane().add(lblMinimumStars);
		
		textField = new JTextField();
		textField.setText("1            2             3              4                5");
		textField.setBounds(261, 112, 202, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxSpa = new JCheckBox("Spa");
		chckbxSpa.setBounds(6, 189, 97, 23);
		frame.getContentPane().add(chckbxSpa);
		
		JCheckBox chckbxPool = new JCheckBox("Pool");
		chckbxPool.setBounds(106, 85, 97, 23);
		frame.getContentPane().add(chckbxPool);
		
		JCheckBox chckbxCarParking = new JCheckBox("Car Parking");
		chckbxCarParking.setBounds(106, 111, 97, 23);
		frame.getContentPane().add(chckbxCarParking);
		
		JCheckBox chckbxVegan = new JCheckBox("Vegan");
		chckbxVegan.setBounds(106, 137, 97, 23);
		frame.getContentPane().add(chckbxVegan);
		
		JCheckBox chckbxHandicappecdAccess = new JCheckBox("Handicappecd Access");
		chckbxHandicappecdAccess.setBounds(6, 241, 135, 23);
		frame.getContentPane().add(chckbxHandicappecdAccess);
		
		JCheckBox chckbxPetsAllowed = new JCheckBox("Pets Allowed");
		chckbxPetsAllowed.setBounds(6, 215, 97, 23);
		frame.getContentPane().add(chckbxPetsAllowed);
		
		JCheckBox chckbxSuite = new JCheckBox("Suite");
		chckbxSuite.setBounds(106, 215, 97, 23);
		frame.getContentPane().add(chckbxSuite);
		
		JButton btnRaa = new JButton("Price");
		btnRaa.setBounds(265, 55, 75, 23);
		frame.getContentPane().add(btnRaa);
		
		JButton btnStars = new JButton("Stars");
		btnStars.setBounds(186, 56, 69, 23);
		frame.getContentPane().add(btnStars);
		frame.setBounds(100, 100, 536, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
