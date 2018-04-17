package hotelApp;
import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.management.modelmbean.ModelMBean;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ChangeEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class hotelFrame {
	
	
	private JFrame frame;
	private JTextField searchField;
	private JTextField textField;
	private Controller controller = new Controller();
	private JTable table;
	private JSlider slider;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private DefaultListModel model;
	public static HotelLeit hotel = new HotelLeit();
	private JTable table_1;
	private DefaultTableModel model_2;
	
	
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
	
	private void leit() {
		// ************* Pétur *********
		// Laga nafn á hótel class í Hótel
		hotel.setName(searchField.getText());
		Object[] res = controller.search(hotel);
		searchField.setText("");
		// *****************************
		model.clear();
		for(int i = 0; i < res.length; i++) model.add(i, ((Hotel)res[i]).getName());
		// *****************************
		
		table_1.setModel(new DefaultTableModel());
		model_2 = (DefaultTableModel) table_1.getModel();
		model_2.setColumnIdentifiers(new String[]{"Name", ""});
		for(int i = 0; i < res.length; i++) model_2.addRow(new String[] {((Hotel)res[i]).getName(), ""});
		
	}
	
	/** 
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(200, 238, 244));
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(521, 161, 190, 153);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		model = new DefaultListModel();
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(226, 159, 267, 159);
	    frame.getContentPane().add(scrollPane);
	    JList resultFrame = new JList(model);
	    scrollPane.setViewportView(resultFrame);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		searchField = new JTextField();
		searchField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == 10) {
					leit();
				}
			}
		});
		
		searchField.setBounds(106, 11, 267, 34);
		frame.getContentPane().add(searchField);
		searchField.setColumns(10);
		
		
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				leit();
				
			}
		});
		
		searchButton.setBounds(394, 11, 89, 34);
		frame.getContentPane().add(searchButton);
		
		JCheckBox chckbxFreeWifi = new JCheckBox("Free WiFi");
		chckbxFreeWifi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFreeWifi.isSelected()) {
					hotel.setWifi(true);
				}
				else {
					hotel.setWifi(false);
				}
			}
		});
		chckbxFreeWifi.setBounds(6, 85, 97, 23);
		frame.getContentPane().add(chckbxFreeWifi);
		
		
		JCheckBox chckbxBreakfast = new JCheckBox("Breakfast");
		chckbxBreakfast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBreakfast.isSelected()) {
					hotel.setBreakfast(true);
				}
				else {
					hotel.setBreakfast(false);
				}
			}
		});
		chckbxBreakfast.setBounds(6, 111, 97, 23);
		frame.getContentPane().add(chckbxBreakfast);
		
		JCheckBox chckbxSingleBed = new JCheckBox("Single Bed");
		chckbxSingleBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSingleBed.isSelected()) {
					System.out.println("Single bed is selected");
					// Þarf að kóða hér, Haukur
				}
				else {
					System.out.println("Single bed is not selected");
					// Þarf að kóða hér, Haukur
				}
			}
		});
		chckbxSingleBed.setBounds(106, 163, 97, 23);
		frame.getContentPane().add(chckbxSingleBed);
		
		JCheckBox chckbxDoubleBed = new JCheckBox("Double Bed");
		chckbxDoubleBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxDoubleBed.isSelected()) {
					System.out.println("Double bed is selected");
					// Þarf að kóða hér, Haukur
				}
				else {
					System.out.println("Double bed is not selected");
					// Þarf að kóða hér, Haukur
				}
			}
		});
		chckbxDoubleBed.setBounds(106, 189, 97, 23);
		frame.getContentPane().add(chckbxDoubleBed);
		
		JCheckBox chckbxGym = new JCheckBox("Gym");
		chckbxGym.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxGym.isSelected()) {
					hotel.setGym(true);
				}
				else {
					hotel.setGym(false);
				}
			}
		});
		chckbxGym.setBounds(6, 163, 97, 23);
		frame.getContentPane().add(chckbxGym);
		
		slider = new JSlider(1,5,5);

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int x = slider.getValue();
				hotel.setStars(x);				
			}
		});
		slider.setBounds(261, 100, 200, 26);

		slider.setMinorTickSpacing(1);
		//slider.setMinimum(1);
		//slider.setMaximum(5);
		//slider.setValue(5);
		slider.setSnapToTicks(true);
		slider.setMajorTickSpacing(5);
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
		chckbxSpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpa.isSelected()) {
					hotel.setSpa(true);
				}
				else {
					hotel.setSpa(false);
				}
			}
		});
		chckbxSpa.setBounds(6, 189, 97, 23);
		frame.getContentPane().add(chckbxSpa);
		
		JCheckBox chckbxPool = new JCheckBox("Pool");
		chckbxPool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPool.isSelected()) {
					hotel.setPool(true);
				}
				else {
					hotel.setPool(false);
				}
			}
		});
		chckbxPool.setBounds(106, 215, 97, 23);
		frame.getContentPane().add(chckbxPool);
		
		JCheckBox chckbxCarParking = new JCheckBox("Car Parking");
		chckbxCarParking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCarParking.isSelected()) {
					hotel.setCarParking(true);
				}
				else {
					hotel.setCarParking(false);
				}
			}
		});
		chckbxCarParking.setBounds(106, 111, 97, 23);
		frame.getContentPane().add(chckbxCarParking);
		
		JCheckBox chckbxVegan = new JCheckBox("Vegan");
		chckbxVegan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxVegan.isSelected()) {
					hotel.setVegan(true);
				}
				else {
					hotel.setVegan(false);
				}
			}
		});
		chckbxVegan.setBounds(106, 137, 97, 23);
		frame.getContentPane().add(chckbxVegan);
		
		JCheckBox chckbxHandicappedAccess = new JCheckBox("Handicapped Access");
		chckbxHandicappedAccess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHandicappedAccess.isSelected()) {
					hotel.setHandicapped(true);
				}
				else {
					hotel.setHandicapped(false);
				}
			}
		});
		chckbxHandicappedAccess.setBounds(106, 85, 135, 23);
		frame.getContentPane().add(chckbxHandicappedAccess);
		
		JCheckBox chckbxPetsAllowed = new JCheckBox("Pets Allowed");
		chckbxPetsAllowed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPetsAllowed.isSelected()) {
					System.out.println("Pets Allowed is selected");
					// ÞARF AÐ BUA TIL BREYTU, SETTER OG GETTER I HOTEL
					//hotel.setPets(true;)
				}
				else {
					System.out.println("Pets Allowed is not selected");
					// ÞARF AÐ BÚA TIL BREYTU, SETTER OG GETTER I HOTEL
					//hotel.setPets(false);
				}
			}
		});
		chckbxPetsAllowed.setBounds(6, 215, 97, 23);
		frame.getContentPane().add(chckbxPetsAllowed);
		
		JCheckBox chckbxSuite = new JCheckBox("Suite");
		chckbxSuite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSuite.isSelected()) {
					//Þarf að kóða hér
				}
				else System.out.println("Suite is not selected");
			}
		});
		chckbxSuite.setBounds(6, 137, 97, 23);
		frame.getContentPane().add(chckbxSuite);
		
		JButton btnRaa = new JButton("Price");
		btnRaa.setBounds(261, 56, 75, 23);
		frame.getContentPane().add(btnRaa);
		
		JButton btnStars = new JButton("Stars");
		btnStars.setBounds(186, 56, 69, 23);
		frame.getContentPane().add(btnStars);
		
		
		
		JLabel lblSortBy = new JLabel("Sort by:");
		lblSortBy.setBounds(130, 59, 46, 14);
		frame.getContentPane().add(lblSortBy);
		
		JRadioButton rdbtnSingleBed = new JRadioButton("Single bed");
		rdbtnSingleBed.setSelected(true);
		rdbtnSingleBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSingleBed.isSelected()) {
					//herbergisTeg = 0;
				}
			}
		});
		buttonGroup.add(rdbtnSingleBed);
		rdbtnSingleBed.setBounds(6, 241, 109, 23);
		frame.getContentPane().add(rdbtnSingleBed);
		
		JRadioButton rdbtnDoubleBed = new JRadioButton("Double bed");
		rdbtnDoubleBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnDoubleBed.isSelected()) {
				//	herbergisTeg = 1;
				}
			}
		});
		buttonGroup.add(rdbtnDoubleBed);
		rdbtnDoubleBed.setBounds(6, 267, 109, 23);
		frame.getContentPane().add(rdbtnDoubleBed);
		
		JRadioButton rdbtnSuite = new JRadioButton("Suite");
		rdbtnSuite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSuite.isSelected()) {
				//	herbergisTeg = 2;
				}
			}
		});
		buttonGroup.add(rdbtnSuite);
		rdbtnSuite.setBounds(6, 293, 109, 23);
		frame.getContentPane().add(rdbtnSuite);
		
		// ÞARF AÐ KLÁRA ÚTFÆRA, VAR AÐ HUGSA UM AÐ SKILA INT BREYTUM, 1,2,3,4,5 EFTIR LANDSVÆÐI OG GÆTUM ÞÁ HAFT DEFAULT 0 MEÐ ÖLLU
		String[] landshlutaList = {"Select an area", "South Iceland", "Western Iceland","North Iceland","East Iceland", "Reykjavík - Capital area"};
		
		JComboBox landshluti = new JComboBox(landshlutaList);
		landshluti.setBounds(6, 56, 114, 22);
		frame.getContentPane().add(landshluti);
		frame.setBounds(100, 100, 738, 363);
		landshluti.setSelectedIndex(0);
		
	
		
		
		
		
		
		
		
	}
}
