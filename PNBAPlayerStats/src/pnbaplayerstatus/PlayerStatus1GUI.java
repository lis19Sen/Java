package pnbaplayerstatus;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Rectangle;

public class PlayerStatus1GUI extends JFrame implements ActionListener
{

	    private JPanel contentPane;
	    private JTabbedPane tabbedPane;
	    private JPanel showPanel;
	    private JPanel tablePanel;
	    private JPanel panel_2;
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
	    
	    //table field
	    private DefaultTableModel tm = new DefaultTableModel(
				new Object[][] {}, new String[] { "ID", "FirstName", "LastName", "Height", "Weight", "pts", "reb", "ast"}
				);
	    //private JTable table;
		//private JScrollPane scrollPane_1;
		private JTable table_1;
		private JScrollPane scrollPane;


	public PlayerStatus1GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(29, 23, 743, 501);
		contentPane.add(tabbedPane);
		
		Container cp = getContentPane();
		getContentPane().setLayout(null);
		
		showPanel = new JPanel();
		tabbedPane.addTab("Show", null, showPanel, null);
		exitButton = new JButton("Exit");
		exitButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		exitButton.setSize(100, 30);
		exitButton.setLocation(581, 324);
		lastNameLable = new JLabel("Last Name");
		lastNameLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lastNameLable.setBounds(337, 85, 71, 19);
		lastName = new JTextField(10);
		lastName.setBounds(418, 86, 96, 20);
		heightLable = new JLabel("Height");
		heightLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		heightLable.setBounds(266, 145, 42, 19);
		height = new JTextField(10);
		height.setBounds(346, 146, 96, 20);
		weightLable = new JLabel("Weight");
		weightLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		weightLable.setBounds(266, 190, 46, 19);
		weight = new JTextField(10);
		weight.setBounds(346, 191, 96, 20);
		ptsLable = new JLabel("Scores");
		ptsLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ptsLable.setBounds(266, 243, 43, 19);
		pts = new JTextField(10);
		pts.setBounds(346, 244, 96, 20);
		rebLable = new JLabel("Rebound");
		rebLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rebLable.setBounds(266, 286, 57, 19);
		reb = new JTextField(10);
		reb.setBounds(346, 287, 96, 20);
		astLable = new JLabel("Assistant");
		astLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		astLable.setBounds(266, 330, 59, 19);
		ast = new JTextField(10);
		ast.setBounds(346, 331, 96, 20);
		showPanel.setLayout(null);
		showPanel.add(exitButton);
		showPanel.add(lastNameLable);
		showPanel.add(lastName);
		showPanel.add(heightLable);
		showPanel.add(height);
		showPanel.add(weightLable);
		showPanel.add(weight);
		showPanel.add(ptsLable);
		showPanel.add(pts);
		showPanel.add(rebLable);
		
		showButton = new JButton("Show");
		showButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		showButton.setBounds(581, 280, 100, 30);
		showPanel.add(showButton);
		showButton.addActionListener(this);
		firstNameLable = new JLabel("First Name");
		firstNameLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		firstNameLable.setBounds(119, 85, 72, 19);
		showPanel.add(firstNameLable);
		firstName = new JTextField(10);
		firstName.setBounds(201, 86, 96, 20);
		showPanel.add(firstName);
		showPanel.add(reb);
		showPanel.add(astLable);
		showPanel.add(ast);
		exitButton.addActionListener(this);
	
		
		tablePanel = new JPanel();
		tabbedPane.addTab("Table", null, tablePanel, null);
		
		scrollPane = new JScrollPane();
		tablePanel.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setBounds(new Rectangle(1, 1, 1, 0));
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "FirstName", "LastName", "Height", "Weight", "pts", "reb", "ast"
			}
		));
		table_1.setModel(tm);
		drawTable();
		
		createAPieGraphTab();
		panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
	}
	private void drawTable() {
		ArrayList<Player> players = new ArrayList<>();
		ReadFile.load(players);
        HeightComparator hcp = new HeightComparator();
        Collections.sort(players,hcp);
		tm.setRowCount(0);
		for (int i = 0; i < players.size(); i++)
		{
			Object[] object = new Object[100];
			object[0] = Integer.toString(i+1);
			object[1] = players.get(i).getFirstName();
			object[2] = players.get(i).getLastName();
			object[3] = Double.toString(players.get(i).getHeight());
			object[4] = Double.toString(players.get(i).getWeight());
			object[5] = Double.toString(players.get(i).getPts());
			object[6] = Double.toString(players.get(i).getReb());
			object[7] = Double.toString(players.get(i).getAst());
			tm.addRow(object);
		}
	}
	public void createAPieGraphTab() {
		ArrayList<Player> players = new ArrayList<>();
		ArrayList<Double> playerHeight = new ArrayList<>();
		ReadFile.load(players);
		for (int i = 0; i< players.size(); i++)
		{
			playerHeight.add(players.get(i).getHeight());
		}
		int highCount=0;//more than 200.00cm
		int mediumCount=0;
		int notHighCount=0;
		for(Double item:playerHeight)
		{
			if(item >= 200.00)
			{
				highCount++;
			}
			else if(item >= 190.00)
			{
				mediumCount++;
			}
			else
			{
				notHighCount++;
			}
		}
        HeightComparator hcp = new HeightComparator();
        Collections.sort(players,hcp);
        
        
        
		DefaultPieDataset data = new DefaultPieDataset();
		data.setValue("Moer than 200.00cm", highCount);
		data.setValue("Moer than 190.00", mediumCount);
		data.setValue("Less than 190.00", notHighCount);
		//create a chart
		JFreeChart chart = ChartFactory.createPieChart("Player height pie Chart", data, true, true, Locale.ENGLISH);
		
		//create and display a frame
		ChartPanel mypanel = new ChartPanel(chart);
		mypanel.setVisible(true);
		
		tabbedPane.add("Pie Graph", mypanel);
		
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
