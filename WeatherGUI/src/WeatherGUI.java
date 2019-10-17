import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class WeatherGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeatherGUI frame = new WeatherGUI();
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
	public WeatherGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnCold = new JRadioButton("cold");
		rdbtnCold.setBounds(42, 15, 50, 23);
		rdbtnCold.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnCold.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(rdbtnCold);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("mild");
		rdbtnNewRadioButton.setBounds(114, 15, 50, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("hot");
		rdbtnNewRadioButton_1.setBounds(189, 16, 50, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("dry");
		rdbtnNewRadioButton_2.setBounds(42, 66, 50, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("wet");
		rdbtnNewRadioButton_3.setBounds(114, 66, 50, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("rain");
		rdbtnNewRadioButton_4.setBounds(42, 111, 50, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("snow");
		rdbtnNewRadioButton_5.setBounds(114, 111, 50, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		textField = new JTextField();
		textField.setBounds(43, 150, 150, 100);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Show Conditions");
		btnNewButton.setBounds(237, 170, 89, 23);
		contentPane.add(btnNewButton);
	}
}
