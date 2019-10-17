import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Pizza extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel tm = new DefaultTableModel(
			new Object[][] {}, new String[] { "ID","First Name", "Last Name", "Phone"}
			);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
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
	public Pizza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 396, 239);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Pizza", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Size:");
		lblNewLabel.setBounds(10, 62, 35, 14);
		panel.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Small($5)");
		rdbtnNewRadioButton.setBounds(51, 58, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Medium($10)");
		rdbtnNewRadioButton_1.setBounds(51, 84, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Large($10)");
		rdbtnNewRadioButton_2.setBounds(51, 110, 109, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Top:");
		lblNewLabel_1.setBounds(10, 140, 48, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Beverages", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Special Items", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 35, 324, 148);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "First Name", "Last Name", "Phone"
			}
		));
		scrollPane.setViewportView(table);
		table.setModel(tm);
		drawTable();
	}
	private void drawTable() {
		tm.setRowCount(0);
		for (int i = 0; i < 150; i++)
		{
			Object[] object = new Object[4];
			object[0] = Integer.toString(i+1);
			object[1] = "people.get(i).getFirst()";
			object[2] = "people.get(i).getFirst()";
			object[3] = "people.get(i).getFirst()";
			tm.addRow(object);
		}
	}
}


















