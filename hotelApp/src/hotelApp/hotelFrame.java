package hotelApp;
import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
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

public class hotelFrame {
	
	
	private JFrame frame;
	private JTextField searchField;
	private JTextField textField;
	private Controller controller = new Controller();
	private JTable table;
	
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
	 * 
	 * @param object
	 */
	public void addRow(Hotel h)
	{	
		listModel = new DefaultListModel();
	    Object[] objects = new Object[]{h.getHotelId(), h.getName()};
	    DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
	    tableModel.addRow(objects);
	}
	
	/** 
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(200, 238, 244));
		frame.getContentPane().setLayout(null);
		
		searchField = new JTextField();
		searchField.setBounds(106, 11, 267, 34);
		frame.getContentPane().add(searchField);
		searchField.setColumns(10);
		
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(searchField.getText());
				// ************* P�tur *********
				// Laga nafn � h�tel class � H�tel
				Hotel hotel = new Hotel(searchField.getText());
				Object[] res = controller.search(hotel);
				System.out.println(((Hotel) res[0]).getName());
				searchField.setText("");
				// *****************************
			}
		});
		
		searchButton.setBounds(394, 11, 89, 34);
		frame.getContentPane().add(searchButton);
		
		JCheckBox chckbxFreeWifi = new JCheckBox("Free WiFi");
		chckbxFreeWifi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFreeWifi.isSelected()) {
					System.out.println("Free Wifi is selected");
				}
				else System.out.println("Free Wifi is not selected");
			}
		});
		chckbxFreeWifi.setBounds(6, 85, 97, 23);
		frame.getContentPane().add(chckbxFreeWifi);
		
		
		JCheckBox chckbxBreakfast = new JCheckBox("Breakfast");
		chckbxBreakfast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBreakfast.isSelected()) {
					System.out.println("Breakfast is selected");
				}
				else System.out.println("Breakfast is not selected");
			}
		});
		chckbxBreakfast.setBounds(6, 111, 97, 23);
		frame.getContentPane().add(chckbxBreakfast);
		
		JCheckBox chckbxSingleBed = new JCheckBox("Single Bed");
		chckbxSingleBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSingleBed.isSelected()) {
					System.out.println("Single bed is selected");
				}
				else System.out.println("Single bed is not selected");
			}
		});
		chckbxSingleBed.setBounds(106, 163, 97, 23);
		frame.getContentPane().add(chckbxSingleBed);
		
		JCheckBox chckbxDoubleBed = new JCheckBox("Double Bed");
		chckbxDoubleBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxDoubleBed.isSelected()) {
					System.out.println("Double bed is selected");
				}
				else System.out.println("Double bed is not selected");
			}
		});
		chckbxDoubleBed.setBounds(106, 189, 97, 23);
		frame.getContentPane().add(chckbxDoubleBed);
		
		JCheckBox chckbxGym = new JCheckBox("Gym");
		chckbxGym.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxGym.isSelected()) {
					System.out.println("Gym is selected");
				}
				else System.out.println("Gym is not selected");
			}
		});
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
		chckbxSpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpa.isSelected()) {
					System.out.println("Spa is selected");
				}
				else System.out.println("Spa is not selected");
			}
		});
		chckbxSpa.setBounds(6, 189, 97, 23);
		frame.getContentPane().add(chckbxSpa);
		
		JCheckBox chckbxPool = new JCheckBox("Pool");
		chckbxPool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPool.isSelected()) {
					System.out.println("Pool is selected");
				}
				else System.out.println("Pool is not selected");
			}
		});
		chckbxPool.setBounds(106, 215, 97, 23);
		frame.getContentPane().add(chckbxPool);
		
		JCheckBox chckbxCarParking = new JCheckBox("Car Parking");
		chckbxCarParking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCarParking.isSelected()) {
					System.out.println("Car parking is selected");
				}
				else System.out.println("Car parking is not selected");
			}
		});
		chckbxCarParking.setBounds(106, 111, 97, 23);
		frame.getContentPane().add(chckbxCarParking);
		
		JCheckBox chckbxVegan = new JCheckBox("Vegan");
		chckbxVegan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxVegan.isSelected()) {
					System.out.println("Vegan is selected");
				}
				else System.out.println("Vegan is not selected");
			}
		});
		chckbxVegan.setBounds(106, 137, 97, 23);
		frame.getContentPane().add(chckbxVegan);
		
		JCheckBox chckbxHandicappedAccess = new JCheckBox("Handicapped Access");
		chckbxHandicappedAccess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHandicappedAccess.isSelected()) {
					System.out.println("Handicapped Access is selected");
				}
				else System.out.println("Handicapped Access is not selected");
			}
		});
		chckbxHandicappedAccess.setBounds(106, 85, 135, 23);
		frame.getContentPane().add(chckbxHandicappedAccess);
		
		JCheckBox chckbxPetsAllowed = new JCheckBox("Pets Allowed");
		chckbxPetsAllowed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPetsAllowed.isSelected()) {
					System.out.println("Pets Allowed is selected");
				}
				else System.out.println("Pets Allowed is not selected");
			}
		});
		chckbxPetsAllowed.setBounds(6, 215, 97, 23);
		frame.getContentPane().add(chckbxPetsAllowed);
		
		JCheckBox chckbxSuite = new JCheckBox("Suite");
		chckbxSuite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSuite.isSelected()) {
					System.out.println("Suite is selected");
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
		
		
		DefaultListModel model = new DefaultListModel();
		JList resultFrame = new JList(model);
		resultFrame.setBounds(232, 163, 278, 150);
		frame.getContentPane().add(resultFrame);
		
		JLabel lblSortBy = new JLabel("Sort by:");
		lblSortBy.setBounds(130, 59, 46, 14);
		frame.getContentPane().add(lblSortBy);
		frame.setBounds(100, 100, 536, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
