package pnbaplayerstatus;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class PlayersStatusGUI extends JFrame implements ActionListener{

	
	private JPanel contentPane;
    private JButton showButton;
    private JButton exitButton;
    private JLabel firstNameLable;
    private JTextField firstName;
    private JLabel lastNameLable;
    private JTextField lastName;
    private JLabel heightLable;
    private JTextField height;
    private JLabel weightLable;
    private JTextField weight;
    private JLabel ptsLable;
    private JTextField pts;
    private JLabel rebLable;
    private JTextField reb;
    private JLabel astLable;
    private JTextField ast;
    
	public PlayersStatusGUI() {
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);*/
		
		contentPane = new JPanel();
		showButton = new JButton("Show");
		showButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		showButton.setBounds(551, 318, 100, 30);
		exitButton = new JButton("Exit");
		exitButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		exitButton.setSize(100, 30);
		exitButton.setLocation(551, 381);
		lastNameLable = new JLabel("Last Name");
		lastNameLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lastNameLable.setBounds(355, 103, 80, 30);
		lastName = new JTextField(10);
		lastName.setBounds(500, 105, 120, 30);
		heightLable = new JLabel("Height");
		heightLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		heightLable.setBounds(178, 160, 100, 30);
		height = new JTextField(10);
		height.setBounds(324, 162, 100, 30);
		weightLable = new JLabel("Weight");
		weightLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		weightLable.setBounds(178, 218, 100, 30);
		weight = new JTextField(10);
		weight.setBounds(324, 220, 100, 30);
		ptsLable = new JLabel("Scores");
		ptsLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ptsLable.setBounds(178, 277, 100, 30);
		pts = new JTextField(10);
		pts.setBounds(324, 279, 100, 30);
		rebLable = new JLabel("Rebound");
		rebLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rebLable.setBounds(178, 335, 100, 30);
		reb = new JTextField(10);
		reb.setBounds(324, 335, 100, 30);
		astLable = new JLabel("Assistant");
		astLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		astLable.setBounds(178, 379, 100, 30);
		ast = new JTextField(10);
		ast.setBounds(324, 381, 100, 30);
		
		Container cp = getContentPane();
		getContentPane().setLayout(null);
		cp.add(showButton);
		cp.add(exitButton);
		cp.add(lastNameLable);
		cp.add(lastName);
		cp.add(heightLable);
		cp.add(height);
		cp.add(weightLable);
		cp.add(weight);
		cp.add(ptsLable);
		cp.add(pts);
		cp.add(rebLable);
		firstNameLable = new JLabel("First Name");
		firstNameLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		firstNameLable.setBounds(81, 103, 80, 30);
		cp.add(firstNameLable);
		firstName = new JTextField(10);
		firstName.setBounds(178, 105, 120, 30);
		cp.add(firstName);
		cp.add(reb);
		cp.add(astLable);
		cp.add(ast);
		showButton.addActionListener(this);
		exitButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		if(e.getSource() == exitButton )
		{
			System.exit(0);
			
		}
		if(e.getSource() == showButton)
		{
		ArrayList<Player> players = new ArrayList<>();
		ReadFile.load(players);
        HeightComparator hcp = new HeightComparator();
        Collections.sort(players,hcp);
        
		for (Player item:players)
		{
			System.out.println(item.toString1());
		}	
		int id = rand.nextInt(players.size());
		
		firstName.setText(players.get(id).getFirstName());
		lastName.setText(players.get(id).getLastName());
		height.setText(Double.toString(players.get(id).getHeight()) + "cm");
		weight.setText(Double.toString(players.get(id).getWeight()) + "kg");
		pts.setText(Double.toString(players.get(id).getPts()));
		reb.setText(Double.toString(players.get(id).getReb()));
		ast.setText(Double.toString(players.get(id).getAst()));
	     }
		}

}
