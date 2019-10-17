package parraylist;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<>();
		int num1 = 1;
		int num2 = 2;
		int num3 = 235;
		numbers.add(num1);
		numbers.add(num2);
		numbers.add(0, num3);
		for(Integer item:numbers)
		{
			System.out.print(item + " ");
		}
		System.out.println();
		int[] nums = {1, 2 , 235};
		for(int item:nums)
		{
			
			System.out.print(item + " ");
		}
	}

}
