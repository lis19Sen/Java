package pmanulbox;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SimpleGUI extends JFrame implements ActionListener
{

	private JButton yes;
	private JButton no;
	private JLabel label;
	private JPanel back;
	private JTextArea text;
	
	public SimpleGUI()
	{
		yes = new JButton("Yes");
		no = new JButton("No");
		label = new JLabel("Click for yes or no");
		back = new JPanel();
		text = new JTextArea(10,10);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		//add the buttons to the panel
		back.add(yes);
		back.add(no);
		cp.add(text);
		cp.add(label);
		cp.add(back);
		yes.addActionListener(this);
		no.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == no)
		{
			text.append("No button pressed\n");
			
		}
		else
		{
			text.append("Yes was pressed\n");
		}
	}
}
