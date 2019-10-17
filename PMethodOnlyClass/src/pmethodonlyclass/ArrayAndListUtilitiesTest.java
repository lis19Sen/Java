package pmethodonlyclass;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class ArrayAndListUtilitiesTest {

	@Test
	void testFindMaxIntArray() {
	      int[] numbers = {2,5,8,3,4,9};
	      assertEquals(9, ArrayAndListUtilities.findMax(numbers));
	      int[] numbers1 = {9,5,8,3,4,2};
	      assertEquals(9, ArrayAndListUtilities.findMax(numbers1));
	}

	@Test
	void testFindMaxArrayListOfInteger() {
		  ArrayList<Integer> numbers = new ArrayList<Integer>();
		  ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		  numbers.add(13);
		  numbers.add(1);
		  numbers.add(5);
		  numbers.add(7);
		  numbers.add(15);
		  assertEquals(15, ArrayAndListUtilities.findMax(numbers));
		  //assertEquals(15, ArrayAndListUtilities.findMax(numbers1));
		   try
		  {
			  assertEquals(16, ArrayAndListUtilities.findMax(numbers1));

		  }
		  catch(IndexOutOfBoundsException e)
		  {
			  System.out.println(e.getMessage());
		  }
	}

	@Test
	void testFindMinIntArray() {
		int[] numbers = {9,5,8,3,4,2};
	      assertEquals(2, ArrayAndListUtilities.findMin(numbers));
	      int[] numbers1 = new int[5];
	      assertEquals(0, ArrayAndListUtilities.findMin(numbers1));
	}


	@Test
	void testFindMinArrayListOfInteger() {
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		  numbers.add(13);
		  numbers.add(1);
		  numbers.add(5);
		  numbers.add(7);
		  numbers.add(9);
		  assertEquals(1, ArrayAndListUtilities.findMin(numbers));
	}
	@Test
	void testFindItIntArray() {
	      int[] numbers = {2,5,8,3,4,9};
	      assertEquals("Found number 2 at positon 0", ArrayAndListUtilities.findIt(numbers, 2));
	      assertEquals("Not found", ArrayAndListUtilities.findIt(numbers, 7));      
	}
	@Test
	void testFindItIntArrayList() {
		  ArrayList<Integer> numbers = new ArrayList<Integer>();
		  //ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		  numbers.add(13);
		  numbers.add(1);
		  numbers.add(5);
		  numbers.add(7);
		  numbers.add(15);
		  numbers.add(2);
		  numbers.add(5);
		  numbers.add(5);
	      assertEquals("Found number 5 at positon 3Found number 5 at positon 7Found number 5 at positon 8", ArrayAndListUtilities.findIt(numbers, 5));
	      assertEquals("Not found", ArrayAndListUtilities.findIt(numbers, 10));     
	}
	@Test
	public void testBubbleSortIntArray() {
	      int[] numbers = {5,2,8,3,4,9};
	      int[] expected = {2,3,4,5,8,9};
	      ArrayAndListUtilities.bubbleSort1(numbers);
	      assertArrayEquals(expected, numbers);;
	}
}
