package pbucketsort;

public class BucketSort {
	
	
	
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

	public static void bucketSort(int[] numbers)
	{
		int bucketArrayLength = findMax(numbers);
		int[] buckets = new int[bucketArrayLength + 1];
		//create a bucket array, the length is the max number in numbers array, all the values are 0
		for(int i = 0; i < buckets.length; i++)
		{
			buckets[i] = 0;
		}
		//count the values in numbers array by increasing the value of buckets array
		for(int i = 0; i <numbers.length; i++  )
		{
			buckets[numbers[i]]++;
		}
		int numPos = 0;
		for(int i = 0; i < buckets.length; i++)
		{
			for(int j= 0; j <buckets[i]; j++ )
			{
				numbers[numPos++] = i;
			}
		}
	}
	
	
}
