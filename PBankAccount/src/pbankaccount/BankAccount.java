package pbankaccount;

public class BankAccount {

	private double balance;
	
	public BankAccount()
	{
		
		balance = 0.000;
	}

	public double getBalance() {
		return balance;
	}


	
	
	
	public void deposit(double i)
	{
		balance = balance + i;
		
	}
	
	public void withdraw(double i)
	{
		balance = balance - i;
		if(balance < 0.000)
		{
			
			balance = balance - 5.000; 
		}	
	}
	
	public void interest()
	{
		if(balance > 0 )
		balance = ( balance * 0.05) * 0.67 + balance;
		else
		{
			balance = balance;
		}
	}
}
