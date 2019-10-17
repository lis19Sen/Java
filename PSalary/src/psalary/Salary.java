package psalary;

public class Salary {

	private double gross; 
    
    

	   public Salary(double rgross)  

	   { 

	   gross = rgross; 

	   } 

	    

	public double getGross() { 

	return gross; 

	} 

	 

	public void setGross(double gross) { 

	this.gross = gross; 

	} 

	 

	public double getTax() 

	{ 
       
	   double tax; 
	   final double level1 = 14000.000;

	   if(gross > 70000.000) 

	   { 

	   tax = (gross - 70000.000) * 0.330 + 22000.000 * 0.300 

	   + 34000.000 * 0.175 + level1 * 0.105; 

	   } 

	   else if(gross > 48000.000) 

	   { 

	   tax = (gross - 48000.000) * 0.300 + 34000.000 * 0.175  

	   + 14000.000 * 0.105; 

	   } 

	   else if(gross > 14000.000) 

	   { 

	   tax = (gross - 14000.000) * 0.175 + 14000.000 * 0.105; 

	   } 

	   else if(gross > 0)

	   { 

	   tax = gross * 0.105; 

	   } 
	   
	   else
	   {
		   tax = 0.000;
	   }

	   return tax; 

	} 

	 

	public double getNet() 

	{ 

	   double net; 

	   net = gross - getTax(); 

	   return net; 

	} 
}
