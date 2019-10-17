package robot;

public class Robot {
	private String name;
	private String fuel;
	private int age;
	
	public Robot(String rName, String rFuel, int rAge)
	{
		name = rName;
		fuel = rFuel;
		age = rAge;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName()
	{
		return name;
		
	}
	
	public void setName(String name)
	{
		
		this.name = name;
	}
	
	public String getFuel()
	{
		
		return fuel;
	}
	
	public void setFuel(String fuel)
	{
		
		this.fuel = fuel;
	} 
}
