package pnbaplayerstatus;

import java.util.ArrayList;

public class UtilitiesClass {

	public static double findMax(ArrayList<Double> numbers)
	{
		double max = numbers.get(0);
		for(double item:numbers)
		{
			if(item > max)
			{
				max = item;
			}
		}
		return max;
	}
	public static double findMin(ArrayList<Double> numbers)
	{
		double min = numbers.get(0);
		for(Double item:numbers)
		{
			if(item <= min)
			{
				min = item;
			}
		}
		return min;
	}
}
