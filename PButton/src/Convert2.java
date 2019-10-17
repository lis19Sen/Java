import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
public class Convert2 extends JFrame implements ActionListener
{

	private JButton convert;
	private JLabel labelHuman;
	private JLabel labelDog;
	private JPanel back;
	private JTextField textHuman;
	private JTextField textDog;
	
	public Convert2() {
		
		labelHuman = new JLabel("Human Years");
		textHuman = new JTextField(10);
		labelDog = new JLabel("Dog Year");
		textDog = new JTextField(10);
		convert = new JButton("Convert");
		back = new JPanel();
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(labelHuman);
		cp.add(textHuman);
		cp.add(convert);
		cp.add(labelDog);
		cp.add(textDog);
		textHuman.requestFocus();
		convert.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String humanYear = textHuman.getText();
		int human = Integer.parseInt(humanYear);
		int dogYear = human * 7;
		String dogYears = Integer.toString(dogYear);
		textDog.setText(dogYears);
				
	}



}
