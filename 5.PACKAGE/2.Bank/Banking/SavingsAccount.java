package Banking;

public class SavingsAccount extends Account 
{
	public void withdraw(int amount) 
	{
		if(amount > wth_limit) 
			System.out.println("Withdrawl limit exceeded!");
		else 
		{
			if(balance >= amount)
				balance -= amount;
			else
				System.out.println("Insufficient Balance");

		}
	}

	public void deposit(int amount) 
	{
		if(balance < bal_limit) 
		{
			balance += (amount - 20);
			System.out.println("Deposited with fine deduction!");
		} 
		else 
		{
			balance += (amount);
			System.out.println("Deposited!");
		}
	}
}
