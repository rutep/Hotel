package hotelApp;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Window;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
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
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ChangeEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;

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
	private static Object[] result;
	private JButton btnBoka = new JButton("B\u00F3ka");
	public static Afrit boka = new Afrit();
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public hotelFrame() {
		initialize();
	}
	
	private void leit() {

		hotel.setName(searchField.getText());
		Object[] res = controller.search(hotel);
		result = res;
		searchField.setText("");
		
		DefaultTableModel dtm = new DefaultTableModel(0, 0) {
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_1.setModel(dtm);
		model_2 = (DefaultTableModel) table_1.getModel();

		model_2.setColumnIdentifiers(new String[]
				{"Name", "stars", "single room price" , "double room price", "suite price"});
		for(int i = 0; i < res.length; i++) {
			Hotel hotel_res = ((Hotel)res[i]); 
			model_2.addRow(new String[]
					{hotel_res.getName(), 
					 hotel_res.getStars()+ "",
					 hotel_res.getSinglePrice(),
					 hotel_res.getDoublePrice(),
					 hotel_res.getSuitePrice() });
		}

		btnBoka.setEnabled(true);
		
	}
	
	
	/** 
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 230, 140));
		btnBoka.setBounds(221, 98, 109, 49);
		
		
		btnBoka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// **************** Pétur *********************
				 
				int rowIndex = table_1.getSelectedRow();
				
				DefaultTableModel dtm = new DefaultTableModel(0, 0) {
				    public boolean isCellEditable(int row, int column) {
				        return false;
				    }
				};
				table_1.setModel(dtm);
				
				model_2 = (DefaultTableModel) table_1.getModel();
				model_2.setColumnIdentifiers(new String[]
						{"Name", "stars", "single room price" , "double room price", "suite price"});
				
				Hotel hotel_res = ((Hotel)result[rowIndex]); 
				model_2.addRow(new String[]
						{hotel_res.getName(), 
						 hotel_res.getStars()+ "",
						 hotel_res.getSinglePrice(),
						 hotel_res.getDoublePrice(),
						 hotel_res.getSuitePrice() });
				
				btnBoka.setEnabled(false);
				// ********************************************
				//Hér þarf að birta niðurstöður í result glugga
				
			}
		});
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnBoka);
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 205, 841, 280);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(table_1);
		
		
		model = new DefaultListModel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		searchField = new JTextField();
		searchField.setBounds(464, 11, 267, 34);
		searchField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == 10) {
					leit();
				}
			}
		});
		frame.getContentPane().add(searchField);
		searchField.setColumns(10);
		
		
		JButton searchButton = new JButton("Search");
		searchButton.setBounds(743, 10, 89, 34);
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				leit();
			}
		});
		frame.getContentPane().add(searchButton);
		
		JCheckBox chckbxFreeWifi = new JCheckBox("Free WiFi");
		chckbxFreeWifi.setBounds(760, 147, 97, 23);
		chckbxFreeWifi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFreeWifi.isSelected()) {
					hotel.setWifi(true);
					leit();
				}
				else {
					hotel.setWifi(false);
					leit();
				}
			}
		});
		frame.getContentPane().add(chckbxFreeWifi);
		
		
		JCheckBox chckbxBreakfast = new JCheckBox("Breakfast");
		chckbxBreakfast.setBounds(662, 147, 97, 23);
		chckbxBreakfast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBreakfast.isSelected()) {
					hotel.setBreakfast(true);
					leit();
				}
				else {
					hotel.setBreakfast(false);
					leit();
				}
			}
		});
		frame.getContentPane().add(chckbxBreakfast);
		
		
		JCheckBox chckbxGym = new JCheckBox("Gym");
		chckbxGym.setBounds(437, 147, 97, 23);
		chckbxGym.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxGym.isSelected()) {
					hotel.setGym(true);
					leit();
				}
				else {
					hotel.setGym(false);
					leit();
				}
			}
		});
		frame.getContentPane().add(chckbxGym);
		
		slider = new JSlider(1,5,3);
		slider.setBounds(632, 82, 200, 26);

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int x = slider.getValue();
				hotel.setStars(x);
				leit();
			}
		});

		slider.setMinorTickSpacing(1);
		//slider.setMinimum(1);
		//slider.setMaximum(5);
		//slider.setValue(5);
		slider.setSnapToTicks(true);
		slider.setMajorTickSpacing(5);

		frame.getContentPane().add(slider);
		
		JLabel lblMinimumStars = new JLabel("Minimum Stars:");
		lblMinimumStars.setBounds(703, 57, 129, 21);
		frame.getContentPane().add(lblMinimumStars);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(632, 113, 200, 20);

		textField.setText("1            2             3              4                5");

		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxSpa = new JCheckBox("Spa");
		chckbxSpa.setBounds(221, 174, 79, 23);
		chckbxSpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpa.isSelected()) {
					hotel.setSpa(true);
					leit();
				}
				else {
					hotel.setSpa(false);
					leit();
				}
			}
		});
		frame.getContentPane().add(chckbxSpa);
		
		JCheckBox chckbxPool = new JCheckBox("Pool");
		chckbxPool.setBounds(538, 147, 120, 23);
		chckbxPool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPool.isSelected()) {
					hotel.setPool(true);
					leit();
				}
				else {
					hotel.setPool(false);
					leit();
				}
			}
		});
		frame.getContentPane().add(chckbxPool);
		
		JCheckBox chckbxCarParking = new JCheckBox("Car Parking");
		chckbxCarParking.setBounds(538, 174, 120, 23);
		chckbxCarParking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCarParking.isSelected()) {
					hotel.setCarParking(true);
					leit();
				}
				else {
					hotel.setCarParking(false);
					leit();
				}
			}
		});
		frame.getContentPane().add(chckbxCarParking);
		
		JCheckBox chckbxVegan = new JCheckBox("Vegan");
		chckbxVegan.setBounds(437, 174, 97, 23);
		chckbxVegan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxVegan.isSelected()) {
					hotel.setVegan(true);
					leit();
				}
				else {
					hotel.setVegan(false);
					leit();
				}
			}
		});
		frame.getContentPane().add(chckbxVegan);
		
		JCheckBox chckbxHandicappedAccess = new JCheckBox("Handicapped Access");
		chckbxHandicappedAccess.setBounds(662, 174, 191, 23);
		chckbxHandicappedAccess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHandicappedAccess.isSelected()) {
					hotel.setHandicapped(true);
					leit();
				}
				else {
					hotel.setHandicapped(false);
					leit();
				}
			}
		});
		frame.getContentPane().add(chckbxHandicappedAccess);
		
		JCheckBox chckbxPetsAllowed = new JCheckBox("Pets Allowed");
		chckbxPetsAllowed.setBounds(304, 174, 129, 23);
		chckbxPetsAllowed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPetsAllowed.isSelected()) {
					hotel.setPets(true);
					leit();
				}
				else {
					hotel.setPets(false);
					leit();
				}
			}
		});
		frame.getContentPane().add(chckbxPetsAllowed);
		
		JButton btnPrice = new JButton("Price");
		btnPrice.setBounds(523, 85, 75, 23);
		btnPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (hotel.getSortPrice()==false) {
					hotel.setSortPrice(true);
					hotel.setFlokkaHvad("price");
					leit();
				}
				else {
					hotel.setSortPrice(false);
					hotel.setFlokkaHvad("price");
					leit();
				}
			}
		});
		frame.getContentPane().add(btnPrice);
		
		JButton btnStars = new JButton("Stars");
		btnStars.setBounds(427, 85, 89, 23);
		btnStars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (hotel.getSortStars()==false) {
					hotel.setSortStars(true);
					hotel.setFlokkaHvad("stars");
					leit();
				}
				else {
					hotel.setSortStars(false);
					hotel.setFlokkaHvad("stars");
					leit();
				}
			}
		});
		frame.getContentPane().add(btnStars);
		
		
		
		JLabel lblSortBy = new JLabel("Sort by:");
		lblSortBy.setBounds(360, 89, 69, 19);
		frame.getContentPane().add(lblSortBy);
		
		JRadioButton rdbtnSingleBed = new JRadioButton("Single bed");
		rdbtnSingleBed.setBounds(221, 11, 109, 23);
		rdbtnSingleBed.setSelected(true);
		rdbtnSingleBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSingleBed.isSelected()) {
					hotel.setHerbergisTeg(0);
					leit();
				}
			}
		});
		buttonGroup.add(rdbtnSingleBed);
		frame.getContentPane().add(rdbtnSingleBed);
		
		JRadioButton rdbtnDoubleBed = new JRadioButton("Double bed");
		rdbtnDoubleBed.setBounds(221, 33, 109, 23);
		rdbtnDoubleBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnDoubleBed.isSelected()) {
					hotel.setHerbergisTeg(1);
					leit();
				}
			}
		});
		buttonGroup.add(rdbtnDoubleBed);
		frame.getContentPane().add(rdbtnDoubleBed);
		
		JRadioButton rdbtnSuite = new JRadioButton("Suite");
		rdbtnSuite.setBounds(221, 55, 109, 23);
		rdbtnSuite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSuite.isSelected()) {
					hotel.setHerbergisTeg(2);
					leit();
				}
			}
		});
		buttonGroup.add(rdbtnSuite);
		frame.getContentPane().add(rdbtnSuite);
		
		// �ARF A� KL�RA �TF�RA, VAR A� HUGSA UM A� SKILA INT BREYTUM, 1,2,3,4,5 EFTIR LANDSV��I OG G�TUM �� HAFT DEFAULT 0 ME� �LLU
		String[] landshlutaList = {"Select an area", "South Iceland", "Western Iceland","North Iceland","East Iceland", "Reykjavík - Capital area"};
		
		JComboBox landshluti = new JComboBox(landshlutaList);
		landshluti.setBounds(338, 16, 114, 22);
		frame.getContentPane().add(landshluti);
		frame.setBounds(100, 100, 865, 520);
		landshluti.setSelectedIndex(5);
		landshluti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				hotel.setLandshluti((String)cb.getSelectedItem());
			}
		});
		
		
		JLabel lblWelcome = new JLabel( /* loginFrame.gestur.getName() */ "");
		lblWelcome.setBounds(30, 74, 177, 34);
		frame.getContentPane().add(lblWelcome);
		lblWelcome.setText(loginFrame.gestur.getName());		
		
		JLabel msg = new JLabel("New label");
		msg.setBounds(30, 43, 177, 34);
		frame.getContentPane().add(msg);
		msg.setText("Welcome User:");
		
		
		
		JButton btnPrenta = new JButton("Print receipt");
		btnPrenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*				
				try {
					table_1.print();
				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("No printer found", e .getMessage());
				}*/
				
				boka.setVisible(true);
				
			}
		});
		btnPrenta.setBounds(12, 174, 103, 23);
		frame.getContentPane().add(btnPrenta);
		
		leit();
		
		
	}

	public void setVisible(boolean b) {
		hotelFrame window = new hotelFrame();
		window.frame.setVisible(true);
		
	}
}
