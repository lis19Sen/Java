package prandomnumber;

import java.util.Random;

public class RandomNumber {

	private int[] ranNums;
	private Random rand;
	
	public RandomNumber(int number)
	{
		number = 10;
		ranNums = new int[number];
		rand = new Random();
		fillNums();
		
	}
	
	public void fillNums()
	{
		//Random rand = new Random();
		for(int i = 0; i < ranNums.length; i++)
		{
			ranNums[i] = rand.nextInt(100);
		}
	}
	
	public String toString()
	{
		StringBuilder numString = new StringBuilder();
		String asdf =null;
		for(int i = 0; i < ranNums.length; i++)
		{
			//numString.append( Integer.toString(ranNums[i]) + "$");
			asdf = asdf + Integer.toString(ranNums[i])+"$";
		}
		//return numString.toString();
		return asdf;
	}
	
}
