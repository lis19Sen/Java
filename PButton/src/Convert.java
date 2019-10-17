import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Convert extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Convert frame = new Convert();
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
	public Convert() {
		setTitle("Convert");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		JTextField textField1 = new JTextField();
		textField1.setBounds(82, 26, 50, 23);
	    contentPane.add(textField1);
	    
	   JTextField textField2 = new JTextField();
	    textField2.setBounds(341, 27, 70, 20);
	    contentPane.add(textField2);
	    
	    
	    JLabel lblNewLabel = new JLabel("Dog years");
	    lblNewLabel.setBounds(10, 30, 62, 14);
	    contentPane.add(lblNewLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("Human Years");
	    lblNewLabel_1.setBounds(270, 30, 89, 14);
	    contentPane.add(lblNewLabel_1);
	    
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dogYear = textField1.getText();
				double x = Double.parseDouble(dogYear);
				double y = x * 7;
				textField2.setText(String.valueOf(y));			
			}
			
		});
		
		btnNewButton.setBounds(163, 26, 89, 23);
		contentPane.add(btnNewButton);
	    
	    JButton btnExit = new JButton("Exit");
	    btnExit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		System.exit(0);
	    	}
	    });
	    btnExit.setBounds(163, 178, 89, 23);
	    contentPane.add(btnExit);
	}
}