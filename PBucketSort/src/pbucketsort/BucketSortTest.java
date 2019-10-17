package pbucketsort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BucketSortTest {

	@Test
	void testFindMax() {
		
       int[] numbers = {4,3,5,5,7,10,10,10,2,2};
       int[] expect = {2,2,3,4,5,5,7,10,10,10};
       BucketSort.bucketSort(numbers);
       assertArrayEquals(expect,numbers);
       

	}



	

}
