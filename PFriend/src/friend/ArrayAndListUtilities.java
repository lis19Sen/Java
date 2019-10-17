package friend;

import java.util.ArrayList;

public class ArrayAndListUtilities {
	public static int findMax(int[] numbers)
	{
		int max = numbers[0];
		for(int item:numbers)
		{
			if(item > max)
			{
				max = item;
			}
		}
		return max;
	}
	
	public static int findMax(ArrayList<Integer> numbers)
	{
		int max = numbers.get(0);
		for(Integer item:numbers)
		{
			if(item > max)
			{
				max = item;
			}
		}
		return max;
	}

	public static int findMin(int[] numbers)
	{
		int min = numbers[0];
		for(int item:numbers)
		{
			if(item < min)
			{
				min = item;
			}
		}
		return min;
	}
	public static int findMin(ArrayList<Integer> numbers)
	{
		int min = numbers.get(0);
		for(Integer item:numbers)
		{
			if(item > min)
			{
				min = item;
			}
		}
		return min;
	}
	
	public static String findIt(int[] numbers, int wanted)
	{
		String stringWanted = Integer.toString(numbers[0]);
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i]== wanted)
			{
				stringWanted = Integer.toString(numbers[i]);
			}
		}
		return stringWanted;
	}
	
	public static void bubbleSort1(int[] numbers)
	{
		int temp;
		for(int i = 0; i < numbers.length - 1; i ++)
		{
			for(int j = i; j < numbers.length - 1; j++)
			{
				if(numbers[j] > numbers[j+1])
				{
					temp = numbers[j];
					numbers[j+1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}
	public static void bubbleSort1(Friend[] array)
	{
		Friend temp;
		for(int i = 0; i < array.length - 1; i ++)
		{
			for(int j = 0; j < array.length - 1; j++)
			{
				if(array[j].getLastName().compareTo(array[j+1].getLastName()) > 0)
				{
					temp = array[j];
				    array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSort2(int[] numbers)
	{
		int temp;
		//int earlier= 1;
		for(int i = 0; i < numbers.length - 1; i ++)
		{
			for(int j = i; j < numbers.length - 1- i; j++)
			{
				if(numbers[j] > numbers[j+1])
				{
					temp = numbers[j];
					numbers[j+1] = numbers[j];
					numbers[j] = temp;
					//earlier++;
				}
			}
		}
	}
	
	public static void bubbleSort3(int[] numbers)
	{
		Boolean sorted = false;
		int temp;
		while(sorted)
		{
			sorted = true;
			
			
		}
	}
	
	public static void selectionSort(int[] numbers)
	{
		int temp;
		for(int i = 0; i < numbers.length-1; i++)
		{
			int smallestPos = i;
			for(int j = 0; j < numbers.length -1; j++ )
			{
				if(numbers[smallestPos] > numbers[j+1])
				{
				   smallestPos = j+1;
				   if(smallestPos != i)
				   {
				   temp = numbers[smallestPos];
				   numbers[smallestPos] = numbers[i];
				   numbers[i] = temp;
				   }
				}
				
			}		
			}
	}
		
		public static void bucketSort1(int[] numbers1)
		{
			int length = findMax(numbers1);
			int[] buckets = new int[length + 1];
			
			for(int i = 0; i < numbers1.length; i++)
			{
				buckets[numbers1[i]] = buckets[numbers1[i]] +1;
			}
			
			int i = 0;
			for(int b = 0; b < buckets.length; b++)
			{
				
				if(buckets[b] != 0)
				{
					int numberCount = buckets[b];
					for(int j = 0; j < numberCount; j++)
					{
						numbers1[i] = b;
						i++;
					}
				}
			}
		}
		
		public static String binarySearch(int[] numbers, int wanted)
		{
		    String found = null; 
			bubbleSort1(numbers);
		     int L = 0;
		     int R = numbers.length - 1;
		     int M = (L + R)/2;
		     
		     if(numbers[M] == wanted)
		     {
		    	 return ("found at position "); 
		     }
		     else 
		     {
		         if(numbers[M] < wanted)
		         {
		    	    R = M - 1;
		         }
		         if(numbers[M] > wanted)
		         {
		        	L = M + 1;
		         }
		     }
		     while(L < R)
		     {
		    	 return "-1";
		     }
		     return found;
		}
}

	
