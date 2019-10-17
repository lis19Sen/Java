package psalary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryTest {

	@Test 
	void testGetGross() { 
	     Salary sen = new Salary(10000.000); 
	     assertEquals(sen.getGross(), 10000.0009, 0.001); 

	} 
	
	@Test 
	void testSetGross() { 
	     Salary sen = new Salary(10000.000); 
	     sen.setGross(20000.000); 
	     assertEquals(sen.getGross(), 20000.000); 
	} 

	@Test 
	void testGetTax() { 
	     Salary sen = new Salary(60000.000); 
	     assertEquals(sen.getTax(), 11020.000); 
	} 

	@Test
	void testGetTax0() {
		Salary money = new Salary(120000.50);
		assertEquals(30520.17, money.getTax(),0.01);
	}
	
	@Test 
	void testGetTax1() { 
	     Salary money = new Salary(120000.000); 
	     money.setGross(52112);
	     assertEquals(money.getTax(), 8653.6, 0.01); 
	} 
	
	@Test 
	void testGetTax2() { 
	     Salary money = new Salary(120000.500); 
	     money.setGross(44567);
	     assertEquals(money.getTax(), 6819.23, 0.01); 
	} 

	@Test 
	void testGetTax3() { 
	     Salary money = new Salary(120000.500); 
	     money.setGross(7623);
	     assertEquals(money.getTax(), 800.42, 0.01); 
	} 
	
	@Test 
	void testGetTax4() { 
	     Salary money = new Salary(120000.500); 
	     money.setGross(-50);
	     assertEquals(money.getTax(), 0.00, 0.01); 
	} 
	
	@Test 
	void testGetTax5() { 
	     Salary money = new Salary(123456.500); 
	     
	     assertEquals(money.getTax(), 31660.645, 0.01); //delta 0.01 means actual from 31660.45 - 36110.54 all works
	} 
	@Test 
	void testGetNet() { 
	     Salary money = new Salary(120000.500); 
	     money.setGross(7623);
	     assertEquals(money.getNet(), 6822.59, 0.01); 
	} 
	
	@Test 
	void testGetNet0() { 
	     Salary money = new Salary(120000.500); 
	     money.setGross(-50);
	     assertEquals(money.getNet(), -50.00, 0.01); 
	} 
	
	@Test
    public void dalesTestSuiteForTax()
    {
	//the instructor's test suite for tax
	Salary money = new Salary(120000.50);
	assertEquals(30520.17, money.getTax(),0.01);
	money.setGross(52112);
	assertEquals(8653.6, money.getTax(),0.01);
	money.setGross(44567);
	assertEquals(6819.23, money.getTax(),0.01);
	money.setGross(7623);
	assertEquals(800.42, money.getTax(),0.01);
	//a couple more tests
	//these would normally be in separate methods
	//test the net
	assertEquals(6822.59, money.getNet(),0.01);
	//test a negative
	money.setGross(-50);
	assertEquals(0, money.getTax(),0.01);
    }
}
