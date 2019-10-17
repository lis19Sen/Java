package ptempconv;

public class TempConv {

	private double cel;
	private double fah;
	private double kel;
	
	public TempConv(double celsius)
	{
		setCel(celsius);
	}
	
	public double getCel()
	{
		return cel;
	}
	
	public double getFah()
	{
		//fah = (cel * 9) / 5 + 32.00;
		return fah;
	}
	
	public double getKel()
	{
		return kel;
	}
	
	public void setCel(double celsius)
	{
		this.cel = celsius;
		fah = (celsius * 9) / 5 + 32.00;
		kel = celsius + 273.15;
	}
	
	public void setFah(double fahrenheit)
	{
		this.fah = fahrenheit;
		cel = (fahrenheit - 32.00) * 5 / 9;
		kel = (fahrenheit - 32.00) * 5 / 9 +273.15; 
	}
	
	public void setKel(double kelvin)
	{
		this.kel = kelvin;
		cel = kelvin - 273.15;
		fah = (kelvin - 273.15) * 9 / 5 + 32.00; 	
	}
	
	public String toString()
	{
		String tempInfo = "Celsius: " + cel + " | Fahrenheit: " + fah + " | Kelvin: "
				+ kel;
		return tempInfo;
	}
}
