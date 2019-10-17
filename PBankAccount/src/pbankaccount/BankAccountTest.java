package pbankaccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testGetBalance() {
	 
		BankAccount sen = new BankAccount();
		assertEquals(sen.getBalance(), 0);
	}

	@Test
	void testDeposit() {
		BankAccount sen = new BankAccount();
		sen.deposit(50);
		assertEquals(sen.getBalance(), 50);
	}

	@Test
	void testWithdraw() {
		BankAccount sen = new BankAccount();
		sen.deposit(100);
		sen.withdraw(50);
		assertEquals(sen.getBalance(), 50);
	}
	
	@Test
	void testWithdrawWithPenalty() {
		BankAccount sen = new BankAccount();
		sen.deposit(100.622);
		sen.withdraw(150.238);
		assertEquals(sen.getBalance(), -54.597 , 0.02);
	}
	
	@Test
	void testInterest() {
		BankAccount sen = new BankAccount();
		sen.deposit(-50.00);
		sen.interest();
		assertEquals(sen.getBalance(), -50.00);
	}
	@Test
	void testInterest1() {
		BankAccount sen = new BankAccount();
		sen.deposit(1000.00);
		sen.interest();
		assertEquals(sen.getBalance(), 1033.50);
	}

	
}
