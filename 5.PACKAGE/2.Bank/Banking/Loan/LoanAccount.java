package Banking.Loan;

import Banking.*;

public class LoanAccount extends SavingsAccount 
{
	int emi;
	double rate;
	int tenure;

	public LoanAccount(int principal, double rate, int tenure) 
	{
		balance = principal;
		rate = rate / 12;
		emi = (int) (principal * rate * (1 + rate) * tenure / ((1 + rate) * tenure - 1));
		this.rate = rate;
		this.tenure = tenure;
	}

	public void eliminateEMI() 
	{
		withdraw(this.emi);
		System.out.println("Withdrawn EMI: " + this.emi);
	}

	@Override
	public void deposit(int amount) 
	{
		System.out.println("Loan deposited successfully!");
		balance -= amount;
	}
}
