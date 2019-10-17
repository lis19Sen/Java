package pmanulbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class OneFrameButton extends JFrame implements ActionListener
{
  JButton button1 = new JButton("Exit");
  public OneFrameButton()
  {
	  super("Sen's frame with exit button");
	  setSize(400,400);
	  setVisible(true);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  //make a panel
	  JPanel panel = new JPanel();
	  panel.add(button1);
	  setContentPane(panel);
	  button1.addActionListener(this);//important
  }
@Override
public void actionPerformed(ActionEvent e) {
	System.out.println(((JButton)e.getSource()).getText());
	System.exit(0);
}
}
