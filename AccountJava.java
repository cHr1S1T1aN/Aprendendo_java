public class TestAccount
{
	private double balance;
	public Account( double initialBalance )
	{	
		if ( initialBalance > 0.0)
		{
			balance = initialBalance;
		}
	}
	public void credit( double amount )
	{
		balance += amount;
	}
	public double getBalance()
	{
		System.out.println("O valor do saldo é: " + balance);
	}
} 