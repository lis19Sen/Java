package pbox;

public class Box {

	private double height;
	private double length;
	private double width;
	
	public Box(double rheight, double rlength, double rwidth)
	{
		height = rheight;
		length = rlength;
		width = rwidth;
		
	}
	
	public Box(double squareBase, double rheight)
	{
		length = width = squareBase;
		height = rheight;
	}

	public Box(double size)
	{
		height = length =width = size;
	}
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

	public double calcVolume()
	{
		double V = height * length * width;
		return V;
		
	}
	
	public double calcSruvaceArea()
	{
		double SA = 2 * (length * height * width);
		return SA;
		
	}
	
	public String toString()
	{
		return ("Height is " + height + "," + 
				" Width is " + width  + "," +
				" Length is " + length + ".");
	}
}
