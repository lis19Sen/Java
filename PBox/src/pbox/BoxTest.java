package pbox;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoxTest {

	@Test
	void testGetLength() {
	     Box box = new Box(2);
	     assertEquals(box.getHeight(), 2);
	}
	@Test
	void testGetLength1() {
	     Box box = new Box(2,3,4);
	     assertEquals(box.getHeight(), 2);
	}

	@Test
	void testSetLength() {
	    Box box = new Box(2,3,4);
	    box.setLength(10);
	    assertEquals(box.getLength(), 10);
	}

	@Test
	void testGetWidth() {
		fail("Not yet implemented");
	}

	@Test
	void testSetWidth() {
		fail("Not yet implemented");
	}

	@Test
	void testGetHeight() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHeight() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcVolume() {
	    Box box = new Box(2,3,4);
	    box.setHeight(3);
	    assertEquals(box.calcVolume(), 36);
	}

	@Test
	void testCalcSruvaceArea() {
	    Box box = new Box(2);
	    assertEquals(box.calcSruvaceArea(), 16);
	}

	@Test
	void testToString() {
	     Box box = new Box(2);
	     assertEquals(box.toString(), "Height is 2.0, Width is 2.0, Length is 2.0.");
	     System.out.println(box.toString());
	}

}
