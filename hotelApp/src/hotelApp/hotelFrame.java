package hotelApp;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import java.awt.Color;
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
	private static Object[] result;
	
	
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
	}
	
	/** 
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(200, 238, 244));
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(221, 166, 632, 280);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(table_1);
		
		
		model = new DefaultListModel();
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
					leit();
				}
				else {
					hotel.setWifi(false);
					leit();
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
					leit();
				}
				else {
					hotel.setBreakfast(false);
					leit();
				}
			}
		});
		chckbxBreakfast.setBounds(6, 111, 97, 23);
		frame.getContentPane().add(chckbxBreakfast);
		
		JCheckBox chckbxGym = new JCheckBox("Gym");
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
		chckbxGym.setBounds(6, 163, 97, 23);
		frame.getContentPane().add(chckbxGym);
		
		slider = new JSlider(1,5,3);

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int x = slider.getValue();
				hotel.setStars(x);
				leit();
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
					leit();
				}
				else {
					hotel.setSpa(false);
					leit();
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
					leit();
				}
				else {
					hotel.setPool(false);
					leit();
				}
			}
		});
		chckbxPool.setBounds(6, 137, 97, 23);
		frame.getContentPane().add(chckbxPool);
		
		JCheckBox chckbxCarParking = new JCheckBox("Car Parking");
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
		chckbxCarParking.setBounds(106, 111, 97, 23);
		frame.getContentPane().add(chckbxCarParking);
		
		JCheckBox chckbxVegan = new JCheckBox("Vegan");
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
		chckbxVegan.setBounds(106, 137, 97, 23);
		frame.getContentPane().add(chckbxVegan);
		
		JCheckBox chckbxHandicappedAccess = new JCheckBox("Handicapped Access");
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
		chckbxHandicappedAccess.setBounds(106, 85, 135, 23);
		frame.getContentPane().add(chckbxHandicappedAccess);
		
		JCheckBox chckbxPetsAllowed = new JCheckBox("Pets Allowed");
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
		chckbxPetsAllowed.setBounds(106, 163, 97, 23);
		frame.getContentPane().add(chckbxPetsAllowed);
		
		JButton btnPrice = new JButton("Price");
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
		btnPrice.setBounds(261, 56, 75, 23);
		frame.getContentPane().add(btnPrice);
		
		JButton btnStars = new JButton("Stars");
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
					hotel.setHerbergisTeg(0);
					leit();
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
					hotel.setHerbergisTeg(1);
					leit();
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
					hotel.setHerbergisTeg(2);
					leit();
				}
			}
		});
		buttonGroup.add(rdbtnSuite);
		rdbtnSuite.setBounds(6, 293, 109, 23);
		frame.getContentPane().add(rdbtnSuite);
		
		// �ARF A� KL�RA �TF�RA, VAR A� HUGSA UM A� SKILA INT BREYTUM, 1,2,3,4,5 EFTIR LANDSV��I OG G�TUM �� HAFT DEFAULT 0 ME� �LLU
		String[] landshlutaList = {"Select an area", "South Iceland", "Western Iceland","North Iceland","East Iceland", "Reykjav�k - Capital area"};
		
		JComboBox landshluti = new JComboBox(landshlutaList);
		landshluti.setBounds(6, 56, 114, 22);
		frame.getContentPane().add(landshluti);
		frame.setBounds(100, 100, 865, 520);
		landshluti.setSelectedIndex(0);
		
		JButton btnBoka = new JButton("B\u00F3ka");
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
				
				
				// ********************************************
				//H�r �arf a� birta ni�urst��ur um b�kun / rafr�n kvittun
				
			}
		});
		btnBoka.setBounds(508, 85, 109, 49);
		frame.getContentPane().add(btnBoka);
		
		JLabel lblWelcome = new JLabel( /* loginFrame.gestur.getName() */ "");
		lblWelcome.setBounds(6, 11, 90, 34);
		frame.getContentPane().add(lblWelcome);
				
		
	}

	public void setVisible(boolean b) {
		hotelFrame window = new hotelFrame();
		window.frame.setVisible(true);
		
	}
}
