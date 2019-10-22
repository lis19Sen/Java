package graphs;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.JTabbedPane;

public class PieGraphTab extends JFrame {

	private JPanel contentPane;
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PieGraphTab frame = new PieGraphTab();
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
	public PieGraphTab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(25, 24, 530, 439);
		contentPane.add(tabbedPane);
		//createAPieGraphTab();
		createALineCharTab();
	    createAPieGraphTab();
	    createABarChartTab();
	}
	public void createAPieGraphTab() {
		
		DefaultPieDataset data = new DefaultPieDataset();
		data.setValue("Principal Lecturer", 5);
		data.setValue("Lecturer", 7);
		data.setValue("Administration", 2);
		//create a chart
		JFreeChart chart = ChartFactory.createPieChart("Sample pie Chart", data, true, true, Locale.ENGLISH);
		
		//create and display a frame
		ChartPanel mypanel = new ChartPanel(chart);
		mypanel.setVisible(true);
		
		tabbedPane.add("Pie Graph", mypanel);
		
	}
	public void createALineCharTab() {
		XYSeries series1 = new XYSeries("Wehghe and Exercise");
		series1.add(45, 300);
		series1.add(50, 250);
		series1.add(55, 200);
		series1.add(60, 150);
		series1.add(65, 100);
		series1.add(70, 50);
		
		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series1);
		
		//create the chart...
		//JFreeChart chart = ChartFactory.createXYLineChart("Wehghe and Exercise", "Kilograms", "Minutes", dataset)
	    JFreeChart chart = ChartFactory.createXYLineChart("Wehghe and Exercise", "Kilograms", "Minutes", 
	    		dataset, PlotOrientation.HORIZONTAL, true, true, true);
	    XYPlot plot = chart.getXYPlot();
	    
	    //the Y axis is the domain axis
	    NumberAxis domain = (NumberAxis) plot.getDomainAxis();
	    domain.setRange(45,80);
	    domain.setTickUnit(new NumberTickUnit(5));
	    domain.setVerticalTickLabels(true);
	    
	    //the X axis is the range axis
	    NumberAxis range = (NumberAxis) plot.getDomainAxis();
	    domain.setRange(0,450);
	    domain.setTickUnit(new NumberTickUnit(50));
	    ChartPanel mypanel2 = new ChartPanel(chart);
	    tabbedPane.add("Line Graph", mypanel2);  
	}
	
	private void createABarChartTab() {
		//create a dataset
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		//the middle parameter is the series name
		dataset.addValue(70,"Java", "2007");
		dataset.addValue(80,"Java", "2008");
		dataset.addValue(85,"Java", "2009");
		dataset.addValue(90,"Java", "2010");
		dataset.addValue(95,"Java", "2011");
		JFreeChart chart = ChartFactory.createBarChart("Java Completion Rates", "Years", "Percentages", 
				dataset, PlotOrientation.VERTICAL, true, true, false);
		ChartPanel mypanel3 = new ChartPanel(chart);
		tabbedPane.add("Bar Chart", mypanel3);
	}
}
