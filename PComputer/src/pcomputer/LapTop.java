package pcomputer;

public class LapTop extends Computer
{
    private static final String DEFAULT_MAN = "hp";
	private double screenSize;
	private double weight;
	public LapTop(String manufacture, String processer, int ramSize, int diskSize,double screenSize,double weight) {
		
		super(manufacture, processer, ramSize, diskSize);
		// TODO Auto-generated constructor stub
		this.screenSize = screenSize;
		this.weight = weight;
	}
	
	//set default manufacture
	public LapTop(String processer,int ramSize,int diskSize, double screenSize,double weight)
	{
	this(DEFAULT_MAN,processer,ramSize,diskSize,screenSize,weight);	
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "LapTop [screenSize=" + screenSize + ", weight=" + weight + ", manufacture=" + manufacture
				+ ", processer=" + processer + ", ramSize=" + ramSize + ", diskSize=" + diskSize + ", getScreenSize()="
				+ getScreenSize() + ", getWeight()=" + getWeight() + "]";
	}

	
	



}
